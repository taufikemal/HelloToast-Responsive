package com.example.hellorelative;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    private TextView showCount;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = findViewById(R.id.txt_hasil);
    }

    @SuppressLint("SetTextI18n")
    public void ShowCount(View view) {
        count++;
        if(showCount != null){
            showCount.setText( count + "");
        }
    }

    public void ShowToast(View view) {
        Toast toast = Toast.makeText(this, "HELLO TOAST", LENGTH_LONG);
        toast.show();
    }
}