package com.ssm.gbq.dao.impl;

import com.ssm.gbq.dao.UserDao;
import com.ssm.gbq.mapper.UserMapper;
import com.ssm.gbq.model.User;
import gbq.ssm.utils.PageBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;

    public Integer addUser(User user) {
        userMapper.userInsert(user);
        return null;
    }

    public PageBounds<User> selectUserList(Map map) {
        User user=new User();
         int totalSize = userMapper.countId(user);
if(map.get("username")!=null&&!"".equals(map.get("username"))){
    totalSize=userMapper.countIdUsername(map);

}
        int num=0;
        int pageSize=(Integer)map.get("pageSize");
        int currentPage=(Integer)map.get("currentPage");
        if(currentPage==1){
            num=0;
        }else{
            num=pageSize*(currentPage-1);
        }
        PageBounds<User> pageBounds = new PageBounds<User>(currentPage,totalSize, pageSize);
        map.put("num",num);
        map.put("currentPage",currentPage);
        List<User> list = userMapper.userSelectList(map);
        pageBounds.setPageList(list);
        return  pageBounds;
    }

    public User selectUserById(User user) {
        return userMapper.userSelectByid(user);
    }

    public Integer deleteUser(User user) {
        return userMapper.deleteUser(user);
    }

    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
