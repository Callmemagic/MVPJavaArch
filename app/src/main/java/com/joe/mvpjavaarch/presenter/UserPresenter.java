package com.joe.mvpjavaarch.presenter;

import com.joe.mvpjavaarch.bean.UserBean;
import com.joe.mvpjavaarch.model.IUserModel;
import com.joe.mvpjavaarch.model.UserModel;
import com.joe.mvpjavaarch.view.IUserView;

/**
 * author: Joe Cheng
 * Presenter負責把View傳入的資料塞進Model，或是從Model要資料塞回View
 */
public class UserPresenter {
    //宣告View和Model的interface，做值的操作
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView mUserView) {
        this.mUserView = mUserView;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName)
    {
        mUserModel.setId(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id)
    {
        UserBean userBean = mUserModel.load(id);
        mUserView.setFirstName(userBean.getFirstName());
        mUserView.setLastName(userBean.getLastName());
    }
}
