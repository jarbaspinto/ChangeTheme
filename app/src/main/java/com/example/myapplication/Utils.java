package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Utils {
    private static int sTheme;
    public final static int THEME_DEFAULT = 0;
    public final static int THEME_ORGANGE = 1;
    public final static int THEME_GREEN = 2;

    public static void changeToTheme(AppCompatActivity activity, int theme) {
        sTheme = theme;

        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.finish();
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
                case THEME_DEFAULT:
                    activity.setTheme(R.style.FirstTheme);
                    activity.setTitle("tema 1");
                break;
                case THEME_ORGANGE:
                    activity.setTheme(R.style.SecondTheme);
                    activity.setTitle("tema 2");
                break;
                case THEME_GREEN:
                    activity.setTheme(R.style.ThirdTheme);
                    activity.setTitle("tema 3");
                break;
        }
    }
}
