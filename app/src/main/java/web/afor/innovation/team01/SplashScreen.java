package web.afor.innovation.team01;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent intent= new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();


            }
        }, 5000);
    }
}
