package com.xinxing.springboot.service;

import com.xinxing.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description Jpa UserRepository
 * @Author 54xinxing
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByUserId(Long userId);

    List<User> getUsersByUserAddress(String userAddress);

}
