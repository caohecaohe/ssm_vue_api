package com.ssm.gbq.controller;//package com.ssm.gbq.controller;

import com.ssm.gbq.model.User;
import com.ssm.gbq.service.UserService;
import gbq.ssm.utils.PageBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public Map addMsg(@RequestBody User user) {
        user.setCreateUser(1);
        user.setCreateTime(new Date());
        userService.addUser(user);
        Map map = new HashMap();
        map.put("msg", "添加成功");
        map.put("state", 200);
        return map;
    }

    @RequestMapping("update")
    public Map updateMsg(@RequestBody User user) {
        user.setUpdateUser(1);
        user.setUpdateTime(new Date());
        userService.updateUser(user);
        Map map = new HashMap();
        map.put("msg", "添加成功");
        map.put("state", 200);
        return map;
    }

    @RequestMapping("delete")
    public String getAddMsg(Integer id, Boolean state) {
        User user = new User();
        user.setId(id);
        if (state == true) {
            user.setState(1);
        } else if (state == false) {
            user.setState(0);
        }
        userService.deleteUser(user);
        return "删除成功";
    }

    @RequestMapping("tablist")
    public HashMap<String, Object> tablistMsg(int pageSize, int currentPage, String username) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        Map map = new HashMap();
        map.put("pageSize", pageSize);
        map.put("currentPage", currentPage);
        if(username!=null&&!"".equals(username)){
            map.put("username", "%"+username+"%");
        }
        PageBounds<User> pageBounds = userService.selectUserList(map);
        result.put("data", pageBounds);
        return result;
    }
@RequestMapping("userInfo")
    public Map getUserinfo(Integer id) {
        User user=new User();
        user.setId(id);
        Map map=new HashMap();
        map.put( "data", userService.selectUser(user));
        map.put("state",200);
return  map;
    }
}