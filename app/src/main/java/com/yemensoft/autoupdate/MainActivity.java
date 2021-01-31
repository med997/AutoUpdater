package com.yemensoft.autoupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.javiersantos.appupdater.AppUpdater;
import com.github.javiersantos.appupdater.enums.Display;
import com.github.javiersantos.appupdater.enums.UpdateFrom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppUpdater appUpdater = new AppUpdater(this);


                appUpdater.setDisplay(Display.DIALOG);
                appUpdater.setUpdateFrom(UpdateFrom.GITHUB);
                appUpdater.setGitHubUserAndRepo("med997","AutoUpdate");

        appUpdater.start();
    }


}