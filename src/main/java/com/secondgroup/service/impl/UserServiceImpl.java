package com.secondgroup.service.impl;

import com.secondgroup.bean.User;
import com.secondgroup.bean.UserExample;
import com.secondgroup.dao.UserMapper;
import com.secondgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author: alex
 * @date: 2020/5/27 11:29 下午
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfoByUsername(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public User checkEmail(String email) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andEmailEqualTo(email);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public boolean regist(User user) {
        user.setStatus(1);
        user.setModifytime(new Date());
        return userMapper.insert(user) == 1;
    }

    @Override
    public User login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andPasswordEqualTo(user.getPassword());
        criteria.andStatusEqualTo(1);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

//    @Override
//    public List<User> getUserList() {
//        UserExample userExample = new UserExample();
//
//        // 条件表达式
//        UserExample.Criteria criteria = userExample.createCriteria();
//        // uid > 3
//        criteria.andUidGreaterThan(3);
//        criteria.andNameLike("%李%");
//        List<User> userList = userMapper.selectByExample(userExample);
//        return userList;
//    }
//
//    @Override
//    public void updateUSer(User user) {
//        // 设置什么值，更新什么字段
//        userMapper.updateByPrimaryKeySelective(user);
//        // 如果不设置更新字段的值，默认为空
////        userMapper.updateByPrimaryKey(user);
//    }
}
