package com.example.hp.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

   EditText emailText,passwordText;
   TextView forgotPass,createNew;
   Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

         login = (Button)findViewById(R.id.login_button);
         forgotPass = (TextView)findViewById(R.id.fogot_password_text);
         createNew = (TextView)findViewById(R.id.login_register_text);
         emailText = (EditText)findViewById(R.id.login_mail);
         passwordText =(EditText)findViewById(R.id.login_password);


    //Login Button Clicked, Check if both fields are not empty
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailText.getText().toString();
                String pass = passwordText.getText().toString();
                if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(pass)){
                    Toast.makeText(login_activity.this,"Login Button Clicked Successfully",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(login_activity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //Initiate when the user clicks Forgot Password
        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login_activity.this,"Forgot Password Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        //Initiate when Create new button is clicked
        createNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login_activity.this,"Create New Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
