package com.example.ayana.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

import static android.content.ContentValues.TAG;

public class RecipeListAdapter extends
        RecyclerView.Adapter<RecipeListAdapter.ViewHolder>  {

    private final ArrayList<ListItem> mRecipeList;
    private final LayoutInflater mInflater;
    private RecyclerView mRecyclerView;
    private Context mContext;

    class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView recipeItemTitleView;
        public final TextView recipeItemContentView;
        final RecipeListAdapter mAdapter;

        public ViewHolder(View itemView, RecipeListAdapter adapter) {
            super(itemView);
            recipeItemTitleView = itemView.findViewById(R.id.recipe_title);
            recipeItemContentView = itemView.findViewById(R.id.recipe_content);
            this.mAdapter = adapter;
            itemView.setTag(this);
            itemView.setOnClickListener(onItemClickListener);
        }

        public void onClick(View view) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            int position = viewHolder.getAdapterPosition();
            Intent intent = new Intent(mContext, RecipeDetailActivity.class);
            intent.putExtra("recipe_detail", position);
            mContext.startActivity(intent);
        }
    }

    public RecipeListAdapter(Context context, ArrayList<ListItem> recipeList) {
        mInflater = LayoutInflater.from(context);
        this.mRecipeList = recipeList;
        this.mContext = context;
    }

    @Override
    public RecipeListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.recipelist_item, parent, false);
        return new ViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(RecipeListAdapter.ViewHolder holder,
                                 int position) {
        // Retrieve the data for that position.
        ListItem mCurrent = mRecipeList.get(position);
        // Add the data to the view holder.
        holder.recipeItemTitleView.setText(mCurrent.getRecipeTitle());
        holder.recipeItemContentView.setText(mCurrent.getRecipeContent());
    }

    @Override
    public int getItemCount() {
        return mRecipeList.size();
    }

    private View.OnClickListener onItemClickListener;
    public void setItemClickListener(View.OnClickListener clickListener) {
        onItemClickListener = clickListener;
    }
}