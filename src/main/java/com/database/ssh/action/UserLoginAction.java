package com.database.ssh.action;

/**
 * Package_name com.database.ssh.action
 * Project_name SpringMVC_Database
 * Created by lenovo on 2016/8/6 10:37
 */

import com.database.ssh.po.User;
import com.database.ssh.service.UserService;
import com.database.ssh.util.InitApplicationContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class UserLoginAction extends ActionSupport{
    private UserService userService;
    private User user;
    public UserLoginAction() {
        ApplicationContext context = InitApplicationContext.getApplicationContext();
        userService = (UserService) context.getBean("userService");
    }
    @Override
    public String execute() throws Exception {
        System.out.println(user.getName());
        if (!isValid(user.getName())) {
            return INPUT;
        }
        if (!isValid(user.getPassword())) {
            return INPUT;
        }
        if(!userCheck(user)){
            System.out.println("INPUT");
            return INPUT;
        }
        System.out.println("SUCCESS");
//        ActionContext.getContext().getSession().put("user" , user);
//        VerificationCodeUtil vcu = VerificationCodeUtil.Instance();
//        this.setInputStream(vcu.getImage());
//        ActionContext.getContext().getSession().put("random", vcu.getVerificationCodeValue());// 取得随机字符串放入HttpSession
        return SUCCESS;
    }

    public boolean isValid(String keyword) {
        return keyword != null && keyword != "";
    }

    public boolean userCheck(User user) {
        List<User> userList = userService.findUserByName(user.getName());
        if (userList == null || userList.size() < 1) {
            return false;
        }
        User checkUser = userList.get(0);
        System.out.println(checkUser.getName());
        if (user.getName().equals(checkUser.getName()) && user.getPassword().equals(checkUser.getPassword())) {
            return true;
        }
        addActionError("Username or password is wrong, please check!");
        return false;
    }
    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

//    @Override
//    public User getModel() {
//        return user;
//    }
}
