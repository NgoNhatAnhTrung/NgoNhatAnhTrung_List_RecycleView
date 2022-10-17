package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvUser;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.maytinh1, "User name 1"));
        list.add(new User(R.drawable.maytinh2, "User name 2"));
        list.add(new User(R.drawable.maytinh3, "User name 3"));
        list.add(new User(R.drawable.maytinh4, "User name 4"));
        list.add(new User(R.drawable.maytinh1, "User name 5"));
        list.add(new User(R.drawable.maytinh2, "User name 6"));

        return list;
    }
}


