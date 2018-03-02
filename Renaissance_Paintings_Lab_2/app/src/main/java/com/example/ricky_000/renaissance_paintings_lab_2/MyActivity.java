package com.example.ricky_000.renaissance_paintings_lab_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

// Paintings
    private LinearLayout _LinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        // Set _LinearLayout variable to the layout in xml file
        _LinearLayout = findViewById(R.id.linearLayout);

        // Filling scrollable layout with paint images
        fillPaintingGallery();
    }

    private void fillPaintingGallery()
    {
        // Populating LinearLayout Gallery

        ImageButton buttonItem;

        for(int x = 0; x < RenaissanceDatabase.description.length; x++)
        {
            // Storing the paintings as buttons in the scroll
            buttonItem = new ImageButton(this);

            Painting painting = new Painting(RenaissanceDatabase.description[x],
                    RenaissanceDatabase.paintings[x]);

            // Storing Painting Data

            buttonItem.setContentDescription(painting.getDescription());

            // Use paintings Unique ID to load
            buttonItem.setImageDrawable(getResources().getDrawable(painting.getId()));

            // Set Onclick Listner for Image Button

            buttonItem.setOnClickListener(displayPaintingInformation);

            // Add Image Button to Scrollable Linear List

            _LinearLayout.addView(buttonItem);


        }
    }

    private View.OnClickListener displayPaintingInformation = new View.OnClickListener(){
        public void onClick(View btn){
            // Collecting information about painting
            String paintingDesc = (String) btn.getContentDescription();

            // Method call to display information
            displayPaintings(paintingDesc);
        }
    };

    private void displayPaintings(String paintingDescription)
    {
        // Showing information about painting as a toast with short display life
        Toast.makeText(this, paintingDescription, Toast.LENGTH_SHORT).show();
    }

}
