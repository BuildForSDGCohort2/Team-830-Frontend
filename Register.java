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
//import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity
{
    private Button register;
    private EditText email,password;
    //private FirebaseAuth mAuth;
    private ProgressBar progressBar;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //mAuth = FirebaseAuth.getInstance();
        register = (Button)findViewById(R.id.register_btn);

        email = (EditText) findViewById(R.id.email_register_textfield);
        password = (EditText) findViewById(R.id.password_register_textfield);
        progressBar = (ProgressBar) findViewById(R.id.progressBar_register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v){

            final String mail = email.getText().toString();
            final String pass = password.getText().toString();

            if(mail.isEmpty() || pass.isEmpty())
                {
                    Toast.makeText(Register.this,"Kindly fill in all empty fields to proceed!",Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.INVISIBLE);

                    register.setVisibility(View.VISIBLE);
                }else{
                progressBar.setVisibility(View.VISIBLE);
                register.setVisibility(View.INVISIBLE);

                email.setVisibility(View.INVISIBLE);
                password.setVisibility(View.INVISIBLE);
               // CreatenewUserAccount(mail,pass);
            }
            }
        });


    }


    //public void CreatenewUserAccount(String mail, String pass) {
        //mAuth.createUserWithEmailAndPassword(mail,pass)
               //// .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                   // @Override
                   // public void onComplete(@NonNull Task<AuthResult> task) {
                     //   if (task.isSuccessful()){
                        //    FirebaseUser user = mAuth.getCurrentUser();
                          //  Toast.makeText(Register.this,"Registration Successful!",Toast.LENGTH_SHORT).show();
                         //   Intent intent = new Intent(getApplicationContext(),Intentions.class);
                         //   startActivity(intent);
                          //  finish();
                       /// }
                      //  else {
                        //    Toast.makeText(Register.this,"Registration Unsuccessful!",Toast.LENGTH_SHORT).show();
                       // }
                 //   }
               // });
    //}
}

