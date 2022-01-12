package com.park.plugin;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    LinearLayout linearLayout = new LinearLayout(this);
    linearLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    linearLayout.setGravity(Gravity.CENTER);
    linearLayout.setOrientation(LinearLayout.VERTICAL);

    TextView textView = new TextView(MainActivity.this);
    textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    textView.setGravity(Gravity.CENTER);
    linearLayout.addView(textView);
    textView.setText("I am plugin activity.");
    textView.setTextColor(Color.BLUE);

    ImageView imageView = new ImageView(MainActivity.this);
    imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    linearLayout.addView(imageView);
    imageView.setImageDrawable(getResources().getDrawable(R.drawable.test_img));
    imageView.setOnClickListener(v-> startActivity(new Intent(MainActivity.this, LayoutActivity.class)));

    setContentView(linearLayout);
  }
}