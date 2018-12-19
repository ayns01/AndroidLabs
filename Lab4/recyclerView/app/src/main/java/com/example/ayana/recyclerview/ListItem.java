package com.example.ayana.recyclerview;

import android.widget.TextView;

public class ListItem {

    private String mRecipeTitle;
    private String mRecipeContent;

    public ListItem(String recipeTitle, String recipeContent){
        mRecipeTitle = recipeTitle;
        mRecipeContent = recipeContent;
    }

    public String getRecipeTitle() {
        return mRecipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        mRecipeTitle = recipeTitle;
    }

    public String getRecipeContent() {
        return mRecipeContent;
    }

    public void setRecipeContent(String recipeContent) {
        mRecipeContent = recipeContent;
    }
}
