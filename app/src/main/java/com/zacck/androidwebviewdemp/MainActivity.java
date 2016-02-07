package com.zacck.androidwebviewdemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mWebView = (WebView)findViewById(R.id.mWebView);

        //setting up the webview
        mWebView.getSettings().setJavaScriptEnabled(true);
        //disable redirecting of links to default browser
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("http://www.zacck.com");

    }
}
