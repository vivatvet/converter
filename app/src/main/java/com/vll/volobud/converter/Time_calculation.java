package com.vll.volobud.converter;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Time_calculation extends Activity {

    Button buttonClean, buttonNanosecond, buttonMicrosecond, buttonMillisecond;
    EditText editTextNanosecond, editTextMicrosecond, editTextMillisecond;
    double valueNanosecond, valueMicrosecond, valueMillisecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_calculation);

        buttonClean = (Button)findViewById(R.id.buttonClean);
        buttonNanosecond = (Button)findViewById(R.id.buttonNanosecond);
        buttonMicrosecond = (Button)findViewById(R.id.buttonMicrosecond);
        buttonMillisecond = (Button)findViewById(R.id.buttonMillisecond);

        editTextNanosecond = (EditText)findViewById(R.id.editTextNanosecond);
        editTextMicrosecond = (EditText)findViewById(R.id.editTextMicrosecond);
        editTextMillisecond = (EditText)findViewById(R.id.editTextMillisecond);


        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNanosecond.setText(null);
                editTextMicrosecond.setText(null);
                editTextMillisecond.setText(null);
            }
        });

        buttonNanosecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    valueNanosecond = Float.parseFloat(editTextNanosecond.getText().toString());

                } catch (NumberFormatException e) {
                    valueNanosecond = 0;
                }
                valueMicrosecond = valueNanosecond / 1000;
                valueMillisecond = valueNanosecond / 1000000;

                editTextMicrosecond.setText("" + valueMicrosecond);
                editTextMillisecond.setText("" + valueMillisecond);
            }
        });

        buttonMicrosecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    valueMicrosecond = Float.parseFloat(editTextMicrosecond.getText().toString());

                } catch (NumberFormatException e) {
                    valueMicrosecond = 0;
                }
                valueNanosecond = valueMicrosecond * 1000;
                valueMillisecond = valueMicrosecond / 1000;

                editTextNanosecond.setText("" + valueNanosecond);
                editTextMillisecond.setText("" + valueMillisecond);
            }
        });

        buttonMillisecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    valueMillisecond = Float.parseFloat(editTextMillisecond.getText().toString());

                } catch (NumberFormatException e) {
                    valueMillisecond = 0;
                }
                valueNanosecond = valueMillisecond * 1000000;
                valueMicrosecond = valueMillisecond * 1000;

                editTextNanosecond.setText("" + valueNanosecond);
                editTextMicrosecond.setText("" + valueMicrosecond);
            }
        });



        editTextNanosecond.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                enableSubmitIfReady();
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        editTextMicrosecond.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                enableSubmitIfReady();
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        editTextMillisecond.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                enableSubmitIfReady();
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });


    }

    public void enableSubmitIfReady() {

        boolean isReadyNano = editTextNanosecond.getText().toString().length() >= 1;
        boolean isReadyMicro = editTextMicrosecond.getText().toString().length() >= 1;
        boolean isReadyMili = editTextMillisecond.getText().toString().length() >= 1;

        if (isReadyNano) {
            buttonNanosecond.setEnabled(true);
        } else {
            buttonNanosecond.setEnabled(false);
        }


        if (isReadyMicro) {
            buttonMicrosecond.setEnabled(true);
        } else {
            buttonMicrosecond.setEnabled(false);
        }


        if (isReadyMili) {
            buttonMillisecond.setEnabled(true);
        } else {
            buttonMillisecond.setEnabled(false);
        }

        if ((isReadyMili) || (isReadyMicro) || (isReadyNano))  {
            buttonClean.setEnabled(true);
        } else {
            buttonClean.setEnabled(false);
        }
    }
}
