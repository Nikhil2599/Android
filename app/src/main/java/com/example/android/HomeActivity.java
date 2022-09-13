package com.example.android;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    EditText etContact;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etContact = findViewById(R.id.etContact);
    }

    public void handleClicks(View viewClicked) {
        String name = etContact.getText().toString();
        Toast.makeText(this,name, Toast.LENGTH_SHORT).show();

    }
}
