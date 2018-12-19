package com.example.ayana.recyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final ArrayList<ListItem> mlistItems = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecipeListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mlistItems.add(new ListItem("Summer Salad", "Its peach season so we " +
                "let them be the star in this salad. Baby arugula adds the perfect peppery kick to " +
                "the sweet peaches. All of this gets topped off with the tangy, creamy, marinated " +
                "goat cheese."));
        mlistItems.add(new ListItem("Poached Chicken Salad", "Poaching in this " +
                "dish helps to keep the chicken moist while infusing it with Chinese five spice. " +
                "Topping it off with a tangy and sweet peanut butter chili sauce. And forget the " +
                "crustons because we've got crispy fried wontons!"));
        mlistItems.add(new ListItem("Minted Lamb and Feta Burger", "A thing of" +
                " such delicious, dribble-down-your-chin simplicity, the noble burger can be " +
                "re-invented time and time again to create the most divine dinnertime results. " +
                "For this little incarnation, we’ve taken ground lamb and thrown in a Greek " +
                "twist with a minty fresh kick."));
        mlistItems.add(new ListItem("Garlic-Butter Basted Turkey", "Summer " +
                "pasta salad doesn't have to be boring! We've made ours with crisp celery, bright " +
                "broccoli, sweet yellow pepper, and a creamy dressing. Topped with sliced garlic " +
                "butter basted turkey scallopini!"));
        mlistItems.add(new ListItem("Creamy Shrimp Linguine", "All the elements" +
                " in this dish are classics that are made for one another. Shrimp, spinach and " +
                "tarragon have nothing but love for one another and couldn't pair better with a " +
                "creamy sauce and pasta. Enjoy!"));
        mlistItems.add(new ListItem("Tuscan Sausage Linguine", "Juicy pork " +
                "sausage, thyme, and garlic create the perfect flavour base for this classic pasta" +
                " sauce. This recipe is so simple and delicious, it’s sure to become a part of your" +
                " weekly repertoire."));

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new RecipeListAdapter(this, mlistItems);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create Divider
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL);
        mRecyclerView.addItemDecoration(dividerItemDecoration);
        mRecyclerView.setAdapter(mAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
