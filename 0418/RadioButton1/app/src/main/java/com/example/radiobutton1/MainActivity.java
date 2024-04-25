package com.example.radiobutton1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                String outputStr = "";

                RadioButton boy = (RadioButton) findViewById(R.id.rdbBoy);
                RadioButton girl = (RadioButton) findViewById(R.id.rdbGirl);
                if(boy.isChecked())
                    outputStr += getResources().getString(R.string.male);
                else if(girl.isChecked())
                    outputStr += getResources().getString(R.string.female);
//
                RadioGroup type = (RadioGroup) findViewById(R.id.rgType);
                if(type.getCheckedRadioButtonId() == R.id.rdbAdult)
                    outputStr += "全票\n";
                if(type.getCheckedRadioButtonId() == R.id.rdbChild)
                    outputStr += "兒童票\n";
                if(type.getCheckedRadioButtonId() == R.id.rdbStudent)
                    outputStr += "學生\n";
//                switch (type.getCheckedRadioButtonId()){
//                    case R.id.rdbAdult:
//                        outputStr += "全票\n";
//                        break;
//                    case R.id.rdbChild:
//                        outputStr += "兒童票\n";
//                        break;
//                    case R.id.rdbStudent:
//                        outputStr += "學生\n";
//                        break;
//                }
                TextView output = (TextView) findViewById(R.id.lblOutput);
                output.setText(outputStr);
            }
        });
    }
}