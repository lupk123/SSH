package com.ssh.dao.impl;

import com.ssh.dao.UserDao;
import com.ssh.model.User;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/8/17.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public boolean exists(User user) {
        List<User> users = (List<User>) hibernateTemplate.find("from User user where user.username = '" + user.getUsername() + "'");

        if(users != null && users.size() > 0)
            return true;
        return false;
    }

    @Override
    public void save(User user) {
        hibernateTemplate.save(user);
    }

    @Override
    public List<User> showUsers() {
        return (List<User>) hibernateTemplate.find("from User");
    }

    @Override
    public User loadById(int id) {
        return (User)hibernateTemplate.load(User.class, id);
    }
}
