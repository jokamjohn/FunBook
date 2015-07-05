package me.johnkagga.funbook.UI;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.johnkagga.funbook.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class BodyActivityFragment extends Fragment {

    @InjectView(R.id.factNumber)TextView mFactNumber;
    @InjectView(R.id.textViewFact)TextView mFactText;
    @InjectView(R.id.buttonup)Button mButtonup;
    @InjectView(R.id.buttondown)Button mButtondown;

    public BodyActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body, container, false);
        ButterKnife.inject(this,rootView);

        return rootView;
    }
}
