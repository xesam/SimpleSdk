package dev.xesam.samplesdk;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.Random;

import dev.xesam.andriod.toolbox.ResReflect;

/**
 * Created by xesamguo@gmail.com on 16-5-12.
 */
public class SampleSdk {

    static ResReflect sResReflect;

    public static void init(Context context) {
        init(context, context.getPackageName());
    }

    public static void init(Context context, String resPackage) {
        sResReflect = new ResReflect(context.getResources(), resPackage);
    }

    static ResReflect getResReflect() {
        return sResReflect;
    }

    public static void update(Context context) {
        int remote = new Random().nextInt(10);
        int local = 2;
        if (remote > local) {
            Intent intent = new Intent(context, UpdatePrompt.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        } else {
            Toast.makeText(context, "no update", Toast.LENGTH_SHORT).show();
        }
    }
}
