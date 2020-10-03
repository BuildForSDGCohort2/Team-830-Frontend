package com.example.ayena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import com.facebook.FacebookSdk;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Button signin,register;
    //private FirebaseAnalytics mFirebaseAnalytics;
    //private FirebaseAuth mAuth;
    @Override
    public void onStart(){
        super.onStart();
       // FirebaseUser currentUser = mAuth.getCurrentUser();
       // updateUI(currentUser);
    }

   // private void updateUI(FirebaseUser currentUser) {
     //   Toast.makeText(MainActivity.this,"Facebook Authentication Successful!",Toast.LENGTH_SHORT).show();
    //}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        //mAuth = FirebaseAuth.getInstance();
        signin = (Button) findViewById(R.id.Login_btn);
        register = (Button) findViewById(R.id.Register_btn);
        //FacebookSdk.sdkInitialize(getApplicationContext());
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SignIn.class);
                startActivity(intent);
                finish();
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Register.class);
                startActivity(intent);
                finish();
            }
        });
    }
}