package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class SignUppage extends AppCompatActivity {



    TextInputEditText Temail , Tpass , tfname , tphone , taddress , tdob , tcpass;
    MaterialButton button;

    RadioGroup mgroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_uppage);

        tfname = findViewById(R.id.fnamesignup);
        Temail = findViewById(R.id.emailsingup);
        taddress = findViewById(R.id.addresssignup);
        tphone = findViewById(R.id.phonesignup);
        tdob = findViewById(R.id.dobsignup);
        Tpass = findViewById(R.id.passsignup);
        tcpass = findViewById(R.id.cpasssignup);

        button = findViewById(R.id.signupbtn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String fullname = tfname.getText().toString().trim();
                String email = Temail.getText().toString().trim();
                String address = taddress.getText().toString().trim();
                String phone = tphone.getText().toString().trim();
                String dob = tdob.getText().toString().trim();
                String pass = Tpass.getText().toString().trim();
                String cpass = tcpass.getText().toString().trim();


                if (fullname.equals("")){
                    Toast.makeText(getApplicationContext(), "Enter your Full name", Toast.LENGTH_LONG).show();
                }
                else if (email.equals("")){

                    Toast.makeText(getApplicationContext(), "Enter your email", Toast.LENGTH_LONG).show();

                }
                else if (address.equals("")){

                    Toast.makeText(getApplicationContext(), "Enter your address", Toast.LENGTH_LONG).show();

                }
                else if (phone.equals("")){

                    Toast.makeText(getApplicationContext(), "Enter your phone", Toast.LENGTH_LONG).show();

                }
                else if (dob.equals("")){

                    Toast.makeText(getApplicationContext(), "Enter your Date Of Birth", Toast.LENGTH_LONG).show();

                }
                else if (pass.equals("")){

                    Toast.makeText(getApplicationContext(), "Enter your Password", Toast.LENGTH_LONG).show();

                }
                else if (cpass.equals("")){

                    Toast.makeText(getApplicationContext(), "Enter your Confirm Password", Toast.LENGTH_LONG).show();

                }
                else if (cpass != pass){

                    Toast.makeText(getApplicationContext(), "Password doesn't match", Toast.LENGTH_LONG).show();

                }
                else if (pass.length() <= 6){
                    Toast.makeText(getApplicationContext(), "Too Short Password atleast 8 words", Toast.LENGTH_LONG).show();

                }else {



                }

            }
        });

    }
}