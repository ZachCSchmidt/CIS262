package com.example.ricky_000.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    // Declare field level Variables that will be shown in different activities
    private String createMsg = (String) getResources().getText(R.string.create_message);
    private String startMsg = (String) getResources().getText(R.string.start_message);
    private String resumeMsg = (String) getResources().getText(R.string.resume_message);
    private String pauseMsg = (String) getResources().getText(R.string.pause_message);
    private String stopMsg = (String) getResources().getText(R.string.stop_message);
    private String restartMsg = (String) getResources().getText(R.string.restart_message);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, createMsg, Toast.LENGTH_SHORT).show();
        Log.d(msg, createMsg);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, startMsg, Toast.LENGTH_SHORT).show();
        Log.d(msg, startMsg);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, resumeMsg, Toast.LENGTH_SHORT).show();
        Log.d(msg, resumeMsg);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, pauseMsg, Toast.LENGTH_SHORT).show();
        Log.d(msg, pauseMsg);
    }

    @Override
    protected void onStop()

    {
        super.onStop();
        Toast.makeText(this, stopMsg, Toast.LENGTH_SHORT).show();
        Log.d(msg, stopMsg);
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,restartMsg, Toast.LENGTH_SHORT).show();
        Log.d(msg, restartMsg);
    }
}
