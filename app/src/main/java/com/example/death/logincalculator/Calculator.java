package com.example.death.logincalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends Activity {

    Button one,two,three,add,equal,ac,c,four,five,six,div,multi,seven,eight,nine,zero,percentage,sub;
    EditText screen;
    String first,second,op;
    int f,s,length;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        text=(TextView)findViewById(R.id.textView);
        one=(Button)findViewById(R.id.button);
        two=(Button)findViewById(R.id.button4);
        three=(Button)findViewById(R.id.button5);
        add=(Button)findViewById(R.id.button8);
        equal=(Button)findViewById(R.id.button9);
        ac=(Button)findViewById(R.id.button2);
        four=(Button)findViewById(R.id.button6);
        five=(Button)findViewById(R.id.button7);
        six=(Button)findViewById(R.id.button10);
        div=(Button)findViewById(R.id.button20);
        multi=(Button)findViewById(R.id.button18);
        seven=(Button)findViewById(R.id.button11);
        eight=(Button)findViewById(R.id.button12);
        nine=(Button)findViewById(R.id.button13);
        zero=(Button)findViewById(R.id.button14);
        percentage=(Button)findViewById(R.id.button19);
        sub=(Button)findViewById(R.id.button17);
        c=(Button)findViewById(R.id.button3);
        screen=(EditText)findViewById(R.id.editText);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"3");

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                length=screen.getText().length() ;
                screen.getText().delete(length-1, length);

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=screen.getText().toString();
                screen.setText("");
                op="+";
                text.setText(first+"+");

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second=screen.getText().toString();
                if (op.equalsIgnoreCase("+")){

                    //int f,s;
                    f= Integer.parseInt(first);
                    s= Integer.parseInt(second);
                    int sum=f+s;
                    screen.setText(first+"+"+second+"="+""+sum);
                    text.setText("");

                }
                else if (op.equalsIgnoreCase("-")){

                    //int f,s;
                    f= Integer.parseInt(first);
                    s= Integer.parseInt(second);
                    int sum=f-s;
                    screen.setText(first+"-"+second+"="+""+sum);
                    text.setText("");

                }
                else if (op.equalsIgnoreCase("*")){

                    //int f,s;
                    f= Integer.parseInt(first);
                    s= Integer.parseInt(second);
                    int sum=f*s;
                    screen.setText(first+"*"+second+"="+""+sum);
                    text.setText("");

                }
                else if (op.equalsIgnoreCase("/")){

                    //int f,s;
                    f= Integer.parseInt(first);
                    s= Integer.parseInt(second);
                    int sum=f/s;
                    screen.setText(first+"/"+second+"="+""+sum);
                    text.setText("");

                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=screen.getText().toString();
                screen.setText("");
                op="*";
                text.setText(first+"*");

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=screen.getText().toString();
                screen.setText("");
                op="/";
                text.setText(first+"/");

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=screen.getText().toString();
                screen.setText("");
                op="-";
                text.setText(first);
                text.setText(first+"-");

            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText("");
                text.setText("");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"9");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String existingtext=screen.getText().toString();
                screen.setText(existingtext+"0");

            }
        });


    }
}
