package com.example.alphabat69.tic_tac_toe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.HashMap;

public class Activity1 extends AppCompatActivity implements View.OnClickListener{
    ImageButton zero,one,two,three,four,five,six,seven,eight;
    int chance=9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        zero=(ImageButton)findViewById(R.id.zero);
        one=(ImageButton)findViewById(R.id.one);
        two=(ImageButton)findViewById(R.id.two);
        three=(ImageButton)findViewById(R.id.three);
        four=(ImageButton)findViewById(R.id.four);
        five=(ImageButton)findViewById(R.id.five);
        six=(ImageButton)findViewById(R.id.six);
        seven=(ImageButton)findViewById(R.id.seven);
        eight=(ImageButton)findViewById(R.id.eight);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        boolean b=false;
        if(chance%2==1)
            b=true;
        switch(v.getId()){
            case R.id.zero:{
                if(b)
                    zero.setBackgroundColor(Color.BLUE);
                else
                    zero.setBackgroundColor(Color.RED);
                zero.setClickable(false);
                break;
            }
            case R.id.one:{
                if(b)
                    one.setBackgroundColor(Color.BLUE);
                else
                    one.setBackgroundColor(Color.RED);
                one.setClickable(false);
                break;
            }
            case R.id.two:{
                if(b)
                    two.setBackgroundColor(Color.BLUE);
                else
                    two.setBackgroundColor(Color.RED);
                two.setClickable(false);
                break;
            }
            case R.id.three:{
                if(b)
                    three.setBackgroundColor(Color.BLUE);
                else
                    three.setBackgroundColor(Color.RED);
                three.setClickable(false);
                break;
            }
            case R.id.four:{
                if(b)
                    four.setBackgroundColor(Color.BLUE);
                else
                    four.setBackgroundColor(Color.RED);
                four.setClickable(false);
                break;
            }
            case R.id.five:{
                if(b)
                    five.setBackgroundColor(Color.BLUE);
                else
                    five.setBackgroundColor(Color.RED);
                five.setClickable(false);
                break;
            }
            case R.id.six:{
                if(b)
                    six.setBackgroundColor(Color.BLUE);
                else
                    six.setBackgroundColor(Color.RED);
                six.setClickable(false);
                break;
            }
            case R.id.seven:{
                if(b)
                    seven.setBackgroundColor(Color.BLUE);
                else
                    seven.setBackgroundColor(Color.RED);
                seven.setClickable(false);
                break;
            }
            case R.id.eight:{
                if(b)
                    eight.setBackgroundColor(Color.BLUE);
                else
                    eight.setBackgroundColor(Color.RED);
                eight.setClickable(false);
                break;
            }
        }
        chance--;
        if(chance==0)
            result();
        check();
    }
    public void result(){

    }
    public void check(){

    }
}
