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


public class FahrenheitFragment extends Fragment {

    private EditText fahrenheitEditText;
    private Button fahrenheitButton;
    private TextView fahrenheitTextView;
    private NumberFormat numberFormat;
    String getValue,answer;


   /* public FahrenheitFragment() {
        // Required empty public constructor
    }
*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_fahrenheit, container, false);

        fahrenheitEditText= v.findViewById(R.id.fahrenheitEditTextId);
        fahrenheitButton= v.findViewById(R.id.fahrenheitButtonId);
        fahrenheitTextView= v.findViewById(R.id.fahrenheitTextId);
        numberFormat= new DecimalFormat("#.#");

        fahrenheitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double inputFarhenhight= 0.0, outputCelcius=0.0;
                getValue= fahrenheitEditText.getText().toString();
                inputFarhenhight= Double.parseDouble(getValue);
                outputCelcius= (5*inputFarhenhight-160)/9;
                answer= numberFormat.format(outputCelcius).toString();

                fahrenheitTextView.setText(answer+" C");
            }
        });
        return v;
    }


}
