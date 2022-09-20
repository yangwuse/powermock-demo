package com.yangwu.power.construction;

/**
 *
 * @author yangWu
 * @date 2022/9/3 21:52
 */
public class UserDao {

    private String username;
    private String password;

    public UserDao(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void insert() {
        throw new UnsupportedOperationException();
    }
}
