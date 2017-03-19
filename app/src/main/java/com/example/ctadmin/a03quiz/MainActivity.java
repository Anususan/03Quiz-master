package com.example.ctadmin.a03quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int quizScore = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button subbutton=(Button) findViewById(R.id.submit);
         subbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

        EditText answer3  = (EditText) findViewById(R.id.ans3);

        RadioGroup rbGroup1 = (RadioGroup) findViewById(R.id.radiogroup1);
        int selectedId1 = rbGroup1.getCheckedRadioButtonId();
        if (selectedId1 != -1) {
            RadioButton selectedRadioButton1 = (RadioButton) findViewById(selectedId1);
            String radioButtonText1 = selectedRadioButton1.getText().toString();
            if ((radioButtonText1).equals(getString(R.string.q1answer))) {
                quizScore = quizScore + 1;
            }
        }

        RadioGroup rbGroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
        int selectedId2 = rbGroup2.getCheckedRadioButtonId();
        if (selectedId2 != -1) {
            RadioButton selectedRadioButton2 = (RadioButton) findViewById(selectedId2);
            String radioButtonText2 = selectedRadioButton2.getText().toString();
            if ((radioButtonText2).equals(getString(R.string.q2answer))) {
                quizScore = quizScore + 1;
            }
        }

        String value =answer3.getText().toString();
        if ((value).equals("linux")|(value).equals("linux os")|(value).equals("linux operating system")) {
            quizScore = quizScore + 1;
        }


        CheckBox qAnswer41 = (CheckBox) findViewById(R.id.op41);
        boolean isChecked41 = qAnswer41.isChecked();
        CheckBox qAnswer42 = (CheckBox) findViewById(R.id.op42);
        boolean isChecked42 = qAnswer42.isChecked();
        CheckBox qAnswer43 = (CheckBox) findViewById(R.id.op43);
        boolean isChecked43 = qAnswer43.isChecked();

        if (isChecked41 && isChecked42 && !isChecked43) {
            quizScore = quizScore + 1;
        }

        CheckBox qAnswer51 = (CheckBox) findViewById(R.id.op51);
        boolean isChecked51 = qAnswer51.isChecked();
        CheckBox qAnswer52 = (CheckBox) findViewById(R.id.op52);
        boolean isChecked52 = qAnswer52.isChecked();
        CheckBox qAnswer53 = (CheckBox) findViewById(R.id.op53);
        boolean isChecked53 = qAnswer53.isChecked();

        if (isChecked52 && isChecked53 && !isChecked51) {
            quizScore = quizScore + 1;
        }
                String res="Congrats!!!Your score is "+quizScore;

        Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();
            }
        });

        Button resbutton = (Button) findViewById(R.id.reset);


        resbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ViewGroup vg = (ViewGroup) findViewById(R.id.activity_main);
                vg.invalidate();
                setContentView(R.layout.activity_main);
            }
        });








    }
}
