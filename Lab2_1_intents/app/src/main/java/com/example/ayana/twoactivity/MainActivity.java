package com.example.ayana.twoactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.ayana.twoactivity.extra.MESSAGE";
    public static final String EXTRA_MESSAGE_ONE = "com.example.ayana.twoactivity.extra.MESSAGE_ONE";
    public static final String EXTRA_MESSAGE_TWO = "com.example.ayana.twoactivity.extra.MESSAGE_TWO";
    public static final String EXTRA_MESSAGE_THREE = "com.example.ayana.twoactivity.extra.MESSAGE_THREE";
    public static final int TEXT_REQUEST = 1;
    public static final int SHOP_REQUEST = 2;

    private EditText mMessageEditText;
    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;

    private TextView mLocationEditText;

    private TextView mItem1TextView;
    private TextView mItem2TextView;
    private TextView mItem3TextView;
    private TextView mItem4TextView;
    private TextView mItem5TextView;
    private TextView mItem6TextView;
    private TextView mItem7TextView;
    private TextView mItem8TextView;
    private TextView mItem9TextView;
    private TextView mItem10TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageEditText = findViewById(R.id.editText_main);
        mReplyHeadTextView = findViewById(R.id.text_header_reply);
        mReplyTextView = findViewById(R.id.text_message_reply);

        mLocationEditText = findViewById(R.id.editText);

        mItem1TextView = findViewById(R.id.item1);
        mItem2TextView = findViewById(R.id.item2);
        mItem3TextView = findViewById(R.id.item3);
        mItem4TextView = findViewById(R.id.item4);
        mItem5TextView = findViewById(R.id.item5);
        mItem6TextView = findViewById(R.id.item6);
        mItem7TextView = findViewById(R.id.item7);
        mItem8TextView = findViewById(R.id.item8);
        mItem9TextView = findViewById(R.id.item9);
        mItem10TextView = findViewById(R.id.item10);

        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
                mReplyHeadTextView.setVisibility(View.VISIBLE);
                mReplyTextView.setText(savedInstanceState.getString("reply_text"));
                mReplyTextView.setVisibility(View.VISIBLE);
            }

            boolean isItem1Visible = savedInstanceState.getBoolean("item1_visible");
            boolean isItem2Visible = savedInstanceState.getBoolean("item2_visible");
            boolean isItem3Visible = savedInstanceState.getBoolean("item3_visible");
            boolean isItem4Visible = savedInstanceState.getBoolean("item4_visible");
            boolean isItem5Visible = savedInstanceState.getBoolean("item5_visible");
            boolean isItem6Visible = savedInstanceState.getBoolean("item6_visible");
            boolean isItem7Visible = savedInstanceState.getBoolean("item7_visible");
            boolean isItem8Visible = savedInstanceState.getBoolean("item8_visible");
            boolean isItem9Visible = savedInstanceState.getBoolean("item9_visible");
            boolean isItem10Visible = savedInstanceState.getBoolean("item10_visible");


            if (isItem1Visible) {
                mItem1TextView.setText(savedInstanceState.getString("selected_item1"));
                mItem1TextView.setVisibility(View.VISIBLE);
            }
            if (isItem2Visible) {
                mItem2TextView.setText(savedInstanceState.getString("selected_item2"));
                mItem2TextView.setVisibility(View.VISIBLE);
            }
            if (isItem3Visible) {
                mItem3TextView.setText(savedInstanceState.getString("selected_item3"));
                mItem3TextView.setVisibility(View.VISIBLE);
            }
            if (isItem4Visible) {
                mItem4TextView.setText(savedInstanceState.getString("selected_item4"));
                mItem4TextView.setVisibility(View.VISIBLE);
            }
            if (isItem5Visible) {
                mItem5TextView.setText(savedInstanceState.getString("selected_item5"));
                mItem5TextView.setVisibility(View.VISIBLE);
            }
            if (isItem6Visible) {
                mItem6TextView.setText(savedInstanceState.getString("selected_item6"));
                mItem6TextView.setVisibility(View.VISIBLE);
            }
            if (isItem7Visible) {
                mItem7TextView.setText(savedInstanceState.getString("selected_item7"));
                mItem7TextView.setVisibility(View.VISIBLE);
            }
            if (isItem8Visible) {
                mItem8TextView.setText(savedInstanceState.getString("selected_item8"));
                mItem8TextView.setVisibility(View.VISIBLE);
            }
            if (isItem9Visible) {
                mItem9TextView.setText(savedInstanceState.getString("selected_item9"));
                mItem9TextView.setVisibility(View.VISIBLE);
            }
            if (isItem10Visible) {
                mItem10TextView.setText(savedInstanceState.getString("selected_item10"));
                mItem10TextView.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (mReplyHeadTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text", mReplyTextView.getText().toString());
        }

        // itemTextView
        if (mItem1TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item1_visible", true);
            outState.putString("selected_item1", mItem1TextView.getText().toString());
        }
        if (mItem2TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item2_visible", true);
            outState.putString("selected_item2", mItem2TextView.getText().toString());
        }
        if (mItem3TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item3_visible", true);
            outState.putString("selected_item3", mItem3TextView.getText().toString());
        }
        if (mItem4TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item4_visible", true);
            outState.putString("selected_item4", mItem4TextView.getText().toString());
        }
        if (mItem5TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item5_visible", true);
            outState.putString("selected_item5", mItem5TextView.getText().toString());
        }
        if (mItem6TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item6_visible", true);
            outState.putString("selected_item6", mItem6TextView.getText().toString());
        }
        if (mItem7TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item7_visible", true);
            outState.putString("selected_item7", mItem7TextView.getText().toString());
        }
        if (mItem8TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item8_visible", true);
            outState.putString("selected_item8", mItem8TextView.getText().toString());
        }
        if (mItem9TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item9_visible", true);
            outState.putString("selected_item9", mItem9TextView.getText().toString());
        }
        if (mItem10TextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("item10_visible", true);
            outState.putString("selected_item10", mItem10TextView.getText().toString());
        }
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String messge = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, messge);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                mReplyHeadTextView.setVisibility(View.VISIBLE);
                mReplyTextView.setText(reply);
                mReplyTextView.setVisibility(View.VISIBLE);
            }
        }

        if (requestCode == SHOP_REQUEST) {
            if (resultCode == RESULT_OK) {
                String item = data.getStringExtra(SecondActivity.EXTRA_ITEM);
                if (item != null) {
                    switch (item) {
                        case "Bread":
                            mItem1TextView.setText(item);
                            mItem1TextView.setVisibility(View.VISIBLE);
                            break;
                        case "Meat":
                            mItem2TextView.setText(item);
                            mItem2TextView.setVisibility(View.VISIBLE);
                            break;
                        case "Fish":
                            mItem3TextView.setText(item);
                            mItem3TextView.setVisibility(View.VISIBLE);
                            break;
                        case "Chocolate":
                            mItem4TextView.setText(item);
                            mItem4TextView.setVisibility(View.VISIBLE);
                            break;
                        case "Peach":
                            mItem5TextView.setText(item);
                            mItem5TextView.setVisibility(View.VISIBLE);
                            break;
                        case "Cheese":
                            mItem6TextView.setText(item);
                            mItem6TextView.setVisibility(View.VISIBLE);
                            break;
                        case "Apple":
                            mItem7TextView.setText(item);
                            mItem7TextView.setVisibility(View.VISIBLE);
                            break;
                        case "Milk":
                            mItem8TextView.setText(item);
                            mItem8TextView.setVisibility(View.VISIBLE);
                            break;
                        case "Lime":
                            mItem9TextView.setText(item);
                            mItem9TextView.setVisibility(View.VISIBLE);
                            break;
                        case "Candy":
                            mItem10TextView.setText(item);
                            mItem10TextView.setVisibility(View.VISIBLE);
                            break;
                    }
                }
            }
        }

    }

    public void intentFromOne(View view) {
        Log.d(LOG_TAG, "one button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String messge = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                "tempor incididunt ut labore et dolore magna aliqua. Sodales ut eu sem integer vitae" +
                " justo eget. Dolor sit amet consectetur adipiscing elit pellentesque habitant. " +
                "Hendrerit gravida rutrum quisque non tellus orci ac auctor. Posuere lorem ipsum " +
                "dolor sit amet. Bibendum at varius vel pharetra vel turpis nunc. Maecenas sed enim " +
                "ut sem viverra aliquet eget. Feugiat scelerisque varius morbi enim nunc faucibus a." +
                " Purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Diam vel quam " +
                "elementum pulvinar. Vel fringilla est ullamcorper eget nulla facilisi. Suspendisse " +
                "sed nisi lacus sed viverra tellus in hac habitasse.Tortor vitae purus faucibus " +
                "ornare. Dictum sit amet justo donec enim. Natoque penatibus et magnis dis parturient" +
                " montes. Euismod in pellentesque massa placerat duis ultricies. Elementum sagittis " +
                "vitae et leo duis ut diam quam nulla. Maecenas ultricies mi eget mauris pharetra et " +
                "ultrices neque. A cras semper auctor neque vitae tempus. Mi proin sed libero enim " +
                "sed faucibus turpis in eu. Nunc sed augue lacus viverra. Malesuada fames ac turpis " +
                "egestas sed tempus urna. Elit scelerisque mauris pellentesque pulvinar. Donec massa " +
                "sapien faucibus et molestie. Risus feugiat in ante metus dictum at tempor commodo " +
                "ullamcorper. Magna sit amet purus gravida quis blandit turpis. Et ligula ullamcorper " +
                "malesuada proin libero nunc consequat interdum varius.";
        intent.putExtra(EXTRA_MESSAGE_ONE, messge);
        startActivity(intent);
    }

    public void intentFromTwo(View view) {
        Log.d(LOG_TAG, "two button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String messge = "Ridiculus mus mauris vitae ultricies leo integer malesuada. Sed cras ornare" +
                " arcu dui. Eget nunc scelerisque viverra mauris in aliquam sem. Sit amet volutpat " +
                "consequat mauris. Congue eu consequat ac felis donec et odio pellentesque diam. " +
                "Pellentesque habitant morbi tristique senectus. Faucibus scelerisque eleifend donec" +
                " pretium vulputate sapien nec. Leo a diam sollicitudin tempor id eu nisl nunc. Neque" +
                " egestas congue quisque egestas diam in. Dignissim enim sit amet venenatis. Dui " +
                "faucibus in ornare quam viverra.Lacus sed turpis tincidunt id aliquet. Faucibus turpis" +
                " in eu mi bibendum neque egestas. Elit duis tristique sollicitudin nibh. Integer eget" +
                " aliquet nibh praesent tristique magna sit amet. In vitae turpis massa sed elementum" +
                " tempus egestas sed. Libero volutpat sed cras ornare arcu. Quis hendrerit dolor magna" +
                " eget est lorem. Dignissim sodales ut eu sem integer vitae justo eget. Fusce id velit" +
                " ut tortor pretium. Etiam tempor orci eu lobortis elementum nibh tellus. Lacus sed " +
                "turpis tincidunt id aliquet. Aliquam etiam erat velit scelerisque in dictum. Neque " +
                "ornare aenean euismod elementum nisi quis. Cursus risus at ultrices mi tempus. " +
                "Viverra nam libero justo laoreet sit. At tempor commodo ullamcorper a. Dictumst " +
                "vestibulum rhoncus est pellentesque elit ullamcorper dignissim.";
        intent.putExtra(EXTRA_MESSAGE_TWO, messge);
        startActivity(intent);
    }

    public void intentFromThree(View view) {
        Log.d(LOG_TAG, "three button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String messge = "Nulla pellentesque dignissim enim sit amet venenatis urna cursus. Arcu risus" +
                " quis varius quam quisque id diam. Risus commodo viverra maecenas accumsan lacus " +
                "vel facilisis. Aliquet nec ullamcorper sit amet risus nullam eget felis. Cursus " +
                "turpis massa tincidunt dui ut ornare lectus sit. Nibh praesent tristique magna sit " +
                "amet purus. Etiam dignissim diam quis enim. Venenatis cras sed felis eget velit " +
                "aliquet. Blandit aliquam etiam erat velit scelerisque. Nulla facilisi morbi tempus " +
                "iaculis.Commodo nulla facilisi nullam vehicula. Dictum fusce ut placerat orci nulla" +
                " pellentesque dignissim enim. Magnis dis parturient montes nascetur ridiculus mus " +
                "mauris vitae ultricies. Non pulvinar neque laoreet suspendisse interdum consectetur." +
                " Cum sociis natoque penatibus et magnis dis parturient montes. Hendrerit dolor magna" +
                " eget est lorem ipsum dolor sit amet. Enim diam vulputate ut pharetra sit amet aliquam." +
                " Id aliquet lectus proin nibh nisl. Vivamus arcu felis bibendum ut tristique et egestas" +
                " quis ipsum. Diam sit amet nisl suscipit adipiscing bibendum est. Velit aliquet sagittis" +
                " id consectetur purus ut. Sed odio morbi quis commodo odio aenean. Nisi scelerisque" +
                " eu ultrices vitae auctor eu augue ut. Hendrerit dolor magna eget est lorem ipsum " +
                "dolor sit amet. Tortor pretium viverra suspendisse potenti nullam. Gravida dictum " +
                "fusce ut placerat.";
        intent.putExtra(EXTRA_MESSAGE_THREE, messge);
        startActivity(intent);
    }

    public void selectItemFromShoppingList(View view) {
         Intent intent = new Intent(this, SecondActivity.class);
         startActivityForResult(intent, SHOP_REQUEST);

    }

    public void showLocation(View view) {
        String loc = mLocationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}
