package me.johnkagga.funbook.Model;

/**
 * Created by John Kagga on 7/5/2015.
 */
public class FactPage {

    private String mFactNumber;
    private String mFactText;
    private String mColor;
    private Choice mChoice1;
    private Choice mChoice2;

    public FactPage(String factNumber, String factText, String color, Choice choice1, Choice choice2) {
        mFactNumber = factNumber;
        mFactText = factText;
        mColor = color;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public String getFactNumber() {
        return mFactNumber;
    }

    public String getFactText() {
        return mFactText;
    }

    public String getColor() {
        return mColor;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }
}
