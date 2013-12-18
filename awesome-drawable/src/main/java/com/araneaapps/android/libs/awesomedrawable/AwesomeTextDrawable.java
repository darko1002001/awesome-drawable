/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Aranea D.O.O. Skopje
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.araneaapps.android.libs.awesomedrawable;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;

/**
 * A Drawable object that draws text.
 * A TextDrawable accepts most of the same parameters that can be applied to
 * {@link android.widget.TextView} for displaying and formatting text.
 *
 * Optionally, a {@link android.graphics.Path} may be supplied on which to draw the text.
 *
 * A TextDrawable has an intrinsic size equal to that required to draw all
 * the text it has been supplied, when possible.  In cases where a {@link android.graphics.Path}
 * has been supplied, the caller must explicitly call
 * {@link #setBounds(android.graphics.Rect) setBounds()} to provide the Drawable
 * size based on the Path constraints.
 */
public class AwesomeTextDrawable extends TextDrawable {

  public AwesomeTextDrawable(Context context) {
    super(context);
    setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome.ttf"));
  }

  /*
  Use this method if you already have a hex string. Typically found on the fontawesome css
  ex. $fa-var-fast-forward: "\f050"; -> enter just f050 as code param
  * */
  public void setIcon(String code) {
    setText(Html.fromHtml("&#x" + code + ";"));
  }

}
