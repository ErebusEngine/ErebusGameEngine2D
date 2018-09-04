package com.sample.erebus.erebusenginesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.sample.erebus.erebusengine.Animation;
import com.sample.erebus.erebusengine.AnimationListener;
import com.sample.erebus.erebusengine.BounceAnimation;
import com.sample.erebus.erebusengine.ExplodeAnimation;
import com.sample.erebus.erebusengine.FadeInAnimation;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ufo_Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);         //activity_main
        //

        ufo_Image = findViewById(R.id.ufo);
        ufo_Image.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        /*
        new ExplodeAnimation(dummyImage).setListener(new AnimationListener() {

            @Override
            public void onAnimationEnd(Animation animation) {
                //dummyImage.setVisibility(View.VISIBLE);
                new FadeInAnimation(dummyImage).animate();
            }
        }).animate();
*/
        switch(v.getId()) {
            case R.id.ufo:
                // move
                System.out.println("detected lol");
                new BounceAnimation(ufo_Image).setBounceDistance(50).animate();

                break;
        }


    }
}
