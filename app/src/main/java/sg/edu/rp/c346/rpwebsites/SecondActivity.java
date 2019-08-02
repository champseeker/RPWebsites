package sg.edu.rp.c346.rpwebsites;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    WebView wvRP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        wvRP = findViewById(R.id.WebView);

        wvRP.setWebViewClient(new WebViewClient());

        Intent intent = getIntent();

        String url = intent.getStringExtra("website");

        wvRP.loadUrl(url);
        WebSettings webSettings = wvRP.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

    }
}
