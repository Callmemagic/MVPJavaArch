package com.joe.mvpjavaarch.model;

import com.joe.mvpjavaarch.bean.UserBean;

/**
 * author: Joe Cheng
 * 實際資料的來源，可能是API或是DB
 */
public class UserModel implements IUserModel{

    @Override
    public void setId(int id) {

    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public void setLastName(String lastName) {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public UserBean load(int id) {
        return null;
    }
}
