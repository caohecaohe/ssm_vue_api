package com.ssm.gbq.mapper;
import com.ssm.gbq.model.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
public Integer userInsert(User user);
public List<User> userSelectList(Map map);
public User userSelectByid(User user);
public Integer updateUser(User user);
public Integer deleteUser(User user);
public Integer countId(User user);
public Integer countIdUsername(Map map);
}
