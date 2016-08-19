package com.ssh.model;

import com.ssh.dto.UserDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2016/8/16.
 */
@Entity
public class User {
    private int id;
    private String username;
    private String password;

    public User(){}

    public User(UserDto userDto){
        this.username = userDto.getUsername();
        this.password = userDto.getPassword();
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
