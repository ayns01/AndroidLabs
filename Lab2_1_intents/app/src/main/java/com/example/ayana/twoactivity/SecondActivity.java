package com.example.ayana.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.ayana.twoactivity.extra.REPLY";
    public static final String EXTRA_ITEM = "com.example.ayana.twoactivity.extra.ITEM";
    private EditText mReply;
    TextView mTextView;
    TextView mTextViewInScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");


        mTextView = findViewById(R.id.text_message);
        mReply = findViewById(R.id.editText_second);
        mTextViewInScroll = findViewById(R.id.text_into_scroll);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String messageOne = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_ONE);
        String messageTwo = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_TWO);
        String messageThree = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_THREE);

        mTextView.setText(message);

        if (messageOne != null) {
            mTextViewInScroll.setText(messageOne);
        }else if (messageTwo != null) {
            mTextViewInScroll.setText(messageTwo);
        }else if (messageThree != null) {
            mTextViewInScroll.setText(messageThree);
        }
    }

    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG, "End SecondActivity");
        finish();
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    public void preserveItem(View view) {
        String selectedItemName = null;
        switch (view. getId()) {
            case R.id.itemBtn1:
                selectedItemName = "Bread";
                break;

            case R.id.itemBtn2:
                selectedItemName = "Meat";
                break;

            case R.id.itemBtn3:
                selectedItemName = "Fish";
                break;

            case R.id.itemBtn4:
                selectedItemName = "Chocolate";
                break;

            case R.id.itemBtn5:
                selectedItemName = "Peach";
                break;

            case R.id.itemBtn6:
                selectedItemName = "Cheese";
                break;

            case R.id.itemBtn7:
                selectedItemName = "Apple";
                break;

            case R.id.itemBtn8:
                selectedItemName = "Milk";
                break;

            case R.id.itemBtn9:
                selectedItemName = "Lime";
                break;

            case R.id.itemBtn10:
                selectedItemName = "Candy";
                break;
        }

        Intent itemIntent = new Intent();
        itemIntent.putExtra(EXTRA_ITEM, selectedItemName);
        setResult(RESULT_OK, itemIntent);
        finish();
    }
}
