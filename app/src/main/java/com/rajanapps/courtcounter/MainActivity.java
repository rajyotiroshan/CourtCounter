package com.rajanapps.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * @param score
     */
    private void displayTeamAScore(int score){

    }

    /**
     *
     * @param score
     */
    private void displayTeamBScore(int score){

    }

    /**
     * update team a score to score+3
     * @param view
     */

    public void add3ToAScore(View view) {
    }

    /**
     * update team a score with 2 increment
     * @param view
     */
    public void add2ToAScore(View view) {
    }

    public void add1ToAScore(View view) {
    }

    public void add3ToBScore(View view) {
    }

    public void add2ToBScore(View view) {
    }

    public void add1ToBScore(View view) {
    }

    public void resetScore(View view) {
    }
}
