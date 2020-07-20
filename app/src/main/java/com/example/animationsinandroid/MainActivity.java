package com.example.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView helloworld_text;
    private TextView hiworld_text;
    private TextView txt_android;
    private ImageView img_peach;
    private ImageView img_watermelon;

    private boolean ishelloworldshowing;
    private  boolean ispeachshowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloworld_text = findViewById(R.id.helloworld_text);
        hiworld_text = findViewById(R.id.hiworld_text);
        txt_android = findViewById(R.id.txt_android);
        img_peach = findViewById(R.id.img_peach);
        img_watermelon = findViewById(R.id.img_watermelon);



        helloworld_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Log.i("Tag,","Button clicked")
             //   helloworld_text.animate().alpha(0).setDuration(3000);
              //  hiworld_text.animate().alpha(1).setDuration(3000);

                if (ishelloworldshowing == true) {
                    helloworld_text.animate().alpha(0).setDuration(3000);
                    hiworld_text.animate().alpha(1).setDuration(3000);
                    ishelloworldshowing = false;
                } else if(ishelloworldshowing == false) {
                    helloworld_text.animate().alpha(1).setDuration(3000);
                    hiworld_text.animate().alpha(0).setDuration(3000);
                    ishelloworldshowing = true;
                }

            }
        });

        txt_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // txt_android.animate().translationX(-3000).setDuration(2000);
               //   txt_android.animate().translationY(-3000).setDuration(2000);

                txt_android.animate().translationXBy(300).setDuration(5000);

            }
        });

        img_peach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ispeachshowing == true) {
                    img_peach.animate().alpha(0).setDuration(3000);
                    img_watermelon.animate().alpha(1).setDuration(3000);
                    ispeachshowing = false;
                } else if (ispeachshowing==false) {
                    img_peach.animate().alpha(1).setDuration(3000);
                    img_watermelon.animate().alpha(0).setDuration(3000);
                    ispeachshowing= true;

                }
            }
        });


    }
}