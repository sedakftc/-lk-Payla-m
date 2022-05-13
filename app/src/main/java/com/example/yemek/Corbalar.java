package com.example.yemek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Corbalar extends AppCompatActivity {
    private ImageButton mercimekT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corbalar);
        mercimekT=(ImageButton) findViewById(R.id.mercimek);
        mercimekT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mercimekT=new Intent(Corbalar.this,mercimektarif.class);
                startActivity(mercimekT);
            }
        });
    }
}