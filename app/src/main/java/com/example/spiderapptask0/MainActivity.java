package com.example.spiderapptask0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randnum;
    int newnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randnum = rand.nextInt(500)+1;
        TextView randview = (TextView) findViewById(R.id.textView);
        randview.setText(Integer.toString(randnum));

        newnum = 0;
        TextView yourview = (TextView) findViewById(R.id.textView2);
        yourview.setText(Integer.toString(newnum));

    }

    public void r10p(View view) {
        newnum = newnum + 10;
        TextView yourview10p = (TextView) findViewById(R.id.textView2);
        yourview10p.setText(Integer.toString(newnum));
    }

    public void r10n(View view) {
        newnum = newnum - 10;
        TextView yourview10n = (TextView) findViewById(R.id.textView2);
        yourview10n.setText(Integer.toString(newnum));
    }

    public void r5p(View view) {
        newnum = newnum + 5;
        TextView yourview5p = (TextView) findViewById(R.id.textView2);
        yourview5p.setText(Integer.toString(newnum));
    }

    public void r5n(View view) {
        newnum = newnum - 5;
        TextView yourview5n = (TextView) findViewById(R.id.textView2);
        yourview5n.setText(Integer.toString(newnum));
    }

    public void r2p(View view) {
        newnum = newnum + 2;
        TextView yourview2p = (TextView) findViewById(R.id.textView2);
        yourview2p.setText(Integer.toString(newnum));
    }

    public void r2n(View view) {
        newnum = newnum - 2;
        TextView yourview2n = (TextView) findViewById(R.id.textView2);
        yourview2n.setText(Integer.toString(newnum));
    }

    public void r1p(View view) {
        newnum = newnum + 1;
        TextView yourview1p = (TextView) findViewById(R.id.textView2);
        yourview1p.setText(Integer.toString(newnum));
    }

    public void r1n(View view) {
        newnum = newnum - 1;
        TextView yourview1n = (TextView) findViewById(R.id.textView2);
        yourview1n.setText(Integer.toString(newnum));
    }

    public void enter(View view) {
        TextView result = (TextView) findViewById(R.id.textView6);
        if(newnum==randnum) {
            result.setText("Correct!");
        }
        else {
            result.setText("Incorrect. Try again.");
        }
    }
}
