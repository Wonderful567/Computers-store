package com.xm.store.service;

import com.xm.store.pojo.User;

public interface IUserService {
    public void reg(User user);

    public User login(String username,String password);

    public void changePassword(Integer uid, String username, String oldPassword, String newPassword);

    //修改用户资料
    void changeInfo(Integer uid, String username, User user);

    User getByUid(Integer uid);

    //String avatar 用户新头像的路径
    void changeAvatar(Integer uid, String username, String avatar);

}
