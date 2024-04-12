 package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

 public class newFullActivity extends AppCompatActivity {
WebView webView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_full);
        String url=getIntent().getStringExtra("url");
        webView=findViewById(R.id.web_view);
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);

    }

     @Override
     public void onBackPressed() {
        if (webView.canGoBack())
            webView.canGoBack();
        else
         super.onBackPressed();
     }
 }