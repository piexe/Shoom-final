package com.giocoso.administrator.shoom;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.giocoso.administrator.shoom.R.id.imageButton1;

public class Findaservicecenter extends AppCompatActivity {

    Button logobtn;
    ImageButton imagebtn1, imagebtn2, imagebtn3, imagebtn4;

    ImageButton backbtn;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findaservicecenter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("");
        logobtn = (Button) findViewById(R.id.logo_btn);

        logobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        imagebtn1 = (ImageButton) findViewById(imageButton1);
        imagebtn2 = (ImageButton) findViewById(R.id.imageButton2);
        imagebtn3 = (ImageButton) findViewById(R.id.imageButton3);
        imagebtn4 = (ImageButton) findViewById(R.id.imageButton4);

        backbtn = (ImageButton) findViewById(R.id.backhome);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        imagebtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebView view2 = new WebView(Findaservicecenter.this);
                view2.getSettings().setJavaScriptEnabled(true);
                WebSettings set = view2.getSettings();
                set.setBuiltInZoomControls(false); // 안드로이드에서 제공하는 줌 아이콘을 사용할 수 있도록 설정
                set.setSupportZoom(false); // 확대,축소 기능을 사용할 수 있도록 설정

                set.setPluginState(WebSettings.PluginState.ON_DEMAND); // 플러그인을 사용할 수 있도록 설정
                set.setSupportMultipleWindows(false); // 여러개의 윈도우를 사용할 수 있도록 설정

                set.setBlockNetworkImage(false); // 네트워크의 이미지의 리소스를 로드하지않음
                set.setLoadsImagesAutomatically(true); // 웹뷰가 앱에 등록되어 있는 이미지 리소스를 자동으로 로드하도록 설정
                set.setUseWideViewPort(true); // wide viewport를 사용하도록 설정

                set.setCacheMode(WebSettings.LOAD_NO_CACHE); // 웹뷰가 캐시를 사용하지 않도록 설정
                view2.loadUrl("https://m.store.naver.com/common/detail?id=12328639");
                AlertDialog.Builder dialog = new AlertDialog.Builder(Findaservicecenter.this);
                dialog.setView(view2);
                dialog.show();


            }
        });
        imagebtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebView view2 = new WebView(Findaservicecenter.this);
                view2.getSettings().setJavaScriptEnabled(true);
                WebSettings set = view2.getSettings();
                set.setBuiltInZoomControls(false); // 안드로이드에서 제공하는 줌 아이콘을 사용할 수 있도록 설정
                set.setSupportZoom(false); // 확대,축소 기능을 사용할 수 있도록 설정

                set.setPluginState(WebSettings.PluginState.ON_DEMAND); // 플러그인을 사용할 수 있도록 설정
                set.setSupportMultipleWindows(false); // 여러개의 윈도우를 사용할 수 있도록 설정

                set.setBlockNetworkImage(false); // 네트워크의 이미지의 리소스를 로드하지않음
                set.setLoadsImagesAutomatically(true); // 웹뷰가 앱에 등록되어 있는 이미지 리소스를 자동으로 로드하도록 설정
                set.setUseWideViewPort(true); // wide viewport를 사용하도록 설정

                set.setCacheMode(WebSettings.LOAD_NO_CACHE); // 웹뷰가 캐시를 사용하지 않도록 설정
                view2.loadUrl("https://m.store.naver.com/common/detail?id=12328639");
                AlertDialog.Builder dialog = new AlertDialog.Builder(Findaservicecenter.this);
                dialog.setView(view2);
                dialog.show();


            }
        });
        imagebtn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebView view2 = new WebView(Findaservicecenter.this);
                view2.getSettings().setJavaScriptEnabled(true);
                WebSettings set = view2.getSettings();
                set.setBuiltInZoomControls(false); // 안드로이드에서 제공하는 줌 아이콘을 사용할 수 있도록 설정
                set.setSupportZoom(false); // 확대,축소 기능을 사용할 수 있도록 설정

                set.setPluginState(WebSettings.PluginState.ON_DEMAND); // 플러그인을 사용할 수 있도록 설정
                set.setSupportMultipleWindows(false); // 여러개의 윈도우를 사용할 수 있도록 설정

                set.setBlockNetworkImage(false); // 네트워크의 이미지의 리소스를 로드하지않음
                set.setLoadsImagesAutomatically(true); // 웹뷰가 앱에 등록되어 있는 이미지 리소스를 자동으로 로드하도록 설정
                set.setUseWideViewPort(true); // wide viewport를 사용하도록 설정

                set.setCacheMode(WebSettings.LOAD_NO_CACHE); // 웹뷰가 캐시를 사용하지 않도록 설정
                view2.loadUrl("https://m.store.naver.com/common/detail?id=21854000");
                AlertDialog.Builder dialog = new AlertDialog.Builder(Findaservicecenter.this);
                dialog.setView(view2);
                dialog.show();


            }
        });
        imagebtn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebView view2 = new WebView(Findaservicecenter.this);
                view2.getSettings().setJavaScriptEnabled(true);
                WebSettings set = view2.getSettings();
                set.setBuiltInZoomControls(false); // 안드로이드에서 제공하는 줌 아이콘을 사용할 수 있도록 설정
                set.setSupportZoom(false); // 확대,축소 기능을 사용할 수 있도록 설정

                set.setPluginState(WebSettings.PluginState.ON_DEMAND); // 플러그인을 사용할 수 있도록 설정
                set.setSupportMultipleWindows(false); // 여러개의 윈도우를 사용할 수 있도록 설정

                set.setBlockNetworkImage(false); // 네트워크의 이미지의 리소스를 로드하지않음
                set.setLoadsImagesAutomatically(true); // 웹뷰가 앱에 등록되어 있는 이미지 리소스를 자동으로 로드하도록 설정
                set.setUseWideViewPort(true); // wide viewport를 사용하도록 설정

                set.setCacheMode(WebSettings.LOAD_NO_CACHE); // 웹뷰가 캐시를 사용하지 않도록 설정
                view2.loadUrl("https://m.store.naver.com/common/detail?id=12330129");
                AlertDialog.Builder dialog = new AlertDialog.Builder(Findaservicecenter.this);
                dialog.setView(view2);
                dialog.show();


            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client3 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Findaservicecenter Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client3.connect();
        AppIndex.AppIndexApi.start(client3, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client3, getIndexApiAction());
        client3.disconnect();
    }
}