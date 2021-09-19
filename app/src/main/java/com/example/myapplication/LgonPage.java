package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LgonPage extends AppCompatActivity {



    TextInputEditText Temail , Tpass;
    MaterialButton button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgon_page);



        Temail = findViewById(R.id.emailsignin);
        Tpass = findViewById(R.id.passsignin);


        button = findViewById(R.id.signbtn);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String email = Temail.getText().toString().trim();
                String pass = Temail.getText().toString().trim();



                if (email.equals("")){
                    Toast.makeText(LgonPage.this, "Enter your Email", Toast.LENGTH_LONG).show();
                }
                else if (pass.equals("")){

                    Toast.makeText(LgonPage.this, "Enter your Password", Toast.LENGTH_LONG).show();

                }
                else if (pass.length() <= 6){
                    Toast.makeText(LgonPage.this, "Too Short Password atleast 8 words", Toast.LENGTH_LONG).show();

                }else {


                    
                }

            }
        });





    }
}