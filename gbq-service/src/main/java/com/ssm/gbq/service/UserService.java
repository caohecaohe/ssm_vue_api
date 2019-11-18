package com.ssm.gbq.service;

import com.ssm.gbq.model.User;
import gbq.ssm.utils.PageBounds;

import java.util.Map;

public interface UserService {
    public Integer addUser(User user);
    public PageBounds<User> selectUserList(Map map);
    public User selectUser(User user);
    public Integer updateUser(User user);
    public Integer deleteUser(User user);
}
