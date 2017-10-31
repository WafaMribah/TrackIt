package web.afor.innovation.team01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
       final Button btn1 = (Button) findViewById(R.id.register);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent ii = new Intent(SignInActivity.this,HomeActivity.class);
                startActivity(ii);
            }
        });
    }

}
