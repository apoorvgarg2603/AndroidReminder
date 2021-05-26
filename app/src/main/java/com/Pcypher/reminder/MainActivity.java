package com.Pcypher.reminder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button register;
    private Button login;
    private TextView pin;
    private Button check;
    private Boolean notRobot = false;
    public String passPin = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register = findViewById(R.id.register);
        login = findViewById(R.id.testLogin);
        pin = findViewById(R.id.pin);
        check = findViewById(R.id.checkbox);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                notRobot = true;
            }
        });

    }

    public void validate(String curr)
    {

    }
}