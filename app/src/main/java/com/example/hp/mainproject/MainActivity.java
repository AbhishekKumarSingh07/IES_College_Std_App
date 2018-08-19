package com.example.hp.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView loginTv,aboutUsView,contactUsView,aboutTv,contactTv;
LinearLayout loginView;


    String [] name={"Abhishek Kumar Singh","Abhinav Saurav Saraswati","Anjani Dubey","Sabdar Ansari","Himanshu Shekhar"};
    String [] enroll={"0177CS151007","0177CE161004","0177ECE161026","0526EX151086","0526ME151056"};
    String [] branch={"Computer Science","Civil","Electronics","Electricals","Mechanical"};
    String [] sem={"VII Sem","VI Sem","VI Sem","VII Sem","VII Sem"};
    String [] college={"IES COLLEGE OF TECHNOLOGY","IES COLLEGE OF TECHNOLOGY","IES COLLEGE OF TECHNOLOGY","IES INSTITUTE OF TECHNOLOGY & MANAGEMENT","IES INSTITUTE OF TECHNOLOGY & MANAGEMENT"};
    int    [] dp={R.drawable.aaa,R.drawable.aaa,R.drawable.aaa,R.drawable.aaa,R.drawable.aaa};

    String [] usr={"akki","abhinav","anjani","sabdar","himanshu"};
    String [] psw={"akki07","abhinav04","anjani26","sabdar86","himanshu56"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginTv=findViewById(R.id.loginTV);
        aboutTv=findViewById(R.id.aboutTv);
        contactTv=findViewById(R.id.contactTv);
        contactUsView=findViewById(R.id.contactUsView);
        aboutUsView=findViewById(R.id.aboutUsView);
        loginView=findViewById(R.id.loginView);

        loginTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginView.setVisibility(View.VISIBLE);
                contactUsView.setVisibility(View.GONE);
                aboutUsView.setVisibility(View.GONE);

            }
        });
        contactTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginView.setVisibility(View.GONE);
                contactUsView.setVisibility(View.VISIBLE);
                aboutUsView.setVisibility(View.GONE);

            }
        });
        aboutTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginView.setVisibility(View.GONE);
                contactUsView.setVisibility(View.GONE);
                aboutUsView.setVisibility(View.VISIBLE);

            }
        });
    }

    public void login(View view) {
        EditText usret=findViewById(R.id.userLoginET);
        EditText pswet=findViewById(R.id.passLoginEt);

        String usrname=usret.getText().toString();
        String passw= pswet.getText().toString();

        for (int a=0;a<usr.length;a++)
        {
            if (usr[a].equals(usrname))
            {
                String password=psw[a];
                if (passw.equals(password))
                {
                    Intent i= new Intent(this,AfterLoginActivity.class);

                    i.putExtra("name",name[a]);
                    i.putExtra("enroll",enroll[a]);
                    i.putExtra("branch",branch[a]);
                    i.putExtra("sem",sem[a]);
                    i.putExtra("college",college[a]);
                    i.putExtra("dp",dp[a]);
                    startActivity(i);
                }
                else
                    Toast.makeText(this,"Wrong Username or Password",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void forget(View view) {
        Toast.makeText(this,"Contact College for New Password",Toast.LENGTH_SHORT).show();
    }
}
