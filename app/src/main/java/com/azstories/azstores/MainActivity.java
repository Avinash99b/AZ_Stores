package com.azstories.azstores;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wb = findViewById(R.id.webview);

        wb.canGoBack();
       // FloatingActionButton btn = (FloatingActionButton)findViewById(R.id.act);



        wb.setWebViewClient(new WebViewClient());



        wb.getSettings().setJavaScriptEnabled(true);

        wb.loadUrl("https://azstories.com");


    }

    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        WebView wb = findViewById(R.id.webview);
        wb.goBack();
    }
}