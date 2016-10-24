package com.giocoso.administrator.shoom;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.giocoso.administrator.shoom.selftestfragment.selfteststart;

public class Selftest extends AppCompatActivity {

    Button logobtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selftest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //back 버튼 추가//
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.backbtn);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
        setTitle("");

        logobtn = (Button) findViewById(R.id.logo_btn);

        logobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.content_selftest, new selfteststart()
        ).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
}

}
