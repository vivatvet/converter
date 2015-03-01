package com.vll.volobud.converter;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static com.vll.volobud.converter.R.id.*;

/**
 * Created by vladimir on 27.02.15.
 */
public class WeightFragment extends Fragment {

    EditText Enter_Weight;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.weight_fragment, null);

        Enter_Weight = (EditText) v.findViewById(R.id.editTextWeight);

        /*Button button = (Button) v.findViewById(R.id.buttonGram);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((Button)getActivity().findViewById(R.id.)).setText("Access from Fragment1");
            }
        });*/


        return v;
    }

}
