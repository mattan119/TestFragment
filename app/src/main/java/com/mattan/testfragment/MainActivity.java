package com.mattan.testfragment;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Matt on 16/3/7.
 */
public class MainActivity extends Activity {

    private WebView webView1;
    private WebView webView2;

    @SuppressWarnings("deprecation")
    @SuppressLint({ "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi" })
    @Override

    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String newUA= "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.116 Safari/537.36";



        webView1 = (WebView) findViewById(R.id.webview1);


        WebSettings settings1 = webView1.getSettings();

        settings1.setUseWideViewPort(true);//makes the Webview have a normal viewport (such as a normal desktop browser)
        settings1.setLoadWithOverviewMode(true);//loads the WebView completely zoomed out
        settings1.setBuiltInZoomControls(true);
        settings1.setSupportZoom(true);//设定支持缩放

        webView1.setWebViewClient(new MyWebViewClient());
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.getSettings().setUserAgentString(newUA);
        webView1.setVerticalScrollbarOverlay(true); //指定的垂直滚动条有叠加样式

        webView1.loadUrl("http://113.197.76.40/");
///////////////////////////////////////////////////////////////////////


        webView2 = (WebView) findViewById(R.id.webview2);

        WebSettings settings2 = webView2.getSettings();

        //settings2.setUseWideViewPort(true);//设定支持viewport
        settings2.setLoadWithOverviewMode(true);
        settings2.setBuiltInZoomControls(true);
        settings2.setSupportZoom(true);//设定支持缩放
        webView2.setInitialScale(50);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.getSettings().setUserAgentString(newUA);
        webView2.setWebViewClient(new MyWebViewClient());
        webView2.loadUrl("http://www.m88so.com/Main/Home.aspx");


//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        //---get the current display info---
//        WindowManager wm = getWindowManager();
//        Display d = wm.getDefaultDisplay();
//
//        if (d.getWidth() > d.getHeight()) {
//            //---landscape mode---
//            Fragment1 fragment1 = new Fragment1();
//
//            // android.R.id.content refers to the content
//            // view of the activity
//            fragmentTransaction.replace(android.R.id.content, fragment1);
//        } else {
//            //---portrait mode---
//            Fragment2 fragment2 = new Fragment2();
//            fragmentTransaction.replace(android.R.id.content, fragment2);
//        }
//
//        fragmentTransaction.commit();
    }

    public void openMS(View view) {
        webView2.loadUrl("http://nss.m88so.com/sports.aspx");
    }



}
