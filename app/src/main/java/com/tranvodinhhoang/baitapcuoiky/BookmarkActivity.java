package com.tranvodinhhoang.baitapcuoiky;

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

public class BookmarkActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Post> postList;
    PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bookmark);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.IdMainBookMark), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        postList = new ArrayList<>();
        Post post1 = new Post("Mr.Hoang", "Sáng nay ăn gì?", null);
        Post post2 = new Post("Mr.Hoang", "Sáng nay ăn gì?", null);
        Post post3 = new Post("Mr.Hoang", "Sáng nay ăn gì?", null);
        Post post4 = new Post("Mr.Hoang", "Sáng nay ăn gì?", null);
        Post post5 = new Post("Mr.Hoang", "Sáng nay ăn gì?", null);
        postList.add(post1);
        postList.add(post2);
        postList.add(post3);
        postList.add(post4);
        postList.add(post5);
        recyclerView = findViewById(R.id.IdRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        postAdapter = new PostAdapter(this, postList);
        recyclerView.setAdapter(postAdapter);
    }

    private void setupList() {

    }
}
