package com.rajanapps.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  int teamAScore = 0;
    private int teamBScore = 0;

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
        TextView team_a = findViewById(R.id.teamA_score);
        team_a.setText(""+score);
    }

    /**
     *
     * @param score
     */
    private void displayTeamBScore(int score){
        TextView team_b = findViewById(R.id.teamB_score);
        team_b.setText(""+score);
    }

    /**
     * update team a score to score+3
     * @param view
     */

    public void add3ToAScore(View view) {
        teamAScore += 3;
        displayTeamAScore(teamAScore);
    }

    /**
     * update team a score with 2 increment
     * @param view
     */
    public void add2ToAScore(View view) {
        teamAScore += 2;
        displayTeamAScore(teamAScore);;
    }

    /**
     * add 1 to teamAScore;
     * @param view
     */

    public void add1ToAScore(View view) {
        teamAScore += 1;
        displayTeamAScore(teamAScore);
    }

    /**
     * add 3 to teamBScore
     * @param view
     */

    public void add3ToBScore(View view) {
        teamBScore +=3;
        displayTeamBScore(teamBScore);
    }

    /**
     * add 2 to teamBScore
     * @param view
     */

    public void add2ToBScore(View view) {
        teamBScore += 2;
        displayTeamBScore(teamBScore);
    }

    /**
     * add 1 to teamBScore.
     * @param view
     */

    public void add1ToBScore(View view) {
        teamBScore +=1;
        displayTeamBScore(teamBScore);
    }

    /**
     * reset both team score to zero and display.
     * @param view
     */

    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);
    }
}
