package com.database.ssh.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Package_name com.database.ssh.util
 * Project_name SpringMVC_Database
 * Created by lenovo on 2016/8/6 10:42
 */
public class InitApplicationContext {

    private static ApplicationContext context = null;

    private InitApplicationContext(){

    }
    public static ApplicationContext getApplicationContext(){
        if(context == null){
            context = new ClassPathXmlApplicationContext("applicationContext.xml");
        }
        return context;
    }
}