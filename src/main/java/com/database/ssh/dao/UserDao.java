package com.database.ssh.dao;

import com.database.ssh.po.User;

import java.util.List;

/**
 * Package_name com.database.ssh.dao
 * Project_name SpringMVC_Database
 * Created by lenovo on 2016/8/6 10:39
 */
public interface UserDao {
    public String addUser(User user);
    public List<User> findUserByName(String name);
    public List<User> listAll();

//    public boolean usersLogin(User u);
}