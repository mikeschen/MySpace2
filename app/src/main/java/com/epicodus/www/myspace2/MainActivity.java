package com.epicodus.www.myspace2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mBlogButton;
    private EditText mBlogEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBlogEditText = (EditText) findViewById(R.id.blogEditText);
        mBlogButton = (Button) findViewById(R.id.blogButton);
        mBlogButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String blog = mBlogEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, BlogActivity.class);
                intent.putExtra("blog", blog);
                startActivity(intent);
            }
        });
//        TextView textViewCustom = (TextView) findViewById(R.id.textViewCustomFont);
//        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/Carnetdevoyage.ttf");
//        textViewCustom.setTypeface(myCustomFont);
    }
}
