package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {

    Main2pojo main2pojo;
    private MyClickHandlers handlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding  binding= DataBindingUtil.setContentView(this, R.layout.activity_main2);

        main2pojo = new Main2pojo();
        main2pojo.setName("Ravi Tamada");
        binding.setUuser(main2pojo);

        handlers = new MyClickHandlers(this);
        binding.setHandlers(handlers);
        //2nd Comment
        /*Receiver1 receiver=new Receiver1();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction("send");
        registerReceiver(receiver,intentFilter);
*/
    }

    public class MyClickHandlers {

        Context context;

        public MyClickHandlers(Context context) {
            this.context = context;
        }

        public void onButtonClick(View view) {
            Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show();
        }
    }



}


