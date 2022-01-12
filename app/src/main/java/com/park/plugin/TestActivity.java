package com.park.plugin;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TestActivity extends BaseActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_test);
    WebView webView = findViewById(R.id.wbview);
    webView.setWebViewClient(new WebViewClient() {
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return super.shouldOverrideUrlLoading(view, url);
      }
    });
    webView.loadUrl("https://baidu.com");
  }
}
