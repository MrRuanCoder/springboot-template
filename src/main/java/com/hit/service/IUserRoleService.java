package com.hit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hit.entity.UserRole;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Ruan
 * @since 2023-05-31
 */
public interface IUserRoleService extends IService<UserRole> {

    Long getRoleIdByUserid(Long userId);
}
