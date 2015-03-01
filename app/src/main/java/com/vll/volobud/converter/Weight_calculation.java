package com.vll.volobud.converter;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by budnik on 09.02.15.
 */
public class Weight_calculation extends Activity {

    Button buttonClean;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_calculation);

        buttonClean = (Button)findViewById(R.id.buttonClean_weight);

        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment frag1 = getFragmentManager().findFragmentById(R.id.w_fragment);
                ((TextView) frag1.getView().findViewById(R.id.editTextWeight)).setText(null);
                ((TextView) frag1.getView().findViewById(R.id.editTextWeightKilogram)).setText(null);
                ((TextView) frag1.getView().findViewById(R.id.editTextWeightMiligram)).setText(null);
            }
        });

    /*    enter_text.addTextChangedListener(new TextWatcher() {
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
        });*/

    }

    /*private void enableSubmitIfReady() {
        boolean isReadyText = enter_text.getText().toString().length() >= 1;
        if (isReadyText) {
            b_gram.setEnabled(true);
        } else {
            b_gram.setEnabled(false);
        }
    }

    private void gram() {
        String text;
        text = enter_text.getText().toString();
        gram.setText(text);
    }*/


}
