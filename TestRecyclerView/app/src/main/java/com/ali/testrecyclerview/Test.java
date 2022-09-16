package com.ali.testrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ali.testrecyclerview.ui.main.TestFragment;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TestFragment.newInstance())
                    .commitNow();
        }
    }
}