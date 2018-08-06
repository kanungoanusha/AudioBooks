package com.example.hp.audiobooks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DiscoverBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_books);

        findViewById(R.id.b_discover_list_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookDetailsIntent = new Intent(DiscoverBooksActivity.this, BookDetailsActivity.class);
                startActivity(bookDetailsIntent);

            }
        });

        findViewById(R.id.Payment_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentDetailsIntent = new Intent(DiscoverBooksActivity.this, PaymentDetailsActivity.class);
                startActivity(paymentDetailsIntent);
            }
        });
    }
}