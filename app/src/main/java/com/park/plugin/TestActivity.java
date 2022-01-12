package com.park.plugin;

import android.os.Bundle;
import android.webkit.WebView;

public class TestActivity extends BaseActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_test);
    WebView webView = findViewById(R.id.wbview);
    webView.loadUrl("https://baidu.com");
  }
}
