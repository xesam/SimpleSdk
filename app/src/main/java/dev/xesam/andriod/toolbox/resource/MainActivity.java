package dev.xesam.andriod.toolbox.resource;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import dev.xesam.samplesdk.SampleSdk;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SampleSdk.init(this);

        int a = R.layout.sdk_update_prompt;//0x7f040022
        int b = dev.xesam.applibsdk.R.layout.sdk_update_prompt;//0x7f040022

        findViewById(R.id.check).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SampleSdk.update(getApplicationContext());
            }
        });
    }
}
