package com.example.restapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnItalian = findViewById(R.id.btnItalian);
        Button btnChinese = findViewById(R.id.btnChinese);
        Button btnGreek = findViewById(R.id.btnGreek);
        Button btnIndian = findViewById(R.id.btnIndian);

        btnItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("EL Jadida");
            }
        });

        btnChinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("Casablanca");

            }
        });

        btnGreek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("Meknes");

            }
        });

        btnIndian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("Merrakech");

            }
        });
    }

    void openSubCategory(String cat) {

        Intent i = new Intent(MainActivity.this, RestaurantActivity.class);
        i.putExtra("cat", cat);
        startActivity(i);
    }
}
