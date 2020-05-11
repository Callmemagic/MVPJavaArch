package com.joe.mvpjavaarch.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.joe.mvpjavaarch.R;
import com.joe.mvpjavaarch.presenter.UserPresenter;

/**
 * 實作IUserView
 */
public class MainActivity extends AppCompatActivity implements IUserView, View.OnClickListener {
    UserPresenter userPresenter;
    TextView id,first,last;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.save).setOnClickListener(this);
        findViewById(R.id.load).setOnClickListener(this);

        id = findViewById(R.id.id);
        first = findViewById(R.id.firstName);
        last = findViewById(R.id.lastName);

        userPresenter = new UserPresenter(this);
    }

    @Override
    public int getId() {
        return new Integer(id.getText().toString());
    }

    @Override
    public String getFirstName() {
        return first.getText().toString();
    }

    @Override
    public String getLastName() {
        return last.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        first.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        last.setText(lastName);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.save:
                userPresenter.saveUser(getId(), getFirstName(), getLastName());
                break;
            case R.id.load:
                userPresenter.loadUser(getId());
                break;
        }
    }
}
