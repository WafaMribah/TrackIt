package web.afor.innovation.team01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AuthentificationActivity extends AppCompatActivity {
    private  Button btn;
    private android.widget.Button btn2;


    @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_authentification);
            btn = (Button) findViewById(R.id.connexion);
            btn2 = (Button) findViewById(R.id.bt_inscription);
         final  EditText  ed1_user = (EditText) findViewById(R.id.ed_username);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                    intent.putExtra("key",ed1_user.getText().toString());
                    startActivity(intent);
                }
            });

    btn2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(getApplicationContext(),SignInActivity.class);
             startActivity(intent);
         }
     });
        }

}
