package com.example.mymusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button classical;
    private Button hiphop;
    private Button kpop;
    private Button love;
    private Button chill;
    private Button sleep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        classical =findViewById(R.id.classical);
        hiphop = findViewById(R.id.hiphop);
        kpop = findViewById(R.id.kpop);
        love = findViewById(R.id.love);
        chill = findViewById(R.id.chill);
        sleep = findViewById(R.id.sleep);


        classical.setOnClickListener(v ->
        {
            Intent intent1 = new Intent(MainActivity.this,classical.class);
            startActivity(intent1);

        });
        hiphop.setOnClickListener(v ->
        {
            Intent intent2 = new Intent(MainActivity.this,hiphop.class);
            startActivity(intent2);
        });
        kpop.setOnClickListener(v ->
        {
            Intent intent3 = new Intent(MainActivity.this,kpop.class);
            startActivity(intent3);
        });
        love.setOnClickListener(v ->
        {
            Intent intent4 = new Intent(MainActivity.this,love.class);
            startActivity(intent4);
        });
        chill.setOnClickListener(v ->
        {
            Intent intent5 = new Intent(MainActivity.this,chill.class);
            startActivity(intent5);
        });
        sleep.setOnClickListener(v ->
        {
            Intent intent6 = new Intent(MainActivity.this,sleep.class);
            startActivity(intent6);
        });

        }
    }
