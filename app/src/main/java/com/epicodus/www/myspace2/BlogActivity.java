package com.epicodus.www.myspace2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BlogActivity extends AppCompatActivity {
    private TextView mBlogTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        TextView txt = (TextView) findViewById(R.id.blogTextView);
        Typeface font = Typeface.createFromAsset(getAssets(), "Chantelli_Antiqua.ttf");
        txt.setTypeface(font);
        mBlogTextView = (TextView) findViewById(R.id.blogTextView);
        Intent intent = getIntent();
        String blog = intent.getStringExtra("blog");
        mBlogTextView.setText("Blog: " + blog);
    }
}
