package com.vll.volobud.converter;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by vladimir on 27.02.15
 */
public class WeightFragment extends Fragment implements TextWatcher, View.OnClickListener {

    EditText Enter_Weight;
    EditText Enter_Weight_Kilogram;
    EditText Enter_Weight_Miligram;

    Button Button_Gram;
    Button Button_Kilogram;
    Button Button_Miligram;
    Button Clean;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.weight_fragment, null);

        Enter_Weight = (EditText) v.findViewById(R.id.editTextWeight);
        Enter_Weight_Kilogram = (EditText) v.findViewById(R.id.editTextWeightKilogram);
        Enter_Weight_Miligram = (EditText) v.findViewById(R.id.editTextWeightMiligram);

        Button_Gram = (Button) v.findViewById(R.id.buttonGram);
        Button_Kilogram = (Button) v.findViewById(R.id.buttonKiloGram);
        Button_Miligram = (Button) v.findViewById(R.id.buttonMiligram);
        Clean = (Button)getActivity().findViewById(R.id.buttonClean_weight);


        Enter_Weight.addTextChangedListener(this);
        Enter_Weight_Kilogram.addTextChangedListener(this);
        Enter_Weight_Miligram.addTextChangedListener(this);

        Button_Gram.setOnClickListener(this);
        Button_Kilogram.setOnClickListener(this);
        Button_Miligram.setOnClickListener(this);


        return v;
    }

    public void enableSubmitIfReady() {
        boolean is_gram = Enter_Weight.getText().toString().length() >= 1;
        boolean is_kilogram = Enter_Weight_Kilogram.getText().toString().length() >= 1;
        boolean is_Miligram = Enter_Weight_Miligram.getText().toString().length() >= 1;

        if (is_gram) {
            Button_Gram.setEnabled(true);
        } else {
            Button_Gram.setEnabled(false);
        }

        if (is_kilogram) {
            Button_Kilogram.setEnabled(true);
        } else {
            Button_Kilogram.setEnabled(false);
        }

        if (is_Miligram) {
            Button_Miligram.setEnabled(true);
        } else {
            Button_Miligram.setEnabled(false);
        }

        //if ((is_gram) || (is_kilogram) || (is_Miligram))  {
            //Clean.setEnabled(true);
        //} else {
           // Clean.setEnabled(false);
        //}
    }

    // Implemented methods
    //===================================================================================
    // Listeners for text fields
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
    @Override
    public void afterTextChanged(Editable s) {
        enableSubmitIfReady();
    }

    // Listeners for Buttons
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonGram:
                Toast.makeText(getActivity(),"Button GRAM",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonKiloGram:
                Toast.makeText(getActivity(),"Button KILOGRAM",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonMiligram:
                Toast.makeText(getActivity(),"Button KILOGRAM",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    //=====================================================================================
}
