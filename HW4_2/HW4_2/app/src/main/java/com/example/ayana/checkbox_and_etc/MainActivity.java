package com.example.ayana.checkbox_and_etc;

import android.content.Intent;
import android.os.Bundle;
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

        chocolateSyrup = (CheckBox) findViewById(R.id.cb_chocolateSyrup);
        crushedNuts = (CheckBox) findViewById(R.id.cb_crushedNuts);
        cherries = (CheckBox) findViewById(R.id.cb_cherries);
        oreoCookieCrumbles = (CheckBox) findViewById(R.id.cb_oreoCookieCrumbles);
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

        displayToast("Toppings: " + checkBoxChoices);
    }
}


