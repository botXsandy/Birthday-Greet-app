package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class BirthdayCard extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_card);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String wish = intent.getStringExtra("key");
        String wish2 = "Happy Birthday "+wish;
        textView.setText(wish2);

    }
}