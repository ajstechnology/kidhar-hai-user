package com.dibc.kidharhai;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.dibc.kidharhai.base.Base;
import com.dibc.kidharhai.models.MOTPRes;
import com.dibc.kidharhai.models.MResLocation;
import com.dibc.kidharhai.utils.APIService;
import com.dibc.kidharhai.utils.ApiClient;
import com.dibc.kidharhai.utils.Constants;
import com.firebase.jobdispatcher.Constraint;
import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.firebase.jobdispatcher.GooglePlayDriver;
import com.firebase.jobdispatcher.Job;
import com.firebase.jobdispatcher.Lifetime;
import com.firebase.jobdispatcher.RetryStrategy;
import com.firebase.jobdispatcher.Trigger;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashboardActivity extends AppCompatActivity implements Base {
    private APIService apiService;
    private FirebaseJobDispatcher jobDispatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
        // callingServices();
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        loadElements();
        initValues();
        setListeners();

        // Send location data
//        sendLocationData(
//                Constants.S_fb_accuracy,
//                Constants.s_fb_altitude,
//                "96.486",
//                "96.486",
//                Constants.s_fb_lat,
//                Constants.s_fb_lng,
//                "23"
//        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }


    @Override
    public void loadElements() {

    }

    @Override
    public void initValues() {
        apiService = ApiClient.getAPIService();
    }

    @Override
    public void setListeners() {

    }

    private void showDlg(String msg) {
        new AlertDialog.Builder(DashboardActivity.this)
                .setTitle(getResources().getString(R.string.app_name))
                .setMessage(msg)
                .setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create().show();
    }

}