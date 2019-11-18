package com.ssm.gbq.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;


public class User {

    /**
     * 用户Model
     * @author 阿前
     *
     */
        private Integer id;
        /**
         * 用户名
         */
        private String username;
        /**
         * 姓名
         */
        private String name;

        /**
         * 备注/标签
         */
        private String password;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 头像地址
     */
        private String pictureAddrass;
    private MultipartFile file;
    /**
     *
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
        private Integer createUser;
    /**
     * 修改时间
     */
        private Date updateTime;
    /**
     * 修改人
     */
        private Integer updateUser;
    /**
     * 状态
     */
    private Integer state;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", pictureAddrass='" + pictureAddrass + '\'' +
                ", file=" + file +
                ", createTime=" + createTime +
                ", createUser=" + createUser +
                ", updateTime=" + updateTime +
                ", updateUser=" + updateUser +
                ", state=" + state +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPictureAddrass() {
        return pictureAddrass;
    }

    public void setPictureAddrass(String pictureAddrass) {
        this.pictureAddrass = pictureAddrass;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}

