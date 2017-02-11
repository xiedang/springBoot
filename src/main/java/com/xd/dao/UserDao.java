package com.xd.dao;

import com.xd.model.User;
import java.util.List;

/**
 * Created by xiedang on 2016/12/7.
 */
public interface UserDao {
     List<User> getAllUsers();
     User findUserById(int id);
}
