package com.example.hp.audiobooks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UserBooksActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_books);

        findViewById(R.id.b_discover).setOnClickListener(this);
        findViewById(R.id.b_now_playing_title).setOnClickListener(this);
        findViewById(R.id.b_user_book_list_item).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final int clickedViewId = v.getId();

        switch (clickedViewId) {
            case R.id.b_discover: {
                Intent discoverIntent = new Intent(UserBooksActivity.this, DiscoverBooksActivity.class);
                startActivity(discoverIntent);
                break;
            }
            case R.id.b_now_playing_title: {
                Intent bookDetailsIntent = new Intent(UserBooksActivity.this, BookDetailsActivity.class);
                startActivity(bookDetailsIntent);
                break;
            }
            case R.id.b_user_book_list_item: {
                Intent bookDetailsIntent = new Intent(UserBooksActivity.this, BookDetailsActivity.class);
                startActivity(bookDetailsIntent);
                break;
            }
        }
    }
}

