# AplikasiBiodata_A11.2020.13197
  
  package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMapEvent(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-7.110195, 111.048412"));
        startActivity(intent);
    }

    public void cellphone(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:08974189030"));
        startActivity(intent);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"faviolaproba@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email"));
        } catch (android.content.ActivityNotFoundException ignored) {
        }
    }
}
