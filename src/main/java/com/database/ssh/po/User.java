package com.database.ssh.po;

/**
 * Package_name com.database.ssh.po
 * Project_name SpringMVC_Database
 * Created by lenovo on 2016/8/6 10:41
 */
public class User {
    private int id;
    private String name;
    private String password;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}