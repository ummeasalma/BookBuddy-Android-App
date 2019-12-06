package com.example.pronojitmallick.mybookbuddyapp;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Salma on 5/19/2017.
 */

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }
    public void sendMessage(View view, ActionBar.Tab phone){

        //EditText phone = (EditText) findViewById(R.id.editTextRecepient);
        EditText msg = (EditText) findViewById(R.id.editTextMessage);


        SmsManager sms = SmsManager.getDefault();


        sms.sendTextMessage(phone.getText().toString(),
                null,msg.getText().toString(),null,null);
        Snackbar.make(view,"Message sent",Snackbar.LENGTH_INDEFINITE).show();
    }
}
