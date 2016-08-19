package com.ssh.dao;

import com.ssh.model.User;

import java.util.List;

/**
 * Created by Administrator on 2016/8/17.
 */
public interface UserDao {
    public boolean exists(User user);

    public void save(User user);

    public List<User> showUsers();

    public User loadById(int id);
}
