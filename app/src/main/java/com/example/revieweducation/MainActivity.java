package com.example.revieweducation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.revieweducation.controller.UserManager;
import com.example.revieweducation.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserManager userManager = UserManager.getsInstance();

        ArrayList<User> user = userManager.getUser();
        for (User t : user) {
            System.out.println(t.toString());
        }


    }
}
