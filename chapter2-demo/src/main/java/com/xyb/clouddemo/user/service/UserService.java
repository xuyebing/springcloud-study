package com.xyb.clouddemo.user.service;

import com.xyb.clouddemo.user.dto.UserDto;
import com.xyb.clouddemo.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author yebingxu
 */
public interface UserService {

    /**
     * Get user paging data
     * @param pageable paging parameter
     * @return paging data
     */
    Page<User> getPage(Pageable pageable);

    /**
     * Load specific user data
     * @param id user id
     * @return
     */
    User load(Long id);

    /**
     * Save/update user data
     * @param userDto
     * @return
     */
    User save(UserDto userDto);

    /**
     * Delete specific user data
     * @param id user id
     */
    void delete(Long id);
}
