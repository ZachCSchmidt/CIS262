package com.example.ricky_000.calculator_lab_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {

    private TextView _NumberDisplay;
    private SimpleExpression _Expression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        _NumberDisplay  = findViewById(R.id.textView1);

        _Expression = new SimpleExpression(); // Declaring Object
    }

    public void goAC(View view)
    {
        _Expression.clearOperands();
        _NumberDisplay.setText("0");
    }

    public void goOperand(View view)
    {
        String value = (String)_NumberDisplay.getText();
        String digit = (String)view.getContentDescription();
        if(value.charAt(0) =='0')
            _NumberDisplay.setText(digit);
        else
            _NumberDisplay.setText((String) _NumberDisplay.getText() + digit.charAt(0));

    }

    public void goOperator(View view)
    {
        String operator = (String) view.getContentDescription();
        try{ // try catch block
            String value = (String) _NumberDisplay.getText();
            _Expression.set_Operand1((int) Integer.parseInt(value.toString()));
        }
        catch(NumberFormatException ex)
        {
            _Expression.set_Operand1(0);
        }

        _NumberDisplay.setText("0");
        _Expression.setOperator(operator);
    }

    public void goCompute (View view)
    {
        try{ // try catch block
            String value = (String) _NumberDisplay.getText();
            _Expression.setOperand2((int) Integer.parseInt(value.toString()));
        }
        catch(NumberFormatException ex)
        {
            _Expression.setOperand2(0);
        }

        _NumberDisplay.setText(_Expression.getValue().toString());
    }
}
