package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch mySwitch;
    TextView myTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySwitch = (Switch) findViewById(R.id.textSwitch);
        myTextView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(getApplicationContext(), "Switch On!",  Toast.LENGTH_SHORT).show();
                    myTextView.setText("SWITCH ON!");
                } else {
                    Toast.makeText(getApplicationContext(), "Switch Off!", Toast.LENGTH_SHORT).show();
                    myTextView.setText("SWITCH OFF!");
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }


}