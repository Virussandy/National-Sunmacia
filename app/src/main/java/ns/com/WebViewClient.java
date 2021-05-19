package ns.com;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

public class WebViewClient extends android.webkit.WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        if(Uri.parse(String.valueOf(request)).getHost().endsWith("recruit.ensomerge.com"))
        {
            return false;
        }
//        if(Uri.parse(String.valueOf(request)).getHost().length() == 0) {
//            return false;
//        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.valueOf(request)));
        view.getContext().startActivity(intent);
        return true;
    }
}
