package com.example.student.myapplication;

import android.graphics.Color;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Button but;
    Card[] card;
    int z = 0;
    View rootView;
    TextView tv;
    TextView tv2;
    Handler mHandler = new Handler();

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container,
                false);
        tv = (TextView) rootView.findViewById(R.id.textView);
        tv2 = (TextView) rootView.findViewById(R.id.textView2);
        tv2.setTextColor(Color.WHITE);
        tv.setTextColor(Color.WHITE);
        rootView.setBackgroundColor(Color.BLACK);

        card = new Card[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                card[z] = new Card(suit, rank);
                z++;
            }
        }

        card = shuffleDeck(card);
        Variables.card = card;

        mHandler.post(mUpdate);

        return rootView;

    }
    private Runnable mUpdate = new Runnable() {

        public void run() {
            tv.setText("" + Variables.playerscore + " ");
            tv2.setText("" + Variables.dealerscore + " ");

            if(Variables.buttonpressed == 0) {
                if(Variables.dealerhit > 1) {
                    if(Variables.dealerscore < 17 && Variables.dealerscore!= 0) {
                        Variables.playerscore = 0;
                        Variables.dealerscore = 0;
                        Variables.dealerhit++;
                        Variables.buttonpressed = 1;
                    }
                }
            }
            mHandler.postDelayed(this, 1);
        }
    };

    public Card[] shuffleDeck(Card[] deck) {
        Random rnd = new Random();
        Card tempCard = new Card(0, 0);
        for (int shuffleCount = 0; shuffleCount < 52; shuffleCount++) {
            int randomCard = rnd.nextInt(52);
            tempCard = deck[randomCard];
            deck[randomCard] = deck[shuffleCount];
            deck[shuffleCount] = tempCard;

        }

        return deck;
        }
    }
