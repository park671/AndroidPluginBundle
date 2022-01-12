package com.park.plugin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LayoutActivity extends BaseActivity {

  Button mButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mButton = findViewById(R.id.testButton);
    mButton.setOnClickListener(
        v -> Toast.makeText(LayoutActivity.this, "随便弹点什么内容", Toast.LENGTH_SHORT).show());
  }
}
