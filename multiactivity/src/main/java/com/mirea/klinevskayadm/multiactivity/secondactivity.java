package com.mirea.klinevskayadm.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    private TextView NewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        String text = (String) getIntent().getSerializableExtra("key");
        NewText = findViewById(R.id.textView);
        NewText.setText(text);
    }
}