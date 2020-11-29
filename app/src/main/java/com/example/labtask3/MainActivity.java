package com.example.labtask3;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText redColorValue, greenColorValue, blueColorValue;
    RGBColorModel obj;
    private int red, green, blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        obj = new RGBColorModel(255, 255, 255);
        setContentView(R.layout.activity_main);

        redColorValue = (EditText) findViewById(R.id.red_textfield);
        greenColorValue = (EditText) findViewById(R.id.green_textfield);
        blueColorValue = (EditText) findViewById(R.id.blue_textfield);

        TextChangeHandler tch = new TextChangeHandler();
        redColorValue.addTextChangedListener(tch);
        greenColorValue.addTextChangedListener(tch);
        blueColorValue.addTextChangedListener(tch);
    }

    public void changeColor(){
        String redColorValueString = redColorValue.getText().toString();
        String greenColorValueString = greenColorValue.getText().toString();
        String blueColorValueString = blueColorValue.getText().toString();

        TextView label = (TextView) findViewById(R.id.label);

        try {
            int redColor = Integer.parseInt(redColorValueString);
            int greenColor = Integer.parseInt(greenColorValueString);
            int blueColor = Integer.parseInt(blueColorValueString);

            obj.setRedValue(redColor);
            obj.setGreenValue(greenColor);
            obj.setBlueValue(blueColor);

            red = obj.getRedValue();
            green = obj.getGreenValue();
            blue = obj.getBlueValue();

            label.setBackgroundColor(Color.rgb(red, green, blue));
        }
        catch (NumberFormatException nfe){ }
    }

    private class TextChangeHandler implements TextWatcher{
        @Override
        public void afterTextChanged(Editable editable) {
            changeColor();
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
    }
}
