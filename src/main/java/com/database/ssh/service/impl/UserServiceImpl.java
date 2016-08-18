package com.database.ssh.service.impl;

import com.database.ssh.dao.UserDao;
import com.database.ssh.po.User;
import com.database.ssh.service.UserService;

import java.util.List;

/**
 * Package_name com.database.ssh.service.impl
 * Project_name SpringMVC_Database
 * Created by lenovo on 2016/8/6 10:41
*/
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public String addUser(User user) {

        return userDao.addUser(user);
    }
    @Override
    public List<User> findUserByName(String name) {

        return userDao.findUserByName(name);
    }
    @Override
    public List<User> listAll() {
        return userDao.listAll();
    }
}
