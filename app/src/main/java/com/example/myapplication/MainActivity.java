package com.example.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send();
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

       /* Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<20;i++){
                    System.out.println(i);
                    Toast.makeText(MainActivity.this,"Thread Running"+i,Toast.LENGTH_SHORT).show();
                }
            }
        });
        t.start();*/
    }

    public void send(){
        Intent intent=new Intent();
        intent.setAction("send");
        sendBroadcast(intent);
    }
}

 /*class SecondLargest{
    public static void main(String args[]){

        int[] arr={1,3,2,5,8,34,56,39,199};
        Integer[] arer={1,3,5,96,76};
         List s=Arrays.asList(arer);
        System.out.println(s);
        int largest=arr[0];
        int secondlargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest);



        //creating Arraylist
        List<String> fruitList = new ArrayList<>();
        //adding String Objects to fruitsList ArrayList
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");
        System.out.println("Converting ArrayList to Array" );
        String[] sss=new String[fruitList.size()];
        String[] item = fruitList.toArray(sss);
        //String[] item = fruitList.toArray(new String[fruitList.size()]);
        System.out.println(Arrays.toString(item));

        //creating Arraylist
        List<Integer> fruit = new ArrayList<>();
        //adding String Objects to fruitsList ArrayList
        fruit.add(1);
        fruit.add(2);
        fruit.add(3);
        fruit.add(4);
        fruit.add(6);
        System.out.println("Converting ArrayList to Array" );
        Integer[] item1 = fruit.toArray(new Integer[fruit.size()]);
        String ser=Integer.toString(item1[2]);

        String d="1";
        int h=Integer.parseInt(d);
        System.out.println(d);

        Integer ss=new Integer("373");
        int dd=(Integer)ss;
        System.out.println(dd);
    }
}*/
