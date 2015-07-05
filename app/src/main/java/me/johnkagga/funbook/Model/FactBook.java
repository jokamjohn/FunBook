package me.johnkagga.funbook.Model;

/**
 * Created by John Kagga on 7/5/2015.
 */
public class FactBook {

    private FactPage [] mFactPage;

    public FactBook () {
        mFactPage = new FactPage[50];
        /*
        setting the facts
         */
        mFactPage[0] = new FactPage("Fact one","Fact goes here","hex value",
                new Choice("Fact name",1),new Choice("next fact name",2));

    }
}
