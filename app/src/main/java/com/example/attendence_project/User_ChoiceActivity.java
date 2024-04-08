package com.example.attendence_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class User_ChoiceActivity extends AppCompatActivity {

    private Button stdbtn;
    private Button teabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_choice);
        stdbtn = findViewById(R.id.stdbtn);
        stdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User_ChoiceActivity.this, std_Homepage_Activity.class );
                startActivity(intent);
            }
        });

        teabtn = findViewById(R.id.teabtn);
        teabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User_ChoiceActivity.this, tea_Homepage_Activity.class );
                startActivity(intent);
            }
        });


    }
}