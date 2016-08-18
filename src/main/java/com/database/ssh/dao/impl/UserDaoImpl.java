package com.database.ssh.dao.impl;

import com.database.ssh.dao.UserDao;
import com.database.ssh.po.User;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Package_name com.database.ssh.dao.impl
 * Project_name SpringMVC_Database
 * Created by lenovo on 2016/8/6 10:40
 */
@SuppressWarnings("ALL")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public String addUser(User user) {
        String success = "";
        String name = user.getName();
        if(findUserByName(name).size() == 0){
            try {
                getHibernateTemplate().save(user);
                success = "User saved ok!";
            } catch (DataAccessException e) {
                success = "Sorry, user can't be added.";
            }
        } else {
            success = "The username has been existed!";
        }
        return success;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> findUserByName(String name) {
        return (List<User>) getHibernateTemplate().find("from User where name = ?",name);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> listAll() {

        return (List<User>) getHibernateTemplate().find(" from User ");
    }

//    @Override
//    public boolean usersLogin(User u) {
//        Transaction tx=null;
//        String hql="";
//        try{
//            Session session=MyHibernateSessionFactory.getCurrentSeesion;
//            tx.
//            hql="from users where username=? and password=?";
//            Query query=session.createQuery(hql);
//            query.setParameter(0,u.getName());
//            query.setParameter(1,u.getPassword());
//            List list=query.list();
//            tx.commit();
//            if(list.size()>0){
//                return true;
//            }else{
//                return false;
//            }
//        }catch (Exception ex){
//            ex.printStackTrace();
//            return false;
//        }
//        finally {
//            if(tx!=null){
//                tx=null;
//            }
//        }
//    }
}