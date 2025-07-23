package com.example.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import co.paystack.android.Paystack;
import co.paystack.android.PaystackSdk;
import co.paystack.android.model.Card;
import co.paystack.android.model.Charge;
public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        Toast.makeText(this, "Loaded", Toast.LENGTH_SHORT).show();

        String url = getIntent().getStringExtra("link");
        loadCheckout(url);
    }
    @SuppressLint("SetJavaScriptEnabled")
    private void loadCheckout(String  url) {
        WebView webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setDomStorageEnabled(true);

//        webView.loadUrl("https://checkout.paystack.com/nba5gqtzjqncdbd");
        webView.loadUrl(url);
    }
}
