package com.example.asadaboomtham.newsnweatherapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.asadaboomtham.newsnweatherapplication.facebook_data.facebook_Activity;

public class HomeActivity extends AppCompatActivity {

    private LinearLayout linearLayout_AllNews;
    private LinearLayout linearLayout_facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        linearLayout_AllNews = (LinearLayout) findViewById(R.id.linearLayout_AllNews);
        linearLayout_AllNews.setOnClickListener(OnClickListener);
        linearLayout_facebook = (LinearLayout) findViewById(R.id.linearLayout_facebook);
        linearLayout_facebook.setOnClickListener(OnClickListener2);
    }

    private View.OnClickListener OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
    };

        private View.OnClickListener OnClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(getApplicationContext(), facebook_Activity.class );
            startActivity(i);
        }
    };

}

