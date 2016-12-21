package com.example.tonghung.tabhostdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("tab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tab 1");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("tab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab 2");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("tab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab 3");
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);
    }
}
