package com.xyb.clouddemo.user.service.impl;

import com.xyb.clouddemo.user.dto.UserDto;
import com.xyb.clouddemo.user.entity.User;
import com.xyb.clouddemo.user.repository.UserRepository;
import com.xyb.clouddemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author yebingxu
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    protected UserRepository userRepository;

    @Override
    public Page<User> getPage(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User load(Long id){
        return userRepository.getOne(id);
    }

    @Override
    @Transactional
    public User save(UserDto userDto) {
        User user = load(userDto.getId());

        if (user == null) {
            user = new User();
        }
        user.setNickname(userDto.getNickname());
        user.setAvatar(userDto.getAvatar());

        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
