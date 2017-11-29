package com.sardegnaisoladicavalli.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToClassroom (View view) {
        goToUrl("https://classroom.udacity.com");

    }

    public void goToForum (View view) {
        goToUrl("https://discussions.udacity.com/");

    }

    public void goToWebsite (View view) {
        goToUrl("https://www.udacity.com/");

    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
