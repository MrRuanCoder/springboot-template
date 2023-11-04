package com.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hit.entity.UserRole;
import com.hit.mapper.UserRoleMapper;
import com.hit.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ruan
 * @since 2023-05-31
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {
    
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public Long getRoleIdByUserid(Long userId) {
        // 调用userRoleMapper的相应方法查询roleid
        return userRoleMapper.getRoleIdByUserid(userId);
    }
}
