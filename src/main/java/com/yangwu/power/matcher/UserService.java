package com.yangwu.power.construction;

/**
 *
 * @author yangWu
 * @date 2022/9/3 21:51
 */
public class UserService {

    public void save(String username, String password) {

        UserDao userDao = new UserDao(username, password);
        userDao.insert();

    }
}
