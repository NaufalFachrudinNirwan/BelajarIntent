package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent;
    Button implicitintent;
    Button latgrid;
    Button grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button) findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button) findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
        explicitintent = (Button) findViewById(R.id.latgrid);
        explicitintent.setOnClickListener(this);
        explicitintent = (Button) findViewById(R.id.grid);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button) findViewById(R.id.implicitintent2);
        implicitintent.setOnClickListener(this);
        implicitintent = (Button) findViewById(R.id.implicitintent3);
        implicitintent.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicitintent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3school.com"));
                startActivity(implicit);
                break;
            case R.id.latgrid:
                Intent latgrid = new Intent(MainActivity.this, LatGridLayoutActivity.class);
                startActivity(latgrid);
                break;
            case R.id.grid:
                Intent grid = new Intent(MainActivity.this, GridLayoutActivity.class);
                startActivity(grid);
                break;
            case R.id.implicitintent2:
                Intent implicit2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
                startActivity(implicit2);
                break;
            case R.id.implicitintent3:
                Intent implicit3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"));
                startActivity(implicit3);
                break;

            default:
                break;
        }
    }
}