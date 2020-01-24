package com.example.myapplication;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {
    Receiver2 receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        receiver=new Receiver2();
        IntentFilter intentFilter=new IntentFilter("send");
        registerReceiver(receiver,intentFilter);
    }
}
