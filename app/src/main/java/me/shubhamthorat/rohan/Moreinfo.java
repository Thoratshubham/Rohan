package me.shubhamthorat.rohan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Moreinfo extends AppCompatActivity {
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreinfo);

        int image[] ={R.drawable.floor1,R.drawable.floor2,R.drawable.floor3, R.drawable.slide4};

        v_flipper = findViewById(R.id.v_flipper);

        for(int i=0; i < image.length;i++){
            flipperImage(image[i]);
        }
    }
    public void flipperImage(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this,android.R.anim.slide_out_right);
    }

//    public void intent (View view) {
//
//        Intent intent = new Intent(MainActivity.this, Moreinfo.class);
//        startActivity(intent);
//    }

}
