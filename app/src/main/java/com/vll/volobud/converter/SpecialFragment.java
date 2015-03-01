package com.vll.volobud.converter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/**
 * Created by Bender on 31.01.2015.
 */
public class SpecialFragment extends Fragment implements View.OnClickListener {

    RelativeLayout relativeLayout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.special_fragment, container, false);

        relativeLayout = (RelativeLayout)v.findViewById(R.id.activity_converter);
        ImageButton ButtonAcceleration = (ImageButton)v.findViewById(R.id.imageButtonAcceleration);
        ImageButton ButtonCircular_measure = (ImageButton)v.findViewById(R.id.imageButtonCircular_measure);
        ImageButton ButtonDensity = (ImageButton)v.findViewById(R.id.imageButtonDensity);
        ImageButton ButtonEnergy_and_work = (ImageButton)v.findViewById(R.id.imageButtonEnergy_and_work);
        ImageButton ButtonMoment_of_force = (ImageButton)v.findViewById(R.id.imageButtonMoment_of_force);
        ImageButton ButtonPower = (ImageButton)v.findViewById(R.id.imageButtonPower);

        ButtonAcceleration.setOnClickListener(this);
        ButtonCircular_measure.setOnClickListener(this);
        ButtonDensity.setOnClickListener(this);
        ButtonEnergy_and_work.setOnClickListener(this);
        ButtonMoment_of_force.setOnClickListener(this);
        ButtonPower.setOnClickListener(this);

        return v;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButtonAcceleration:
                getActivity().findViewById(R.id.activity_converter).setBackgroundResource(R.drawable.one);break;
            case R.id.imageButtonCircular_measure:
                getActivity().findViewById(R.id.activity_converter).setBackgroundResource(R.drawable.two);break;
            case R.id.imageButtonDensity:
                getActivity().findViewById(R.id.activity_converter).setBackgroundResource(R.drawable.three);break;
            case R.id.imageButtonEnergy_and_work:
                getActivity().findViewById(R.id.activity_converter).setBackgroundResource(R.drawable.four);break;
            case R.id.imageButtonMoment_of_force:
                getActivity().findViewById(R.id.activity_converter).setBackgroundResource(R.drawable.five);break;
            case R.id.imageButtonPower:
                getActivity().findViewById(R.id.activity_converter).setBackgroundResource(R.drawable.six);break;
        }
    }
}
