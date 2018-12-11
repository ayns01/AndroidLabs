package com.example.ayana.movie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private Spinner mSpinner;
    private ImageView mMovieImageView;
    private TextView mMovieTextView;

    int raws[] = { R.raw.catch_me_if_you_can, R.raw.fight_club, R.raw.forrest_gump,
                   R.raw.the_godfather, R.raw.good_will_hunting, R.raw.pulp_fiction,
                   R.raw.the_hangover, R.raw.the_shawshank_redemption, R.raw.titanic };

    int imgs[] = { R.drawable.catch_me_if_you_can,R.drawable.fight_club, R.drawable.forrest_gump,
                   R.drawable.god_father, R.drawable.good_will_hunting, R.drawable.pulp_fiction,
                   R.drawable.the_hangover, R.drawable.the_shaw_shank_redemption, R.drawable.titanic };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpinner = findViewById(R.id.movie_spinner);
        mMovieImageView = findViewById(R.id.movie_imageView);
        mMovieTextView = findViewById(R.id.movie_text);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mMovieImageView.setImageResource(imgs[i]);
//                int id = getResources().getIdentifier("the_godfather", "raw", getPackageName());
                String result = "";
                Scanner in = new Scanner(getResources().openRawResource(raws[i]));
                while (in.hasNext()) {
                    result += in.nextLine();
                }
                mMovieTextView.setText(result);
                in.close();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
