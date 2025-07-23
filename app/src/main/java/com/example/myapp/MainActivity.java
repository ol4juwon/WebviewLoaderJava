package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText linkInput;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitBtn = findViewById(R.id.submitBtn);
        linkInput = findViewById(R.id.linkInput);



            submitBtn.setOnClickListener(view -> {;
                String link = linkInput.getText().toString().trim();
                if(TextUtils.isEmpty(link)){
                    Toast.makeText(MainActivity.this, "Please enter a valid link: "+link, Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "link "+link, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                    intent.putExtra("link", link);
                    startActivity(intent);
                }
            });


    }
}
