package com.ssm.gbq.dao;

import com.ssm.gbq.model.User;
import gbq.ssm.utils.PageBounds;

import java.util.Map;

public interface UserDao {
    public Integer addUser(User user);
    public PageBounds<User> selectUserList(Map map);
    public User selectUserById(User user);
    public Integer deleteUser(User user);
    public Integer updateUser(User user);
}
