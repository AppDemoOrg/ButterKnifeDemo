package com.abt.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.orhanobut.logger.Logger;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.username) EditText userName;
    @BindView(R.id.password) EditText passWord;

    @BindString(R.string.login_success) String loginSuccess;

    @OnClick(R.id.submit) void submit() {
        Logger.d("submit = "+loginSuccess);
        Toast.makeText(this, ""+loginSuccess, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Logger.d("onCreate = "+loginSuccess);
    }

}
