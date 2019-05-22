package com.example.sentimentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView btn_logout;
    Button btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nama = findViewById(R.id.tv_namaMain);
        btn_search = findViewById(R.id.btn_search);
        nama.setText(Preferences.getLoggedInUser(getBaseContext()));

        findViewById(R.id.btn_logout).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Preferences.clearLoggedInUser(getBaseContext());
                startActivity(new
                        Intent(getBaseContext(),loginActivity.class));
                finish();
            }
        });

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),chartActivity.class));
            }
        });
    }
}
