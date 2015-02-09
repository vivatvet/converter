package com.vll.volobud.converter;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by budnik on 20.01.15.
 */
public class BasicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.basic_fragment, null);

        Button button = (Button) v.findViewById(R.id.button_weight);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(BasicFragment.this.getActivity(), Weight_calculation.class);
                BasicFragment.this.startActivity(intent);
            }
        });

        return v;
    }
}
