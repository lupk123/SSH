package com.ssh.service;

import com.ssh.model.User;

import java.util.List;

/**
 * Created by Administrator on 2016/8/17.
 */
public interface UesrService {
    boolean exists(User user) throws Exception;

    void save(User u) throws Exception;

    public List<User> showUsers();

    public User loadById(int id);
}
