package com.example.labtask3;

public class RGBColorModel {
    private int redValue, greenValue, blueValue;

    public RGBColorModel(int newRedValue, int newGreenValue, int newBlueValue){
        setRedValue(newRedValue);
        setGreenValue(newGreenValue);
        setBlueValue(newBlueValue);
    }

    public void setRedValue(int red){
        if(red < 0){
           redValue = 0;
        }
        else if (red > 255){
            redValue = 255;
        }
        else {
            redValue = red;
        }
    }

    public int getRedValue(){
        return  redValue;
    }

    public void setGreenValue(int green){
        if ( green < 0){
            greenValue = 0;
        }
        else if (green > 255){
           greenValue = 255;
        }
        else {
            greenValue = green;
        }
    }

    public int getGreenValue (){
        return greenValue;
    }

    public void setBlueValue(int blue){
        if (blue < 0){
            blueValue = 0;
        }
        else if (blue > 255){
            blueValue = 255;
        }
        else {
            blueValue = blue;
        }
    }

    public int getBlueValue (){
        return blueValue;
    }
}
