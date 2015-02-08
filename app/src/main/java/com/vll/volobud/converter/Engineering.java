package com.vll.volobud.converter;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Engineering extends Fragment {

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.engineering, container, false);

        Button buttonTime = (Button)v.findViewById(R.id.buttonTime);

        buttonTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Engineering.this.getActivity(), Time_calculation.class);
                Engineering.this.startActivity(intent);
            }
        });

        return  v;
    }

}
