package com.example.colorpredictionhack;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new WebView(this) {{
            WebSettings settings = getSettings();
            settings.setJavaScriptEnabled(true);
            loadUrl("file:///android_asset/index.html");
        }});
    }
}
