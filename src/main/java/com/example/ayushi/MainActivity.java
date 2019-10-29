package com.example.ayushi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity{

    Button b1,b2,b3,b4,b5,b6;
    TextView t,t2,t3;
    int r,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.p1);
        b2=(Button)findViewById(R.id.m1);
        b3=(Button)findViewById(R.id.p2);
        b4=(Button)findViewById(R.id.m2);
        b5=(Button)findViewById(R.id.p3);
        b6=(Button)findViewById(R.id.m3);
        t=(TextView) findViewById(R.id.R);


        if(t.getText().toString().isEmpty()){
            r=0;
            setcolour();
        }
        else{
             r=Integer.parseInt(t.getText().toString());
        }
        t2=(TextView) findViewById(R.id.G);
        if(t2.getText().toString().isEmpty()){
            r2=0;
            setcolour();
        }
        else{
            r2=Integer.parseInt(t2.getText().toString());
        }
        t3=(TextView) findViewById(R.id.B);
        if(t3.getText().toString().isEmpty()){
            r3=0;
            setcolour();
        }
        else{
            r3=Integer.parseInt(t3.getText().toString());
        }

        b1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                if(v ==b1){
                if(r+1<256) {
                    r = r + 1;
                    t.setText(String.valueOf(r));
                    setcolour();
                }
            }
                return;
        }

        });
        b2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick (View v){
                if(v==b2){
                    if(r-1>=0) {
                        r = r-1;
                        t.setText(String.valueOf(r));
                        setcolour();
                    }
                }
                return;
            }
        });
        b3.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                if(v ==b3){
                    if(r2+1<256) {
                        r2 = r2 + 1;
                        t2.setText(String.valueOf(r2));
                        setcolour();
                    }
                }
                return;
            }

        });
        b4.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick (View v){
                if(v==b4){
                    if(r2-1>=0) {
                        r2 = r2 - 1;
                        t2.setText(String.valueOf(r2));
                        setcolour();
                    }
                }
                return;
            }
        });
        b5.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                if(v ==b5){
                    if(r3+1<256) {
                        r3 = r3 + 1;
                        t3.setText(String.valueOf(r3));
                        setcolour();
                    }
                }
                return;
            }

        });
        b6.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick (View v){
                if(v==b6){
                    if(r3-1>=0) {
                        r3 = r3 - 1;
                        t3.setText(String.valueOf(r3));
                        setcolour();
                    }
                }
                return;
            }
        });


    }

    private void setcolour() {
       TextView c=(TextView)findViewById(R.id.C);
       c.setBackgroundColor(Color.argb(100,r,r2,r3));
       return;
    }


}
