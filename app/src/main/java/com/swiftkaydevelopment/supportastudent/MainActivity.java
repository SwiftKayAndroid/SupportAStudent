package com.swiftkaydevelopment.supportastudent;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnstudent,btnsupporter,btnsignin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnstudent = (Button) findViewById(R.id.btnstudent);
        btnsupporter = (Button) findViewById(R.id.btnsupporter);
        btnsignin = (Button) findViewById(R.id.btnsignin);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to loginpage

            }
        });

        btnsupporter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to supporter home page

            }
        });
        btnstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to student registration

            }
        });
    }


}
