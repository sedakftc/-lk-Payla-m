package com.example.yemek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    private ImageButton soup;
    private Button pisir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        soup=(ImageButton) findViewById(R.id.btn_corbalar);
        soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent soup=new Intent(MainActivity3.this,Corbalar.class);
                startActivity(soup);

            }
        });

        pisir=(Button) findViewById(R.id.btn_pisirsem);
        pisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pisir=new Intent(MainActivity3.this,nepisirsem.class);
                startActivity(pisir);
            }
        });



    }
}