package br.com.hotdogdoedelson.remote.esp8266;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button bt = findViewById(R.id.loginButton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent t =new Intent(LoginActivity.this, MainActivity.class);
                startActivity(t);


            }
        });


        ImageView  face = (ImageView) findViewById(R.id.imageView2);
        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ImageView  gmail = (ImageView) findViewById(R.id.imageView3);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        TextView lostPass = (TextView) findViewById(R.id.lostPass);
        lostPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resetPass = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com.br/search?q=resetar+senha"));
                startActivity(resetPass);

            }
        });

        TextView newAcount = (TextView) findViewById(R.id.newAcount);
        newAcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newAcont = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com.br/search?q=nova+conta"));
                startActivity(newAcont);

            }
        });


    }
}
