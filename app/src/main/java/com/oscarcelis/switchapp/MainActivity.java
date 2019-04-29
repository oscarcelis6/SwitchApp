package com.oscarcelis.switchapp;


import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch sw1;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw1 = findViewById(R.id.sw1);
        linearLayout = findViewById(R.id.linearL);

    }

        public void validarSwitch(View view) {
            if(sw1.isChecked()){

            setTheme(R.style.AppTheme);

            linearLayout.setBackgroundColor(
                    ContextCompat.getColor(getApplicationContext(), R.color.colorBackGround));

                Toast.makeText(this, "ON", Toast.LENGTH_SHORT).show();
            }else{
            setTheme(R.style.AppTheme2);
            linearLayout.setBackgroundColor(
                    ContextCompat.getColor(getApplicationContext(), R.color.colorBackGround2));
                Toast.makeText(this, "OFF", Toast.LENGTH_SHORT).show();
            }
        }
}

