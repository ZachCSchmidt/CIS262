package com.example.ricky_000.burgercaloriecounterlab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {

    // Declaring Reference Objects
    private RadioGroup pattyRG;
    private CheckBox prosciuttoCB;
    private RadioGroup cheeseRG;
    private SeekBar sauceSB;
    private TextView caloriesTV;



    private Burger burger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Burger Object
        burger = new Burger();
        // Call Initialize Method
        initialize();

        //Call Change Listner Method
        registerChangeListener();



    }

    // Initialize Method
    private void initialize()
    {
        // Reference the UI components
        pattyRG = findViewById(R.id.radioGroup1);
        prosciuttoCB = findViewById(R.id.checkBox);
        cheeseRG = findViewById(R.id.radioGroup2);
        sauceSB = findViewById(R.id.seekBar);
        caloriesTV = findViewById(R.id.textView2);

        // Call displayCalories method
        displayCalories();
    }

    private void registerChangeListener()
    {
        pattyRG.setOnCheckedChangeListener(foodListener);
        prosciuttoCB.setOnClickListener(baconListener);
        cheeseRG.setOnCheckedChangeListener(foodListener);
        sauceSB.setOnSeekBarChangeListener(sauceListener);
    }

    private OnCheckedChangeListener foodListener = new OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup rbGroup, int radioId) {

            switch(radioId){
                case 0x7f070054: // Beef Patty
                    burger.setPattyCalories(Burger.BEEF); // Beef Setter
                break;

                case 0x7f070055: // Lamb Patty
                    burger.setPattyCalories(Burger.LAMB);
                break;

                case 0x7f070056: // Ostrich Patty
                    burger.setPattyCalories(Burger.OSTRICH);
                break;

                case 0x7f070057: // Asiago Cheese
                    burger.setCheeseCalories(Burger.ASIAGO);
                break;

                case 0x7f070058: // Creme Fraiche
                    burger.setCheeseCalories(Burger.CREME_FRAICHE);
            }
            displayCalories();
        }
    };

    private OnClickListener baconListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if(((CheckBox) v).isChecked())
                burger.setProsciuttoCalories(Burger.PROSCIUTTO);
            else
                burger.clearProsciuttoCalories();

            displayCalories();
        }
    };

    private OnSeekBarChangeListener sauceListener = new OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            burger.setSauceCalories(seekBar.getProgress());
            displayCalories();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };

    private void displayCalories()
    {
        // Output String
        String caloriesText = "Calories: " +burger.getTotalCalories();
        caloriesTV.setText(caloriesText);
    }

}

