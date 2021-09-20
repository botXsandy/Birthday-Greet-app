package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button button;
     EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.userInput);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString();
                Toast.makeText(MainActivity.this, input, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,BirthdayCard.class);
                intent.putExtra("key",input);
                startActivity(intent);
            }
        });
    }
}