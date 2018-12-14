package com.example.ayana.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chocolateSyrup, crushedNuts, cherries, oreoCookieCrumbles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        chocolateSyrup = (CheckBox) findViewById(R.id.cb_chocolateSyrup);
        crushedNuts = (CheckBox) findViewById(R.id.cb_crushedNuts);
        cherries = (CheckBox) findViewById(R.id.cb_cherries);
        oreoCookieCrumbles = (CheckBox) findViewById(R.id.cb_oreoCookieCrumbles);
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

    public String androidCheckBoxClicked(View view) {
        String checkBoxChoices = "";
        switch (view.getId()) {
            case R.id.cb_chocolateSyrup:
                checkBoxChoices += chocolateSyrup.getText().toString();
                break;
            case R.id.cb_crushedNuts:
                checkBoxChoices += crushedNuts.getText().toString();
                break;
            case R.id.cb_cherries:
                checkBoxChoices += cherries.getText().toString();
                break;
            case R.id.cb_oreoCookieCrumbles:
                checkBoxChoices += oreoCookieCrumbles.getText().toString();
                break;
        }
        return checkBoxChoices;
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showToast(View view) {
        String checkBoxChoices = "";
        if (chocolateSyrup.isChecked()) {
            checkBoxChoices += chocolateSyrup.getText().toString() + ", ";
        }
        if (crushedNuts.isChecked()) {
            checkBoxChoices += crushedNuts.getText().toString() + ", ";
        }
        if (cherries.isChecked()) {
            checkBoxChoices += cherries.getText().toString() + ", ";
        }
        if (oreoCookieCrumbles.isChecked()) {
            checkBoxChoices += oreoCookieCrumbles.getText().toString() + ", ";
        }

        displayToast("Topping: " + checkBoxChoices);
    }
}

