package com.vll.volobud.converter;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by budnik on 20.01.15.
 */
public class BasicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.basic_fragment, container, false);
        //return inflater.inflate(R.layout.basic_fragment, null);
        View v = inflater.inflate(R.layout.basic_fragment, null);

        Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}
