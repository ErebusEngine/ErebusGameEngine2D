package com.sample.erebus.erebusengine.SideScrolling;

import android.content.Context;
import android.graphics.Bitmap;

public interface ScrollingImageViewBitmapLoader {
    Bitmap loadBitmap(Context context, int resourceId);
}
