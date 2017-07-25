package com.example.projectnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.*;

public class MainActivity extends AppCompatActivity {

    TextView mTextLabel;
    BeaconClass beaconClass = new BeaconClass();
    MapClass  mapClass = new MapClass();
    NavigationClass navigationClass = new NavigationClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextLabel=(TextView)findViewById(R.id.label);
        mTextLabel.setText("");
        mTextLabel.append(beaconClass.LabelBeacon);
        mTextLabel.append("\n");
        mTextLabel.append(mapClass.LabelMap);
        mTextLabel.append("\n");
        mTextLabel.append(navigationClass.LabelNavigation);
    }
}
