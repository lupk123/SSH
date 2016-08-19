package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.dto.UserDto;
import com.ssh.model.User;
import com.ssh.service.UesrService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/8/17.
 */
//@Controller("userAction") 可以不写
//@Scope("prototype") 也可以不写
public class UserAction extends ActionSupport implements ModelDriven{
    UesrService uesrService;
    UserDto userDto = new UserDto();
    private List<User> users;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public UesrService getUesrService() {
        return uesrService;
    }

    @Resource(name = "userService")
    public void setUesrService(UesrService uesrService) {
        this.uesrService = uesrService;
    }

    @Override
    public String execute() throws Exception {
        User user = new User(userDto);

        boolean exists = uesrService.exists(user);

        if(exists)
            return "fail";
        uesrService.save(user);
        return "success";
    }

    @Override
    public Object getModel() {
        this.users = uesrService.showUsers();
        return userDto;
    }

    public String list(){
        this.users = uesrService.showUsers();
//        for(User user : users)
//            System.out.print(user.getUsername());
        return "list";
    }

    public String load(){
        this.user = uesrService.loadById(userDto.getId());
        return "load";
    }
}
