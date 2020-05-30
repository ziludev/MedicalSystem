package com.secondgroup.service;

import com.secondgroup.bean.User;

import java.util.List;

/**
 * @author: alex
 * @date: 2020/5/27 11:27 下午
 */

public interface UserService {

//    public List<User> getUserList();
//
//    public void updateUSer(User user);

    public User getUserInfoByUsername(String username);

    public User checkEmail(String email);

    public boolean regist(User user);

    public User login(User user);
}
