package com.example.funfacts;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private factBook fb = new factBook();
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    private ColorWheel colorwheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        OnClickListener listener = new OnClickListener(){

            @Override
            public void onClick(View v) {

                String fact = fb.getFact();
                factTextView.setText(fact);

                int color = colorwheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);
        Toast.makeText(this,"Yay! Our activity is created", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "We are logging from the onCreate methode!!");

    }


    /*
#39add1 // light blue
#3079ab // dark blue
#c25975 // mauve
#e15258 // red
#f9845b // orange
#838cc7 // lavender
#7d669e // purple
#53bbb4 // aqua
#51b46d // green
#e0ab18 // mustard
#637a91 // dark gray
#f092b0 // pink
#b7c0c7 // light gray
     */


    /*


    Log.v(String, String) (verbose)
    Log.d(String, String) (debug)
    Log.i(String, String) (information)
    Log.w(String, String) (warning)
    Log.e(String, String) (error)


     */

}

