package com.example.clientside;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class ClintActivity extends AppCompatActivity {

    public TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctivity);

        view = (TextView) findViewById(R.id.agent);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClintActivity.this,SignupActivity.class);
                startActivity(intent);

            }
        });
    }
    }
