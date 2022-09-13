package com.example.android;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    EditText etContact;
    TextView tvHome;
    public static String TAG = HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etContact = findViewById(R.id.etContact);
        tvHome = findViewById(R.id.tvHome);
        String name = getIntent().getExtras().getString("nkey");
        tvHome.setText("hello "+name);
    }

    public void handleClicks(View viewClicked) {
        String name = etContact.getText().toString();
        Toast.makeText(this,name, Toast.LENGTH_SHORT).show();

    }
}
