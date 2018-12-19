package com.example.ayana.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class RecipeDetailActivity extends AppCompatActivity {
    private ImageView mFoodImage;
    private TextView mFoodRecipe;

    int raws[] = {R.raw.summer_salad,
            R.raw.poached_chicken_salad,
            R.raw.minted_lamb_and_feta_burger,
            R.raw.garlic_butter_basted_turkey,
            R.raw.creamy_shrimp_linguine,
            R.raw.tuscan_sausage_linguine};


    int imgs[] = {R.drawable.summer_salad,
            R.drawable.poached_chicken_salad,
            R.drawable.minted_lamb_and_feta_burger,
            R.drawable.garlic_butter_basted_turkey,
            R.drawable.creamy_shrimp_linguine,
            R.drawable.tuscan_sausage_linguine};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        mFoodImage = findViewById(R.id.food_image);
        mFoodRecipe = findViewById(R.id.food_recipe);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Integer recipe_pos = extras.getInt("recipe_detail");

        mFoodImage.setImageResource(imgs[recipe_pos]);

        String result = "";
        Scanner in = new Scanner(getResources().openRawResource(raws[recipe_pos]));
        while (in.hasNext()) {
            result += in.nextLine();
        }
        mFoodRecipe.setText(result);
        in.close();
    }
}
