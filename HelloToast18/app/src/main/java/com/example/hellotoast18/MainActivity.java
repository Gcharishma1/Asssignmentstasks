package com.example.hellotoast18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.tv);
        if(savedInstanceState!=null && savedInstanceState.containsKey("Key")){
            count=savedInstanceState("key");
            text.setText(String.valueOf(count));
        }
    }

    public void showToast(View view) {
        Toast.makeText(this,"In this count can be increased based on clicks on count button"+count,Toast.LENGTH_SHORT).show();
    }

    public void showcount(View view) {
        count++;
        text.setText(String.valueOf(count));
    }


    public void showCountdecrement(View view) {
        if(count>0){
            count--;
        }
        text.setText(String.valueOf(count));
    }
    
}