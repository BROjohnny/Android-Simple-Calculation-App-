package com.master.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button adding_add = (Button) findViewById(R.id.adding_add);
        adding_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first = (EditText) findViewById(R.id.first);
                EditText second_text1 = (EditText) findViewById(R.id.second_text1);
                TextView textView2 = (TextView) findViewById(R.id.textView2);

                double n1 = Double.parseDouble(first.getText().toString());
                double n2 = Double.parseDouble(second_text1.getText().toString());

                double result = n1 + n2;
                textView2.setText(result+"");
            }
        });
    }
}
