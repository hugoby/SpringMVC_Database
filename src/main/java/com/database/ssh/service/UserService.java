package com.database.ssh.service;

import com.database.ssh.po.User;

import java.util.List;

/**
 * Package_name com.database.ssh.service
 * Project_name SpringMVC_Database
 * Created by lenovo on 2016/8/6 10:41
 */

public interface UserService {
    public String addUser(User user);
    public List<User> findUserByName(String name);
    public List<User> listAll();
}
