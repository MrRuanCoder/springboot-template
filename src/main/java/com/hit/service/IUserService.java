package com.hit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hit.entity.User;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Ruan
 * @since 2023-05-31
 */
public interface IUserService extends IService<User> {
    Map<String, Object> login(User user);

    Map<String, Object> getUserInfo(String token);

    void logout(String token);
}
