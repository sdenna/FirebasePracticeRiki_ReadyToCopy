package com.example.firebasepracticeriki;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JSoupEx extends AppCompatActivity {

    static TextView quote;
    static TextView author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsoup_ex);
    }

    public void scrape(View v){
    }
}
