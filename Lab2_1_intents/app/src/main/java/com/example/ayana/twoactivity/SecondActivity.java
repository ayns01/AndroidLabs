package com.example.ayana.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.ayana.twoactivity.extra.REPLY";
    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mReply = findViewById(R.id.editText_second);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String messageOne = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_ONE);
        String messageTwo = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_TWO);
        String messageThree = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_THREE);

        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);

        TextView textViewInScroll = findViewById(R.id.text_into_scroll);

        if (messageOne != null) {
            textViewInScroll.setText(messageOne);
        }else if (messageTwo != null) {
            textViewInScroll.setText(messageTwo);
        }else if (messageThree != null) {
            textViewInScroll.setText(messageThree);
        }
    }

    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
