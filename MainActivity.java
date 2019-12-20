package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button home,previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textview1);
        home = findViewById(R.id.home);
        previous = findViewById(R.id.previous);
        getIntent();
    }
    public void LaunchHomeActivity(View view) {
        Intent intent = new Intent(this, Attributes.Name.class);
        startActivity(intent);
    }
    public void LaunchSecondActivity(View view) {
        Intent intent = new Intent(this, Attributes.Name.class);
    }

    public TextView getText() {
        return text;
    }
    public void showText() {

    }
}
