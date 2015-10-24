package com.uk.ninja.qa.nightvision;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.uk.ninja.qa.nightvision.R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(com.uk.ninja.qa.nightvision.R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the device current time
        final Calendar dtg = Calendar.getInstance();
        int dtgHour = dtg.get(Calendar.HOUR_OF_DAY);
        System.out.println(dtgHour);

        RelativeLayout main_view = (RelativeLayout) findViewById(com.uk.ninja.qa.nightvision.R.id.main_view);
        TextView bodyTitle = (TextView) findViewById(com.uk.ninja.qa.nightvision.R.id.body_title);
        TextView bodyText = (TextView) findViewById(com.uk.ninja.qa.nightvision.R.id.body_text);


        //set night colors
        if (0 <= dtgHour && dtgHour < 5) {
            main_view.setBackgroundColor(Color.parseColor("#000000"));
            bodyTitle.setTextColor(Color.parseColor("#FFFFFF"));
            bodyText.setTextColor(Color.parseColor("#FFFFFF"));
        }
        //set morning colors
        if (5 <= dtgHour && dtgHour < 11) {
            main_view.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bodyTitle.setTextColor(Color.parseColor("#2e69b6"));
            bodyText.setTextColor(Color.parseColor("#000000"));
        }
        //set day colors
        if (11 <= dtgHour && dtgHour < 16) {
            main_view.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bodyTitle.setTextColor(Color.parseColor("#2e69b6"));
            bodyText.setTextColor(Color.parseColor("#000000"));
        }
        //set evening colors
        if (16 <= dtgHour && dtgHour < 22) {
            main_view.setBackgroundColor(Color.parseColor("#000000"));
            bodyTitle.setTextColor(Color.parseColor("#FFFFFF"));
            bodyText.setTextColor(Color.parseColor("#FFFFFF"));
        }
        //set night colors
        if (22 <= dtgHour && dtgHour <= 24) {
            main_view.setBackgroundColor(Color.parseColor("#000000"));
            bodyTitle.setTextColor(Color.parseColor("#FFFFFF"));
            bodyText.setTextColor(Color.parseColor("#FFFFFF"));
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.uk.ninja.qa.nightvision.R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout main_view = (RelativeLayout) findViewById(com.uk.ninja.qa.nightvision.R.id.main_view);
        TextView bodyTitle = (TextView) findViewById(com.uk.ninja.qa.nightvision.R.id.body_title);
        TextView bodyText = (TextView) findViewById(com.uk.ninja.qa.nightvision.R.id.body_text);

        switch (item.getItemId()) {
            case com.uk.ninja.qa.nightvision.R.id.white_black:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#FFFFFF"));
                bodyTitle.setTextColor(Color.parseColor("#2e69b6"));
                bodyText.setTextColor(Color.parseColor("#000000"));
                return true;

            case com.uk.ninja.qa.nightvision.R.id.black_white:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#000000"));
                bodyTitle.setTextColor(Color.parseColor("#FFFFFF"));
                bodyText.setTextColor(Color.parseColor("#FFFFFF"));
                return true;

            case com.uk.ninja.qa.nightvision.R.id.mint_chocolate:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#d0ffdf"));
                bodyTitle.setTextColor(Color.parseColor("#87560b"));
                bodyText.setTextColor(Color.parseColor("#87560b"));
                return true;

            case com.uk.ninja.qa.nightvision.R.id.sepia:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#eedbb6"));
                bodyTitle.setTextColor(Color.parseColor("#87560b"));
                bodyText.setTextColor(Color.parseColor("#87560b"));
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
