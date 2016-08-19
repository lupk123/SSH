package com.ssh.service.impl;

import com.ssh.dao.UserDao;
import com.ssh.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/8/17.
 */
@Service("userService")
public class UesrServiceImpl implements com.ssh.service.UesrService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    @Resource(name = "userDao")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public  boolean exists(User user) throws Exception{
        return userDao.exists(user);
    }

    @Override
    @Transactional(readOnly = false)
    public  void save(User u) throws Exception{
        userDao.save(u);
    }

    @Override
    public List<User> showUsers() {
        return userDao.showUsers();
    }

    @Override
    public User loadById(int id) {
        return userDao.loadById(id);
    }
}
