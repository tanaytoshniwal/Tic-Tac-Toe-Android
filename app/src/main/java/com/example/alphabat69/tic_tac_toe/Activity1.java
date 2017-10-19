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

                break;
            }
            case R.id.one:{

                break;
            }
            case R.id.two:{

                break;
            }
            case R.id.three:{

                break;
            }
            case R.id.four:{

                break;
            }
            case R.id.five:{

                break;
            }
            case R.id.six:{

                break;
            }
            case R.id.seven:{

                break;
            }
            case R.id.eight:{

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
