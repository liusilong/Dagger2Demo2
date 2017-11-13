package com.lsl.dagger2demo2.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lsl.dagger2demo2.R;
import com.lsl.dagger2demo2.User;
import com.lsl.dagger2demo2.demo1.component.DaggerUserComponent;
import com.lsl.dagger2demo2.demo1.component.UserComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;
    @Inject
    User user1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserComponent component = DaggerUserComponent.create();
        component.inject(this);
        System.out.println("user.hashCode:" + user.hashCode());
        System.out.println("user1.hashCode:" + user1.hashCode());
    }
}
