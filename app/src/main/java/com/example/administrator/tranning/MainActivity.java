package com.example.administrator.tranning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.administrator.tranning.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SelectOnclick(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String ss = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ss);
        startActivity(intent);


    }
}