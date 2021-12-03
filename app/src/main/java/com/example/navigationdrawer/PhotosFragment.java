package com.example.navigationdrawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class PhotosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate (R.layout.fragment_photos, container, false);
        ImageView image = (ImageView)rootView.findViewById(R.id.photo_image);
        image.setImageResource(R.drawable.ic_baseline_photo_library_24);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Photos");
        return  rootView;
    }
}
