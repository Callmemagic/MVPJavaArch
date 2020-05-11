package com.joe.mvpjavaarch.model;

import com.joe.mvpjavaarch.bean.UserBean;

/**
 * author: Joe Cheng
 * Model的interface，只宣告setter, getter，實作交給實際資料來源像是資料庫或是API(本例為：UserModel)
 */
public interface IUserModel {
    void setId(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    int getId();

    UserBean load(int id);
}
