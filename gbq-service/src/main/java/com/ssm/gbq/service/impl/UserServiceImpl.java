package com.ssm.gbq.service.impl;

import com.ssm.gbq.dao.impl.UserDaoImpl;
import com.ssm.gbq.model.User;
import com.ssm.gbq.service.UserService;
import gbq.ssm.utils.PageBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDaoImpl userDao;

    public Integer addUser(User user) {
        userDao.addUser(user);
        return null;
    }

    public PageBounds<User> selectUserList(Map map) {
        return userDao.selectUserList(map);
    }

    public User selectUser(User user) {
        return userDao.selectUserById(user);
    }

    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }

    public Integer deleteUser(User user) {
        return userDao.deleteUser(user);
    }
}
