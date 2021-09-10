package com.example.myjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contant extends AppCompatActivity {

    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_contant );
        button_1 = findViewById(R.id.button1);
        button_2 = findViewById(R.id.button2);
        button_3 = findViewById(R.id.button3);
        button_4 = findViewById(R.id.button4);
        button_5 = findViewById(R.id.button5);
        button_6 = findViewById(R.id.button6);
        button_7 = findViewById(R.id.button7);
        button_8 = findViewById(R.id.button8);

        button_1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send_1 = new Intent(contant.this,what_is_java.class);
                startActivity(send_1);
            }
        } );
        button_2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send_2 = new Intent(contant.this,features_of_java.class);
                startActivity(send_2);

            }
        } );
        button_3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send_3 = new Intent( contant.this, oops.class );
                startActivity( send_3 );

            }
        });
        button_4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send_4 = new Intent( contant.this, object_class.class );
                startActivity( send_4 );

            }
        });
        button_5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send_5 = new Intent( contant.this, inheritance.class );
                startActivity( send_5 );

            }
        });
        button_6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send_6 = new Intent( contant.this, polymorphism.class );
                startActivity( send_6 );
            }
        });
        button_7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send_7 = new Intent( contant.this, avbstraction.class );
                startActivity( send_7 );
            }
        });
        button_8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send_8 = new Intent( contant.this, encapsulation.class );
                startActivity( send_8);
            }
        });

    }
}