package com.example.utilitylibrary;

import android.content.Context;

public class PixelsUtility {

    public static int dpToPixels(Context context, float dp) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    // Utility method to convert pixels to dp
    public static int pixelsToDp(Context context, float pixels) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pixels / scale + 0.5f);
    }
}
