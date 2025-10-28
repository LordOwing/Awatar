package com.example.awatar;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.GridLayoutManager;


public class MainActivity extends AppCompatActivity {

    private RecyclerView usersRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usersRecyclerView = findViewById(R.id.usersRecyclerView);

        List<User> users = new ArrayList<>();
        users.add(new User("Jan", "Kowalski", R.drawable.avatar1));
        users.add(new User("Anna", "Nowak", R.drawable.avatar2));
        users.add(new User("Piotr", "Zieliński", R.drawable.avatar3));
        users.add(new User("Maria", "Wiśniewska", R.drawable.avatar4));
        users.add(new User("Krzysztof", "Wójcik", R.drawable.avatar5));


        UserAdapter adapter = new UserAdapter(users);
        usersRecyclerView.setAdapter(adapter);


        usersRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}