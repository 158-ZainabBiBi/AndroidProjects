package com.example.hometask4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText TextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextMessage = (EditText) findViewById(R.id.txtmessage);
    }

    public void Reminder(View view) {
        Calendar cal = Calendar.getInstance();
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("beginTime", cal.getTimeInMillis());
        intent.putExtra("endTime", cal.getTimeInMillis()*60*60*1000);
        intent.putExtra("title", "A Test Event from android app");
        startActivity(intent);
    }

    public void SendMessage(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_TEXT, TextMessage.getText().toString());
        startActivity(sendIntent);
    }

    public void Camera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, 2);
        startActivity(intent);
    }

    public void ContactList(View view) {
        Intent read = new Intent(Intent.ACTION_VIEW);
        read.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivity(read);
    }

    public void Alaram(View view) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        intent.putExtra(AlarmClock.EXTRA_HOUR, 5);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, 5);
        startActivity(intent);
    }
}