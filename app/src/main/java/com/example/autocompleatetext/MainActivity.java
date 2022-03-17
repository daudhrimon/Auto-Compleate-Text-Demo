package com.example.autocompleatetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView ACTV;
    String[] array ={"Daud","Mamun","Mofiz","Nafiza"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ACTV=findViewById(R.id.ACTV);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,array);
        ACTV.setAdapter(adapter);
    }
}