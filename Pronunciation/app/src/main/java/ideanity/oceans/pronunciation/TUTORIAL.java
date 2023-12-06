package ideanity.oceans.pronunciation;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class TUTORIAL extends Activity {

    WebView mWebView;

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);

        Bundle b = getIntent().getExtras();
        mWebView = (WebView) findViewById(R.id.web1);

        mWebView.getSettings().setJavaScriptEnabled(true);

        int result = Integer.parseInt(b.getString("pme1"));

        if (result == 1) {
            mWebView.loadUrl("file:///android_asset/Lesson1.html");

        } else if (result == 2) {
            mWebView.loadUrl("file:///android_asset/Lesson2.html");

        } else if (result == 3) {
            mWebView.loadUrl("file:///android_asset/Lesson3.html");

        } else if (result == 4) {
            mWebView.loadUrl("file:///android_asset/Lesson4.html");

        } else if (result == 5) {
            mWebView.loadUrl("file:///android_asset/Lesson5.html");

        } else if (result == 6) {
            mWebView.loadUrl("file:///android_asset/Lesson6.html");

        } else if (result == 7) {
            mWebView.loadUrl("file:///android_asset/Lesson7.html");

        } else if (result == 8) {
            mWebView.loadUrl("file:///android_asset/Lesson8.html");

        } else if (result == 9) {
            mWebView.loadUrl("file:///android_asset/Lesson9.html");

        } else if (result == 10) {
            mWebView.loadUrl("file:///android_asset/Lesson10.html");

        } else if (result == 11) {
            mWebView.loadUrl("file:///android_asset/Lesson11.html");

        } else if (result == 12) {
            mWebView.loadUrl("file:///android_asset/Lesson12.html");

        } else if (result == 13) {
            mWebView.loadUrl("file:///android_asset/Lesson13.html");

        } else if (result == 14) {
            mWebView.loadUrl("file:///android_asset/Lesson14.html");

        } else if (result == 15) {
            mWebView.loadUrl("file:///android_asset/Lesson15.html");

        }

    }

}
