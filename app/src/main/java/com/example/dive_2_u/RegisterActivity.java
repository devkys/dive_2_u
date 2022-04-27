package com.example.dive_2_u;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Intent;
import android.view.MotionEvent;

import org.w3c.dom.Text;

public class RegisterActivity extends AppCompatActivity {
    private Spinner spinner;

    private TextView no_star_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.star,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        no_star_txt  = findViewById(R.id.no_star_txt);
        no_star_txt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent no_star_txt = new Intent(getApplicationContext(), no_star.class);
                startActivity(no_star_txt);
            }
        });

    }



}