package com.example.navigationdrawer;

import static androidx.core.content.ContextCompat.createDeviceProtectedStorageContext;
import static androidx.core.content.ContextCompat.getSystemService;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class NotificationsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate (R.layout.fragment_notifications, container, false);
        ImageView image = (ImageView)rootView.findViewById(R.id.noti_image);
        image.setImageResource(R.drawable.ic_baseline_notifications_24);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Notifications");


        return  rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // TODO Add your menu entries here
        inflater.inflate(R.menu.noti_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.clear_all:
                Toast.makeText(getActivity(),"All cleared",Toast.LENGTH_SHORT).show();
                break;

            case R.id.mark_all_as_read:
                Toast.makeText(getActivity(),"All Marked",Toast.LENGTH_SHORT).show();

                break;

            default:
                break;
        }
        return false;
    }

}
