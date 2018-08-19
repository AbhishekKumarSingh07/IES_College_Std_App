package com.example.hp.mainproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class AfterLoginActivity extends AppCompatActivity {

    TextView nm,enr,brc,sm,cl,newspaper;
    ImageView pic,cls;
   // WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        nm=findViewById(R.id.name);
        enr=findViewById(R.id.enroll);
        brc=findViewById(R.id.branch);
        sm=findViewById(R.id.sem);
        cl=findViewById(R.id.college);
        pic=findViewById(R.id.dp);
        cls=findViewById(R.id.close);

        newspaper=findViewById(R.id.dnp);
        String name=getIntent().getStringExtra("name");
        String enroll=getIntent().getStringExtra("enroll");
        String branch=getIntent().getStringExtra("branch");
        String sem=getIntent().getStringExtra("sem");
        String college=getIntent().getStringExtra("college");
        int dp=getIntent().getIntExtra("dp",0);

        nm.setText(name);
        enr.setText(enroll);
        brc.setText(branch);
        sm.setText(sem);
        cl.setText(college);
        pic.setImageResource(dp);




    }

    public void news(View view) {
        switch (view.getId()) {
               case R.id.dnp:
                   String news="http://www.google.com";
                   Intent i = new Intent(this, Web_activity.class);
                   i.putExtra("url",news);
                   startActivity(i);
                break;
            case R.id.acs:
                String syllabus="http://www.facebook.com";
                Intent i1 = new Intent(this, Web_activity.class);
                i1.putExtra("url",syllabus);
                startActivity(i1);
                break;
            case R.id.de:
                String exam="http://www.youtube.com";
                Intent i2 = new Intent(this, Web_activity.class);
                i2.putExtra("url",exam);
                startActivity(i2);
                break;
            case R.id.scrbrd:
                String score="http://www.gmail.com";
                Intent i3 = new Intent(this, Web_activity.class);
                i3.putExtra("url",score);
                startActivity(i3);
                break;
            case R.id.swot:
                String swt="http://www.yahoo.com";
                Intent i4 = new Intent(this, Web_activity.class);
                i4.putExtra("url",swt);
                startActivity(i4);
                break;
            case R.id.trng:
                String trng="http://www.rgpv.ac.in";
                Intent i5 = new Intent(this, Web_activity.class);
                i5.putExtra("url",trng);
                startActivity(i5);
                break;
            case R.id.faculty:
                String faculty="http://www.iesbpl.ac.in";
                Intent i6 = new Intent(this, Web_activity.class);
                i6.putExtra("url",faculty);
                startActivity(i6);
                break;
            case R.id.suggest:
                String suggest="http://www.google.com";
                Intent i7 = new Intent(this, Web_activity.class);
                i7.putExtra("url",suggest);
                startActivity(i7);
                break;
        }

        /*Intent it= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sciencenewsforstudents.org/"));
        startActivity(it);*/
        }

    public void off(View view) {

        finish();
    }
}

