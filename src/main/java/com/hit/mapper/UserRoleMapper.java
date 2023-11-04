package com.hit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hit.entity.UserRole;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Ruan
 * @since 2023-05-31
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {
    Long getRoleIdByUserid(Long userId);
}
