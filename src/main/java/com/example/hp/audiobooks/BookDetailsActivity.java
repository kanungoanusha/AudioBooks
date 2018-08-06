package com.example.hp.audiobooks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BookDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_details);

        findViewById(R.id.b_play_book).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userBooksIntent = new Intent(BookDetailsActivity.this, UserBooksActivity.class);
                startActivity(userBooksIntent);
            }
        });

        findViewById(R.id.b_discover_similar_books).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discoverBooksIntent = new Intent(BookDetailsActivity.this, DiscoverBooksActivity.class);
                startActivity(discoverBooksIntent);
            }
        });
    }
}