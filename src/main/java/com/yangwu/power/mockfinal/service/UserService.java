package com.yangwu.power.helloworld.service;

import com.yangwu.power.common.User;
import com.yangwu.power.helloworld.dao.UserDao;

/**
 *
 * @author yangWu
 * @date 2022/9/2 23:01
 * @version 1.0
 */
public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int queryUserCount() {
        return userDao.getCount();
    }

    public void saveUser(User user) {
        userDao.insertUser(user);
    }
}
