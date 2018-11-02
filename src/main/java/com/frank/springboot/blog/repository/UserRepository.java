package com.frank.springboot.blog.repository;

import com.frank.springboot.blog.demain.User;

import java.util.List;

/*
   User Repository 接口
 */
public interface UserRepository {

    User saveOrUpdateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> listUsers();

}
