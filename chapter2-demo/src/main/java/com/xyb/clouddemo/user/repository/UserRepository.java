package com.xyb.clouddemo.user.repository;

import com.xyb.clouddemo.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yebingxu
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
