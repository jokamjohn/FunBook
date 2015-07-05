package me.johnkagga.funbook.UI;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.johnkagga.funbook.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class BodyActivityFragment extends Fragment {

    public BodyActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body, container, false);
        return rootView;
    }
}
