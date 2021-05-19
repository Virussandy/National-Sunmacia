package ns.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Website extends AppCompatActivity {
    private ProgressBar spinner;
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        webview = findViewById(R.id.webview);
//        spinner = findViewById(R.id.spinner);
//        spinner.setVisibility(View.VISIBLE);

        String url;
        url = "https://recruit.ensomerge.com/khatabook/";
        webview.loadUrl(url);
//        webview.loadUrl("file:///android_asset/www/index.php");
        webview.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webSettings.getCacheMode();


//        spinner = findViewById(R.id.progressBar);

//        spinner.setVisibility(View.VISIBLE);

//        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://recruit.ensomerge.com/khatabook/"));
//        startActivity(browserIntent);

    }

    @Override
    public void onBackPressed() {
        if(webview.canGoBack()){
            webview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
    //    @Override
//    protected void onRestart() {
//        super.onRestart();
//        finish();
//    }
}