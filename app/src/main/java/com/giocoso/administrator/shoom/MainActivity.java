package com.giocoso.administrator.shoom;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.PopupWindow;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.Thing;

import static com.giocoso.administrator.shoom.R.id.videoView;

public class MainActivity extends AppCompatActivity {
    /**
     * Popup관련 변수
     **/
    PopupWindow helper_popup; //팝업//

    View helper_popupview;
    ImageButton helper_option_1;
    ImageButton helper_option_2;
    ImageButton helper_option_3;

    ImageButton option_button;
    ImageButton imageButton, imageButton2, imageButton3;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        option_button = (ImageButton) findViewById(R.id.option_button_popup);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        setSupportActionBar(toolbar);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "campaign1", Toast.LENGTH_SHORT).show();
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "campaign2", Toast.LENGTH_SHORT).show();
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "campaign3", Toast.LENGTH_SHORT).show();
            }
        });
        // 비디오 //

        VideoView vv = (VideoView) findViewById(videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vv);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dead);
        vv.setMediaController(mediaController);
        vv.setVideoURI(uri);
        mediaController.requestFocus();

        vv.start();
        vv.stopPlayback();
        option_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helper_popup.showAtLocation(findViewById(R.id.option_button_popup), Gravity.NO_GRAVITY,
                        getResources().getDimensionPixelSize(R.dimen.popup_x), getResources().getDimensionPixelSize(R.dimen.popup_y));
            }
        });

        helper_popupview = getLayoutInflater().inflate(R.layout.function_popup_layout, null);

        //팝업 뷰에 있는 위젯참조//
        helper_option_1 = (ImageButton) helper_popupview.findViewById(R.id.helper_option_1_button);
        helper_option_2 = (ImageButton) helper_popupview.findViewById(R.id.helper_option_2_button);
        helper_option_3 = (ImageButton) helper_popupview.findViewById(R.id.helper_option_3_button);

        //팝업창 설정.//
        helper_popup = new PopupWindow(helper_popupview, ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT, true);
        helper_popup.setTouchable(true);
        helper_popup.setOutsideTouchable(true);
        helper_popup.setBackgroundDrawable(new BitmapDrawable(getResources(), (Bitmap) null));
        //helper_popup.setAnimationStyle(R.style.PopupAnimationTop);
        helper_popup.getContentView().setFocusableInTouchMode(true);
        helper_popup.getContentView().setFocusable(true);

        setTitle("");
        //팝어업 위젯 이벤트 처리//
        helper_option_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "임종체험", Toast.LENGTH_SHORT).show();

                Intent inent = new Intent(MainActivity.this, DyingExperienceTest.class);

                startActivity(inent);
            }
        });

        helper_option_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "개발정보", Toast.LENGTH_SHORT).show();
            }
        });

        helper_option_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "문의사항", Toast.LENGTH_SHORT).show();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }
}
