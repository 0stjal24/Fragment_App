package com.example.a0stjal24.fragmentapp;

import android.app.Activity;
import android.app.Fragment;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.osmdroid.config.Configuration;
import org.osmdroid.views.MapView;

/**
 * Created by 0stjal24 on 27/04/2017.
 */
public class LocationDetailsFrag extends MainActivity
{
    MapView mv;




    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // This Line sets the user agent, a requirement to download OSM Maps

    }

    public View onCreateView (LayoutInflater inflater, ViewGroup parent,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.activity_main, parent) ;
    }

    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Activity activity = getActivity();

       Configuration.getInstance().load(activity, PreferenceManager.getDefaultSharedPreferences(activity));

        mv = (MapView)activity.findViewById(R.id.map1);

        mv.setBuiltInZoomControls(true);
        mv.getController();
    }

}
