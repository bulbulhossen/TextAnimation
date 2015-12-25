package com.bulbulhossen.textanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

public class MainActivity extends AppCompatActivity {

    HTextView hTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        Github:  linek
//        https://github.com/hanks-zyh/HTextView

        hTextView = (HTextView) findViewById(R.id.text2);
        hTextView.setAnimateType(HTextViewType.LINE);
        hTextView.animateText("Bangladesh"); // animate
    }
}
