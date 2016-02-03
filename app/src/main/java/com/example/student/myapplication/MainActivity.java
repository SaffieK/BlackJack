package com.example.student.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button but;
    FragmentManager fm;
            MainActivityFragment fragment;
    int i = 0;
    TextView tv = null;
    TextView tv2 = null;
    int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        fragment = (MainActivityFragment)fm.findFragmentById(R.id.fragment);
        tv = fragment.tv;
        tv2 = fragment.tv2;
        Typeface tf = Typeface.createFromAsset(getAssets(), "Font");
        tv.setTypeface(tf);
        tv.setTextSize(36);
        tv.setText("Card number: " + Variables.hit + " suit: " + Variables.card[Variables.hit].suit + " rank: " + Variables.card[Variables.hit].rank);
        tv.setTextColor(Color.GREEN);

        tv2.setTypeface(tf);
        tv2.setTextSize(36);
        tv2.setTextColor(Color.GREEN);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void clickMethod(View view) {

        Variables.playerscore = 0;
        Variables.dealerscore = 0;
        Variables.hit++;
        Variables.buttonpressed = 1;

      //  tv.setTextColor(Color.GREEN);
       // tv.setText("Card number: " + Variables.hit + " suit: " + Variables.card[Variables.hit].suit + " rank: " + Variables.card[Variables.hit].rank);
    }

    public void clickMethod1(View view) {

        Variables.playerscore = 0;
        Variables.dealerscore = 0;
        Variables.dealerhit = Variables.hit;
        Variables.buttonpressed = 1;

    }

    public void clickMethod2(View view) {

        Variables.playerscore = 0;
        Variables.dealerscore = 0;
        Variables.hit = 3;
        Variables.dealerhit = 1;
        Variables.buttonpressed = 1;
        fragment.shuffleDeck(Variables.card);

    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
