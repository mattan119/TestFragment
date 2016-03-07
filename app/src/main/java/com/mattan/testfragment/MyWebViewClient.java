package com.mattan.testfragment;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Matt on 16/3/7.
 */
public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}