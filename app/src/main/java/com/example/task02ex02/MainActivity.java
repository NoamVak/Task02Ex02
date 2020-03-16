package com.example.task02ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;
    Random rnd=new Random();
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView)findViewById(R.id.iv);
        ib=(ImageButton)findViewById(R.id.ib);
    }
int x;
    public void Click(View view) {
        x=rnd.nextInt(3)+1;
        if (x==1){
            ib.setImageResource(R.drawable.one);
            iv.setImageResource(R.drawable.chat);
        }
        else if (x==2){
            ib.setImageResource(R.drawable.two);
            iv.setImageResource(R.drawable.deadpool);
        }
        else if(x==3){
            ib.setImageResource(R.drawable.three);
            iv.setImageResource(R.drawable.photograph);
        }

    }
}
