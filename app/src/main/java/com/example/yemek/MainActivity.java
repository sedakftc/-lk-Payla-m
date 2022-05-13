package com.example.yemek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button butonone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        butonone=(Button) findViewById(R.id.sayfa1);
        butonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butonone=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(butonone);
            }
        });
    }
}