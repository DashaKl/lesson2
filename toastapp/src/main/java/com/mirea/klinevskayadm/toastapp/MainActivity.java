package com.mirea.klinevskayadm.toastapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text = findViewById(R.id.editTextTextPersonName);
    }

    public void onClickNewActivity(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ No 14 ГРУППА БСБО-03-20 Количество символов - " + Text.getText().length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}