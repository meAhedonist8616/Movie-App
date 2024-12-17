package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddMovieActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_movie);
        et1=(EditText) findViewById(R.id.movnam);
        et2=(EditText) findViewById(R.id.lang);
        et3=(EditText) findViewById(R.id.actor);
        et4=(EditText) findViewById(R.id.actress);
        et5=(EditText) findViewById(R.id.director);
        et6=(EditText) findViewById(R.id.relyear);
        b1=(Button) findViewById(R.id.subbut);
        b2=(Button) findViewById(R.id.back1but);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(i);
            }
        });
    }
}