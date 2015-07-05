package me.johnkagga.funbook;

/**
 * Created by John Kagga on 7/5/2015.
 */
public class Choice {
    private String mButtonText;
    private int mNextPage;


    public Choice(String buttonText, int nextPage) {
        mButtonText = buttonText;
        mNextPage = nextPage;
    }

    public String getButtonText() {
        return mButtonText;
    }

    public void setButtonText(String buttonText) {
        mButtonText = buttonText;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
