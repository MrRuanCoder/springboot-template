package com.hit.controller;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hit.common.Result;
import com.hit.utils.JwtUtil;
import com.hit.entity.User;
import com.hit.entity.UserRole;
import com.hit.service.IUserService;
import com.hit.service.impl.UserRoleServiceImpl;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Ruan
 * @since 2023-05-31
 */
@Api(tags = {"用户接口列表"})      //swagger的注解，对 API 接口进行分组和分类
@RestController                 //方法返回的对象会被自动序列化为 JSON 或其他格式的响应数据
@RequestMapping("/sys/user")
@CrossOrigin                    //跨域处理
public class UserController {

    @Autowired
    private UserRoleServiceImpl userRoleService;

    @Autowired
    private IUserService userService;

    @Autowired  //加密处理
    private PasswordEncoder passwordEncoder;

//    @ApiOperation("查询所有信息")
//    @GetMapping("/all")       /
//    public Result<List<User>> getAllUser(){
//        List<User> list = userService.list();
//        return Result.success(list,"查询成功");
//    }

    @ApiOperation("查询所有信息")
    @GetMapping("/all")
    public Result<List<User>> getAllUser(){
        List<User> list = userService.list();

        for (User user : list) {
            Long roleid = userRoleService.getRoleIdByUserid(user.getUserId());
            user.setRoleId(roleid);
        }

        return Result.success(list,"查询成功");
    }


//    @ApiOperation("用户登录")
//    @PostMapping("/login")    //原始
//    public Result<Map<String,Object>> login(@RequestBody User user){
//
//        Map<String,Object> data = userService.login(user);
//        if(data != null){
//            return Result.success(data);
//        }
//        return Result.fail(20002,"用户名或密码错误");
//    }


    @ApiOperation("用户登录")
    @PostMapping("/login")
    public Result<Map<String,Object>> login(@RequestBody User user){

        Map<String,Object> data = userService.login(user);

        if(data == null) return Result.fail(20002,"用户名或密码错误");

        JwtUtil jwtUtil = new JwtUtil();

        //token解码后添加role相关数据
        String token = (String) data.get("token");
//        Claims claims1 = Jwts.parser().parseClaimsJws(token).getBody();
//        Claims claims = jwtUtil.parseToken(token);
//
//        Map<String, Object> subClaims = claims.get("sub", Map.class);
//        int userId = (int) subClaims.get("userId");

        //从token中解码userid
        Claims claims = jwtUtil.parseToken(token);
        String subString = claims.getSubject();
        Map<String, Object> subClaims = JSON.parseObject(subString, Map.class);
        int userId = (int) subClaims.get("userId");


        Long roleid = userRoleService.getRoleIdByUserid((long) userId);

//        Claims claims = jwtUtil.parseToken(token); // 使用JwtUtil类解析JWT

        claims.put("roleId", roleid);

        //重新生成新token，将添加了 role 数据的 Claims 对象进行签名
        String newToken = jwtUtil.createToken(claims); // 使用您的JwtUtil类创建新的JWT

        data.put("token", newToken);

        if(data != null){
            return Result.success(data);
        }
        return Result.fail(20002,"用户名或密码错误");

    }


    @ApiOperation("查询用户信息")
    @GetMapping("/info")
    public Result<Map<String,Object>> getUserInfo(@RequestParam("token") String token){
        // 根据token获取用户信息
        Map<String,Object> data = userService.getUserInfo(token);
        if(data != null){
            return Result.success(data);
        }
        return Result.fail(20003,"登录信息无效，请重新登录");
    }

    @ApiOperation("登出方法")
    @PostMapping("/logout")
    public Result<?> logout(@RequestHeader("Authorization") String token){    //注意这个token的名字，需要前端token的响应
        userService.logout(token);
        return Result.success();
    }

    @ApiOperation("查询方法")
    @GetMapping("/list")        //查询
    public Result<Map<String,Object>> getUserList(@RequestParam(value = "username",required = false) String username,
                                                  @RequestParam(value = "phone",required = false) String phone,
                                                  @RequestParam(value = "pageNo") Long pageNo,
                                                  @RequestParam(value = "pageSize") Long pageSize){

        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();      //条件构造器，构建数据库查询条件，它是通过 Lambda 表达式来实现
        wrapper.eq(StringUtils.hasLength(username),User::getUsername,username);
        wrapper.eq(StringUtils.hasLength(phone),User::getPhone,phone);
        wrapper.orderByDesc(User::getUserId);    //按id降序

        Page<User> page = new Page<>(pageNo,pageSize);  //可查看这个页和上游页数据
        userService.page(page,wrapper);

        Map<String,Object> data = new HashMap<>();
        data.put("total",page.getTotal());      //返回的前后端约定的参数（这里的total是符合条件的总数据）
        data.put("rows",page.getRecords());

        return Result.success(data);

    }

    @ApiOperation("新增用户")
    @PostMapping("/add")
    public Result<?> addUser(@RequestBody User user){
        Long roleId = user.getRoleId();

        user.setRoleId(null);

        user.setPassword(passwordEncoder.encode(user.getPassword()));   //密码加密

        userService.save(user);

        Long userId = user.getUserId();

        UserRole ur = new UserRole();
        ur.setUserId(userId);
        ur.setRoleId(roleId);
        userRoleService.save(ur);

        Map<String, Object> data = new HashMap<>();
        data.put("userId", userId);

        return Result.success(data,"新增用户成功");
    }




    @ApiOperation("修改用户信息")
    @PutMapping
    public Result<?> updateUser(@RequestBody User user){
//        user.setPassword(null);
        userService.updateById(user);       //已传入的字段如果为空，该字段是不会更新的

        if (user.getUserId() == null) {
            return Result.fail(20003, "用户ID为空");
        }
        userService.updateById(user);
        return Result.success("修改用户成功");
    }

    @ApiOperation("通过id查询用户数据")
    @GetMapping("/{id}")
    public Result<User> getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);

        Long roleid = userRoleService.getRoleIdByUserid(user.getUserId());

        user.setRoleId(roleid);

        return Result.success(user);
    }

    @ApiOperation("通过id删除用户")
    @DeleteMapping("/{id}")
    public Result<User> deleteUserById(@PathVariable("id") Integer id){
        userService.removeById(id);
        return Result.success("删除用户成功");
    }

}
