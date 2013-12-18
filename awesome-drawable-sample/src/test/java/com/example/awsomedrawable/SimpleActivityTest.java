package com.example.awsomedrawable;

import com.example.awsomedrawable.SimpleActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class SimpleActivityTest {
  @Test public void verifyContentViewInjection() {
    SimpleActivity activity = Robolectric.buildActivity(SimpleActivity.class) //
        .create() //
        .get();


  }
}
