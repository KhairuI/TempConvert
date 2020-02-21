package com.example.tempconvert;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class CelsiusFragment extends Fragment {

    private EditText celciusEditText;
    private Button celciusButton;
    private TextView celciusTextView;
    private NumberFormat numberFormat;
    String getValue,answer;

    /*public CelsiusFragment() {
        // Required empty public constructor
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_celsius, container, false);

        celciusEditText= v.findViewById(R.id.celciusEditTextId);
        celciusButton= v.findViewById(R.id.celciusButtonId);
        celciusTextView= v.findViewById(R.id.celciusTextId);

        //set number format
        numberFormat= new DecimalFormat("#.#");

        celciusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double inputCelcius= 0.0, outputFarhenhight=0.0;
                getValue= celciusEditText.getText().toString();
                inputCelcius= Double.parseDouble(getValue);
                outputFarhenhight= (9*inputCelcius)/5 +32;
                answer= numberFormat.format(outputFarhenhight).toString();

                celciusTextView.setText(answer+" F");

            }
        });




        return v;
    }



}
