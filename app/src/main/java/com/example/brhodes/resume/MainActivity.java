package com.example.brhodes.resume;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button workHistoryButton;
    Button educationButton;
    Button callButton;
    Button emailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workHistoryButton = (Button)findViewById(R.id.workHistoryButton);
        educationButton = (Button)findViewById(R.id.educationButton);
        callButton = (Button)findViewById(R.id.callButton);
        emailButton = (Button)findViewById(R.id.emailButton);

        workHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToWorkHistory = new Intent(getApplicationContext(), WorkHistoryActivity.class);
                startActivity(goToWorkHistory);
            }
        });

        educationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoEducation = new Intent(getApplicationContext(), EducationActivity.class);
                startActivity(gotoEducation);
            }
        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri myPhoneNumber = Uri.parse("tel: 19788860377");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, myPhoneNumber);
                startActivity(callIntent);
            }
        });

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "brianrhodes139@gmail.com" });
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Brian's Resme");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "I really like your resume!");
                startActivity(emailIntent);
            }
        });
    }
}
