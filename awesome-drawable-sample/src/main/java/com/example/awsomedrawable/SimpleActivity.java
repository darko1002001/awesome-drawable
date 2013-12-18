package com.example.awsomedrawable;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import com.araneaapps.android.libs.awesomedrawable.TextDrawable;

public class SimpleActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simple_activity);
    TextDrawable drawable = new TextDrawable(this);
    drawable.setText("Hello");
    drawable.setTextColor(Color.BLUE);
    ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
    imageView1.setImageDrawable(drawable);
  }

}
