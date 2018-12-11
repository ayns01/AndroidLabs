package com.example.ayana.lifecycle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();
    private TextView mMainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainTextView = findViewById(R.id.main_text);

        Intent intent = getIntent();
        Uri uri = intent.getData();
        if (uri != null) {
            String uri_str = uri.toString();
            mMainTextView.setText(uri_str);
        }
    }
}
