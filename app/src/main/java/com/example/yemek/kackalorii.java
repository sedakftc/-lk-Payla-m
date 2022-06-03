package com.example.yemek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kackalorii extends AppCompatActivity {
    private Button anasayfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kackalorii);
        anasayfa=(Button) findViewById(R.id.nepisirHome);
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anasayfa=new Intent(kackalorii.this,MainActivity3.class);
                startActivity(anasayfa);
            }
        });
    }
}