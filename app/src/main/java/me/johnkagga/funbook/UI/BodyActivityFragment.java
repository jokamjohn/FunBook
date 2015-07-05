package me.johnkagga.funbook.UI;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.johnkagga.funbook.Model.FactBook;
import me.johnkagga.funbook.Model.FactPage;
import me.johnkagga.funbook.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class BodyActivityFragment extends Fragment {

    @InjectView(R.id.factNumber)TextView mFactNumber;
    @InjectView(R.id.textViewFact)TextView mFactText;
    @InjectView(R.id.buttonup)Button mButtonup;
    @InjectView(R.id.buttondown)Button mButtondown;
    @InjectView(R.id.factrelativelayout)RelativeLayout mRelativeLayout;

    private FactPage mFactPage;
    private FactBook mFactBook = new FactBook();

    public BodyActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body, container, false);
        ButterKnife.inject(this,rootView);


        loadPage(0);

        return rootView;
    }

    public void loadPage(int nextPage){
        //Getting reference to the created content
        mFactPage = mFactBook.getPage(nextPage);
        //getting the different values
        String factNumber = mFactPage.getFactNumber();
        mFactNumber.setText(factNumber);

        String fact = mFactPage.getFactText();
        mFactText.setText(fact);

        int backgroundColor = mFactPage.factColor(mFactPage.getColor());
        mRelativeLayout.setBackgroundColor(backgroundColor);

        String buttonLabel = mFactPage.getChoice1().getButtonText();
        mButtonup.setText(buttonLabel);

        String buttonLabel2 = mFactPage.getChoice2().getButtonText();
        mButtondown.setText(buttonLabel2);

        //click listeners
        mButtonup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = mFactPage.getChoice1().getNextPage();
                loadPage(nextPage);
            }
        });

        mButtondown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = mFactPage.getChoice2().getNextPage();
                loadPage(nextPage);
            }
        });

    }
}
