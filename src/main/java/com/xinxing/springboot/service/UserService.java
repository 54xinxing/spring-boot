package com.xinxing.springboot.service;

import com.xinxing.springboot.entity.User;

/**
 * @Description TODO
 * @Author 54xinxing
 */
public interface UserService {

    void saveUser(User user);

    User getUserById(Long id);

    String getUserNameById(Long id);
}
