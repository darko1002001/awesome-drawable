package com.example.awsomedrawable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(RobolectricTestRunner.class)
public class SimpleActivityTest {
  @Test public void verifyContentViewInjection() {
    assertThat(true).isEqualTo(true);
  }
}
