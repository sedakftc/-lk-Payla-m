package com.example.yemek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    private ImageButton soup;
    private Button pisir, pisirr, pisiir, pilavpisir;
    private ImageButton sebze, et, pilav, makarna,meze, tatli, fit;
    private Button mpisir, mezepisir, tatlipisir,fitpsr;




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

        sebze=(ImageButton) findViewById(R.id.btn_sebze);
        sebze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sebze=new Intent(MainActivity3.this,Sebzeler.class);
                startActivity(sebze);
            }
        });

        et=(ImageButton) findViewById(R.id.btn_et);
        et.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Intent et=new Intent(MainActivity3.this,Etyemekleri.class);
                                      startActivity(et);
                                  }
                              });

        pilav=(ImageButton) findViewById(R.id.btn_pilav);
        pilav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pilav= new Intent(MainActivity3.this,Pilav.class);
                startActivity(pilav);
            }
        });

        makarna=(ImageButton) findViewById(R.id.btn_makarna);
        makarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent makarna= new Intent(MainActivity3.this,Makarna.class);
                startActivity(makarna);
            }
        });

        meze=(ImageButton) findViewById(R.id.btn_meze);
        meze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent meze= new Intent(MainActivity3.this,Meze.class);
                startActivity(meze);
            }
        });

        tatli=(ImageButton) findViewById(R.id.btn_tatlı);
        tatli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tatli= new Intent(MainActivity3.this,Tatli.class);
                startActivity(tatli);
            }
        });

        fit=(ImageButton) findViewById(R.id.btn_fit);
        fit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fit= new Intent(MainActivity3.this,Fit.class);
                startActivity(fit);
            }
        });



        pisir = (Button) findViewById(R.id.btn_pisirsem);
        pisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pisir=new Intent(MainActivity3.this,nepisirsem.class);
                startActivity(pisir);
            }
        });


        pisirr=(Button) findViewById(R.id.btn_pisirsem);
        pisirr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pisirr=new Intent(MainActivity3.this,nepisirsem.class);
                startActivity(pisirr);
            }
        });

        pisiir=(Button) findViewById(R.id.btn_pisirsem);
        pisiir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pisiir=new Intent(MainActivity3.this,nepisirsem.class);
                startActivity(pisiir);
            }
        });

       pilavpisir=(Button) findViewById(R.id.btn_pisirsem);
       pilavpisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pilavpisir=new Intent(MainActivity3.this,nepisirsem.class);
                startActivity(pilavpisir);
            }
        });

       mpisir=(Button) findViewById(R.id.btn_pisirsem);
       mpisir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent mpisir=new Intent(MainActivity3.this,nepisirsem.class);
               startActivity(mpisir);
           }
       });

        mezepisir=(Button) findViewById(R.id.btn_pisirsem);
        mezepisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mezepisir=new Intent(MainActivity3.this,nepisirsem.class);
                startActivity(mezepisir);
            }
        });

        tatlipisir=(Button) findViewById(R.id.btn_pisirsem);
        tatlipisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tatlipisir=new Intent(MainActivity3.this,nepisirsem.class);
                startActivity(tatlipisir);
            }
        });

        fitpsr=(Button) findViewById(R.id.btn_pisirsem);
        fitpsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fitpsr=new Intent(MainActivity3.this,nepisirsem.class);
                startActivity(fitpsr);
            }
        });


    }
}