package com.vll.volobud.converter;

import android.app.Activity;
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

    Button b_gram;
    EditText enter_text;
    TextView gram;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_calculation);

        gram = (TextView)findViewById(R.id.gram);
        b_gram = (Button)findViewById(R.id.buttonGram);
        enter_text = (EditText)findViewById(R.id.editText_weight);

        b_gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gram();
            }
        });

        enter_text.addTextChangedListener(new TextWatcher() {
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
        });

    }

    private void enableSubmitIfReady() {
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
    }
}
