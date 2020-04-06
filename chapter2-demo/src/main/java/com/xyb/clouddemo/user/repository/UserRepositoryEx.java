package com.xyb.clouddemo.user.repository;

import com.xyb.clouddemo.user.entity.User;

import java.util.List;

/**
 * @author yebingxu
 */
public interface UserRepositoryEx {
    List<User> findTopUser(int maxResult);
}
