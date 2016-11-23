package com.example.administrator.tranning;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.support.v7.app.AlertDialog;
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

    @Override
    protected void onStart() {
        super.onStart();
        LocationManager systemService = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        boolean providerEnabled = systemService.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if(!providerEnabled){
            new AlertDialog.Builder(this)
                    .setTitle("GPS")
                    .setIcon(R.mipmap.ic_launcher)
                    .setMessage("是否打开GPS")
                    .setPositiveButton("是", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .setNegativeButton("否", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}