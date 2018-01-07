package com.example.death.logincalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button signin,signup;
    EditText username,password;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        signin=(Button)findViewById(R.id.button);
        signup=(Button)findViewById(R.id.button2);
        text=(TextView)findViewById(R.id.textView);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strusername, strpassword;
                strusername=username.getText().toString();
                strpassword=password.getText().toString();

                DatabaseClass db= new DatabaseClass(MainActivity.this);
                long result=db.insertData(strusername,strpassword);
                if (result>0)
                {
                    Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "An Error Occured", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strusername,strpassword;
                strusername=username.getText().toString();
                strpassword=password.getText().toString();

                DatabaseClass dbobject=new DatabaseClass(MainActivity.this);
                boolean status=dbobject.check(strusername,strpassword);
                if (status) {
                    startActivity(new Intent(getBaseContext(),Calculator.class));
                }
                else
                {
                    text.setText("Invalid Username or Password");
                }

            }
        });
        username.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                username.setText("");
                text.setText("");
                return false;
            }
        });
        password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                password.setText("");
                text.setText("");
                return false;
            }
        });


    }
}
