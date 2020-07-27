package space.mera.jobsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Launch_screenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_screen);

        ImageView LogoImageView = (ImageView) findViewById(R.id.main_logo);
        Animation LogoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_anim);
        LogoImageView.startAnimation(LogoAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Launch_screenActivity.this, Home_screenActivity.class);
                startActivity(i);
                finish();
            }
        },1350);
    }

}