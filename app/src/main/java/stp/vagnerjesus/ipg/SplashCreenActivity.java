package stp.vagnerjesus.ipg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashCreenActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT = 3000;//2 segundos

    //Variavel que pretendo animar na intro
    View primeiro,segundo,terceiro,quarto,quinto,sexta;
    TextView descDesenvolvimento;
    ImageView icon;
    //Animation Variable
    Animation topAnimation, iconAnimation, bottonAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splash_creen);


        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottonAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        iconAnimation = AnimationUtils.loadAnimation(this,R.anim.icon_animation);

        //Gancho das variaveis
        /*primeiro = findViewById(R.id.primeira_line);
        segundo = findViewById(R.id.segunda_line);
        terceiro = findViewById(R.id.terceira_line);
        quarto = findViewById(R.id.quarta_line);
        quinto = findViewById(R.id.quinta_line);
        sexta = findViewById(R.id.sexta_line);*/

        icon = findViewById(R.id.logo_image);
        descDesenvolvimento = findViewById(R.id.tagDesenvolvimento);


        /*primeiro.setAnimation(topAnimation);
        segundo.setAnimation(topAnimation);
        terceiro.setAnimation(topAnimation);
        quarto.setAnimation(topAnimation);
        quinto.setAnimation(topAnimation);
        sexta.setAnimation(topAnimation);*/

        icon.setAnimation(iconAnimation);
        descDesenvolvimento.setAnimation(bottonAnimation);


        //Splace Screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashCreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}