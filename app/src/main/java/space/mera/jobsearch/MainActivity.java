package space.mera.jobsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView LogoImageView = (ImageView) findViewById(R.id.main_logo);
        Animation LogoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_anim);
        LogoImageView.startAnimation(LogoAnimation);
    }

}