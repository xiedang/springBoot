package com.xd.service.impl;

import com.xd.dao.UserDao;
import com.xd.model.User;
import com.xd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiedang on 2017/2/10.
 */
@Service
public class UserServiceImpl implements UserService<User> {
    @Autowired
    private UserDao userDao;
    @Override
    public User findById(int id) {
        return userDao.findUserById(id);
    }
}
