package com.xd.controllers;

import com.xd.dao.UserDao;
import com.xd.model.User;
import com.xd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by xiedang on 2017/2/9.
 */
@Controller

@Transactional
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService<User> userService;

    //@RequestMapping(value = "/UserList",method = RequestMethod.GET)
    @GetMapping(value = "/UserList")
    public List<User> showUsers() {
        List<User> users = userDao.getAllUsers();
        return users;
    }

    @ResponseBody
    @GetMapping(value = "/{id}/show")
    public User showUser(@PathVariable("id") int id) {
        User user = userService.findById(id);
        return user;
    }
}
