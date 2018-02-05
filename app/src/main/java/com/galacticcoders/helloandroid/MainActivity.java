package com.galacticcoders.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialPhoneNumber(View view) {
        Intent makeCall = new Intent(Intent.ACTION_DIAL);
        makeCall.setData(Uri.parse("tel:6505555555" ));
        if (makeCall.resolveActivity(getPackageManager()) != null) {
            startActivity(makeCall);
        }
    }

    public void openWebPage(View view) {
        Uri webpage = Uri.parse("https://eu.udacity.com/");
        Intent openBrowser = new Intent(Intent.ACTION_VIEW, webpage);
        if (openBrowser.resolveActivity(getPackageManager()) != null) {
            startActivity(openBrowser);
        }
    }

    public void showMap(View view) {
        Intent openMap = new Intent(Intent.ACTION_VIEW);
        openMap.setData(Uri.parse("geo:37.3999001, -122.1105892"));
        if (openMap.resolveActivity(getPackageManager()) != null) {
            startActivity(openMap);
        }
    }

}
