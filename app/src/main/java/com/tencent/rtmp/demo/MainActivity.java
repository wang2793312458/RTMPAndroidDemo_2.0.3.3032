package com.tencent.rtmp.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tencent.rtmp.demo.play.LivePlayerActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
            finish();
            return;
        }

        setContentView(R.layout.activity_main);
        findViewById(R.id.tvt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, LivePlayerActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("PLAY_TYPE", LivePlayerActivity.ACTIVITY_TYPE_VOD_PLAY);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
