package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Jets = 0;
    int Eagles = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**This adds 6 points to the Jets**/
    public void sixpointsJets (View view) {

        Jets = Jets + 6;
        displayForJets(Jets);

    }
    /**This adds 3 points to the Jets**/
    public void threepointsJets (View view) {

        Jets = Jets + 3;
        displayForJets(Jets);

    }
    /**This adds 2 point to the Jets**/
    public void twopointsJets (View view) {

        Jets = Jets + 2;
        displayForJets(Jets);

    }

    /**This adds 1 point to the Jets**/
    public void onepointJets (View view) {

        Jets = Jets + 1;
        displayForJets(Jets);

    }

    /***Break between the Jets & Eagles***/
    /***Break between the Jets & Eagles***/
    /***Break between the Jets & Eagles***/

    /**This adds 6 points to Eagles**/
    public void sixpointsEagles (View view) {

        Eagles = Eagles + 6;
        displayForEagles(Eagles);

    }
    /**This adds 3 points to Eagles**/
    public void threepointsEagles (View view) {

        Eagles = Eagles + 3;
        displayForEagles(Eagles);

    }

    /**This adds 2 points to the Eagless**/
    public void twopointsEagles (View view) {

        Eagles = Eagles + 2;
        displayForEagles(Eagles);

    }

    /**This adds 1 point to TeamB**/
    public void onepointEagles (View view) {

        Eagles = Eagles + 1;
        displayForEagles(Eagles);

    }

    /**This returns both scores to 0**/
    public void resetButton (View view) {
        Jets = 0;
        Eagles = 0;
        displayForJets(Jets);
        displayForEagles(Eagles);

    }

    public void displayForJets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.jets);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForEagles(int score) {
        TextView scoreView = (TextView) findViewById(R.id.eagles);
        scoreView.setText(String.valueOf(score));
    }



}

