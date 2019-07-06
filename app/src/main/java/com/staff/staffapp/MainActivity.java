package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.staff.staffapp.news.ui.NewsActivity;
//import com.staff.staffapp.school.BusinessSchool;
//import com.staff.staffapp.ui.FAQ;
//import com.staff.staffapp.ui.ListActivity;
//import com.staff.staffapp.ui.ProductLandingActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView mFAQButton;
    CardView mViewProductsButton;
    CardView btn;
    @BindView(R.id.newsActivityButton)
    CardView mNewsActivityButton;
    private CardView mChatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent());
            }
        });

        mFAQButton = (CardView) findViewById(R.id.faq_button);

        mFAQButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                startActivity(intent);
            }
        });

        mNewsActivityButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(intent);
            }
        });

        mChatButton = (CardView) findViewById(R.id.chatButton);
        mChatButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                startActivity(intent);
            }

        });


        mViewProductsButton = (CardView) findViewById(R.id.viewProductsButton);
        mViewProductsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mViewProductsButton) {
            Intent intent = new Intent();
            startActivity(intent);
        }
    }

    
}
