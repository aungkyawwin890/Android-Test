package com.example.arkar.bmvslidingdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BrowserDemo4 extends AppCompatActivity {

    WebView browser;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_demo4);

        browser=(WebView)findViewById(R.id.webkit);

        browser.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);

                return(true);
            }
        });

        browser.loadUrl("http://commonsware.com");
    }
}
