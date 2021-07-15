package com.example.pfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginAvtovity extends AppCompatActivity {
    private TextView link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_avtovity);
        link = (TextView) findViewById(R.id.link_ref);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Registrar Usuario...!", Toast.LENGTH_LONG).show();
            }
        });
    }
}