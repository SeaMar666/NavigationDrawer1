package com.example.navigationdrawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate (R.layout.fragment_settings, container, false);
        ImageView image = (ImageView)rootView.findViewById(R.id.setting_image);
        image.setImageResource(R.drawable.ic_baseline_settings_24);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Settings");
        return  rootView;
    }
}
