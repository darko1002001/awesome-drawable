package com.example.awsomedrawable;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.araneaapps.android.libs.awesomedrawable.AwesomeTextDrawable;

public class SimpleActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simple_activity);

    {
      AwesomeTextDrawable drawable = new AwesomeTextDrawable(this);
      drawable.setIcon("f050");
      drawable.setTextColor(Color.WHITE);
      drawable.setTextColor(Color.GREEN);
      drawable.setTextSize(20.0f);
      ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
      imageView1.setImageDrawable(drawable);
    }


    {
      AwesomeTextDrawable drawable = new AwesomeTextDrawable(this);
      drawable.setIcon("f0eb");
      final TextView textView = (TextView) findViewById(R.id.textView);
      textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
    }

    {
      AwesomeTextDrawable drawable = new AwesomeTextDrawable(this);
      drawable.setIcon("f0ea");
      drawable.setTextSize(50.0f);
      Button button = (Button) findViewById(R.id.button);
      drawable.setTextColor(getResources().getColorStateList(R.drawable.selector));
      button.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
    }

  }

}
