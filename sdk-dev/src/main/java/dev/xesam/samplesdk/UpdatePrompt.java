package dev.xesam.samplesdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UpdatePrompt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(SampleSdk.getResReflect().getLayoutId("sdk_update_prompt"));
        findViewById(SampleSdk.getResReflect().getId("sdk_cancel")).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(SampleSdk.getResReflect().getId("sdk_update")).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
