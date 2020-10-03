package com.example.ayena;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;

//import com.facebook.login.widget.LoginButton;

public class SignIn extends AppCompatActivity
{
    private Button proceed,loginButton;

    private ProgressBar progressBar;
    private EditText email_address, password;
    //private FirebaseAuth mAuth;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        //loginButton = (LoginButton) findViewById(R.id.login_button);

        proceed = (Button)findViewById(R.id.signin_btn);
        email_address = (EditText) findViewById(R.id.signin_email_inputfield);
        password = (EditText) findViewById(R.id.signin_password_inputfield);
        progressBar = (ProgressBar)findViewById(R.id.progressBar_signin);
        //mAuth = FirebaseAuth.getInstance();
               proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String email = email_address.getText().toString();
                final String pass = password.getText().toString();

                if(email.isEmpty() || pass.isEmpty()){
                    Toast.makeText(SignIn.this,"Kindly fill in all empty fields to proceed",Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.INVISIBLE);
                }else{
                    //Login(email,pass);
                    progressBar.setVisibility(View.VISIBLE);
                    email_address.setVisibility(View.INVISIBLE);
                    password.setVisibility(View.INVISIBLE);
                    proceed.setVisibility(View.INVISIBLE);
                   // loginButton.setVisibility(View.INVISIBLE);
                }


            }
        });


    }

    //private void Login(String email, String pass) {
       // mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
          ///  @Override
           // public void onComplete(@NonNull Task<AuthResult> task) {
            //    if(task.isSuccessful()){
               //     progressBar.setVisibility(View.INVISIBLE);
                  //  Toast.makeText(SignIn.this,"Welcome",Toast.LENGTH_SHORT).show();
                  //  startActivity(new Intent(SignIn.this,Intentions.class));
               // }else{
                  //  Toast.makeText(SignIn.this,"Error Signing In",Toast.LENGTH_SHORT).show();
                  //  progressBar.setVisibility(View.INVISIBLE);
                   // email_address.setVisibility(View.VISIBLE);
                   // password.setVisibility(View.VISIBLE);
                   // proceed.setVisibility(View.VISIBLE);
                    //loginButton.setVisibility(View.VISIBLE);
                //}
           // }
       // });
   // }
}
