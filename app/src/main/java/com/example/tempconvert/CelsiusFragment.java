package com.example.tempconvert;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CelsiusFragment extends Fragment {

    private EditText celciusEditText;
    private Button celciusButton;
    private TextView celciusTextView;

    /*public CelsiusFragment() {
        // Required empty public constructor
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_celsius, container, false);
        return v;
    }



}
