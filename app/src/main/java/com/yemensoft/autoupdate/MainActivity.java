package com.yemensoft.autoupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.javiersantos.appupdater.AppUpdater;
import com.github.javiersantos.appupdater.enums.Display;
import com.github.javiersantos.appupdater.enums.UpdateFrom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppUpdater appUpdater = new AppUpdater(this);
        appUpdater.setDisplay(Display.DIALOG).setUpdateFrom(UpdateFrom.GITHUB)
                .setGitHubUserAndRepo("med997", "AutoUpdater").showEvery(5).start();

    }


    public void GoSecActivity(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }

}