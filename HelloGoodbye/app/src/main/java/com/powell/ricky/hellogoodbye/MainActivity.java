package com.powell.ricky.hellogoodbye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    // Declaration of the TextView

    private TextView greetingTextView;

    private boolean isHello = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the variable greetingTextView to the textview on activity_main.xml
        greetingTextView = findViewById(R.id.hello);

        Button exclaim_Button = findViewById(R.id.excl_button);

        exclaim_Button.setOnClickListener(toggleGreeting);


        }

    private final View.OnClickListener toggleGreeting = new View.OnClickListener(){

        public void onClick(View button){
            if(isHello)
            {
                isHello = false;
                greetingTextView.setText(R.string.Goodbye);
            }

            else
            {
                isHello = true;
                greetingTextView.setText(R.string.Hello);
            }


        }


    };
}
