package com.joe.mvpjavaarch.view;

/**
 * author: Joe Cheng
 * View的interface，只宣告setter, getter，實作交給實際畫面(本例為：MainActivity)
 */
public interface IUserView {
    int getId();

    String getFirstName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);
}
