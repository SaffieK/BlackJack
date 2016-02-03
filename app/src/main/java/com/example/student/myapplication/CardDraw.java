package com.example.student.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

/**
 * Created by saffiek on 1/19/16.
 */
public class CardDraw {
    int x;
    int y;

    Bitmap twoclubs;
    Bitmap threeclubs;
    Bitmap fourclubs;
    Bitmap fiveclubs;
    Bitmap sixclubs;
    Bitmap sevenclubs;
    Bitmap eightclubs;
    Bitmap nineclubs;
    Bitmap tenclubs;
    Bitmap jackclubs;
    Bitmap queenclubs;
    Bitmap kingclubs;
    Bitmap aceclubs;

    Bitmap twodiamonds;
    Bitmap threediamonds;
    Bitmap fourdiamonds;
    Bitmap fivediamonds;
    Bitmap sixdiamonds;
    Bitmap sevendiamonds;
    Bitmap eightdiamonds;
    Bitmap ninediamonds;
    Bitmap tendiamonds;
    Bitmap jackdiamonds;
    Bitmap queendiamonds;
    Bitmap kingdiamonds;
    Bitmap acediamonds;

    Bitmap twohearts;
    Bitmap threehearts;
    Bitmap fourhearts;
    Bitmap fivehearts;
    Bitmap sixhearts;
    Bitmap sevenhearts;
    Bitmap eighthearts;
    Bitmap ninehearts;
    Bitmap tenhearts;
    Bitmap jackhearts;
    Bitmap queenhearts;
    Bitmap kinghearts;
    Bitmap acehearts;

    Bitmap twospades;
    Bitmap threespades;
    Bitmap fourspades;
    Bitmap fivespades;
    Bitmap sixspades;
    Bitmap sevenspades;
    Bitmap eightspades;
    Bitmap ninespades;
    Bitmap tenspades;
    Bitmap jackspades;
    Bitmap queenspades;
    Bitmap kingspades;
    Bitmap acespades;

    public CardDraw(Context context) {
        //clubs
        twoclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.twoclubs);
        twoclubs = Bitmap.createScaledBitmap(twoclubs, twoclubs.getWidth() / 3, twoclubs.getWidth()/3, false);

        threeclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.threeclubs);
        threeclubs = Bitmap.createScaledBitmap(threeclubs, threeclubs.getWidth() / 3, threeclubs.getWidth() / 3, false);

        fourclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.fourclubs);
        fourclubs = Bitmap.createScaledBitmap(fourclubs, fourclubs.getWidth() / 3, fourclubs.getWidth()/3, false);

        fiveclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.fiveclubs);
        fiveclubs = Bitmap.createScaledBitmap(fiveclubs, fiveclubs.getWidth() /3, fiveclubs.getWidth()/3, false);

        sixclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.sixclubs);
        sixclubs = Bitmap.createScaledBitmap(sixclubs, sixclubs.getWidth() / 3, sixclubs.getWidth()/3, false);

        sevenclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.sevenclubs);
        sevenclubs = Bitmap.createScaledBitmap(sevenclubs, sevenclubs.getWidth()/3, sevenclubs.getWidth()/3, false);

        eightclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.eightclubs);
        eightclubs = Bitmap.createScaledBitmap(eightclubs, eightclubs.getWidth()/3, eightclubs.getWidth()/3, false);

        nineclubs= BitmapFactory.decodeResource(context.getResources(), R.drawable.nineclubs);
        nineclubs = Bitmap.createScaledBitmap(nineclubs, nineclubs.getWidth()/3, nineclubs.getWidth()/3, false);

        tenclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.tenclubs);
        tenclubs = Bitmap.createScaledBitmap(tenclubs, tenclubs.getWidth()/3, tenclubs.getWidth()/3, false);

        jackclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.jackclubs);
        jackclubs = Bitmap.createScaledBitmap(jackclubs, jackclubs.getWidth()/3, jackclubs.getWidth()/3, false);

        queenclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.queenclubs);
        queenclubs = Bitmap.createScaledBitmap(queenclubs, queenclubs.getWidth()/3, queenclubs.getWidth()/3, false);

        kingclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.kingclubs);
        kingclubs = Bitmap.createScaledBitmap(kingclubs, kingclubs.getWidth()/3, kingclubs.getWidth()/3, false);

        aceclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.aceclubs);
        aceclubs = Bitmap.createScaledBitmap(aceclubs, aceclubs.getWidth()/3, aceclubs.getWidth()/3, false);

        //diamonds
        twodiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.twodiamonds);
        twodiamonds = Bitmap.createScaledBitmap(twodiamonds, twodiamonds.getWidth() / 3, twodiamonds.getWidth()/3, false);

        threediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.threediamonds);
        threediamonds = Bitmap.createScaledBitmap(threediamonds, threediamonds.getWidth() / 3, threediamonds.getWidth() / 3, false);

        fourdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.fourdiamonds);
        fourdiamonds = Bitmap.createScaledBitmap(fourdiamonds, fourdiamonds.getWidth() / 3, fourdiamonds.getWidth()/3, false);

        fivediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.fivediamonds);
        fivediamonds = Bitmap.createScaledBitmap(fivediamonds, fivediamonds.getWidth() /3, fivediamonds.getWidth()/3, false);

        sixdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.sixdiamonds);
        sixdiamonds = Bitmap.createScaledBitmap(sixdiamonds, sixdiamonds.getWidth() / 3, sixdiamonds.getWidth()/3, false);

        sevendiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.sevendiamonds);
        sevendiamonds = Bitmap.createScaledBitmap(sevendiamonds, sevendiamonds.getWidth()/3, sevendiamonds.getWidth()/3, false);

        eightdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.eightdiamonds);
        eightdiamonds = Bitmap.createScaledBitmap(eightdiamonds, eightdiamonds.getWidth()/3, eightdiamonds.getWidth()/3, false);

        ninediamonds= BitmapFactory.decodeResource(context.getResources(), R.drawable.ninediamonds);
        ninediamonds = Bitmap.createScaledBitmap(ninediamonds, ninediamonds.getWidth()/3, ninediamonds.getWidth()/3, false);

        tendiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.tendiamonds);
        tendiamonds = Bitmap.createScaledBitmap(tendiamonds, tendiamonds.getWidth()/3, tendiamonds.getWidth()/3, false);

        jackdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.jackdiamonds);
        jackdiamonds = Bitmap.createScaledBitmap(jackdiamonds, jackdiamonds.getWidth()/3, jackdiamonds.getWidth()/3, false);

        queendiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.queendiamonds);
        queendiamonds = Bitmap.createScaledBitmap(queendiamonds, queendiamonds.getWidth()/3, queendiamonds.getWidth()/3, false);

        kingdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.kingdiamonds);
        kingdiamonds = Bitmap.createScaledBitmap(kingdiamonds, kingdiamonds.getWidth()/3, kingdiamonds.getWidth()/3, false);

        acediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.acediamonds);
        acediamonds = Bitmap.createScaledBitmap(acediamonds, acediamonds.getWidth()/3, acediamonds.getWidth()/3, false);

        //hearts
        twohearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.twohearts);
        twohearts = Bitmap.createScaledBitmap(twohearts, twohearts.getWidth() / 3, twohearts.getWidth()/3, false);

        threehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.threehearts);
        threehearts = Bitmap.createScaledBitmap(threehearts, threehearts.getWidth() / 3, threehearts.getWidth() / 3, false);

        fourhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.fourhearts);
        fourhearts = Bitmap.createScaledBitmap(fourhearts, fourhearts.getWidth() / 3, fourhearts.getWidth()/3, false);

        fivehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.fivehearts);
        fivehearts = Bitmap.createScaledBitmap(fivehearts, fivehearts.getWidth() /3, fivehearts.getWidth()/3, false);

        sixhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.sixhearts);
        sixhearts = Bitmap.createScaledBitmap(sixhearts, sixhearts.getWidth() / 3, sixhearts.getWidth()/3, false);

        sevenhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.sevenhearts);
        sevenhearts = Bitmap.createScaledBitmap(sevenhearts, sevenhearts.getWidth()/3, sevenhearts.getWidth()/3, false);

        eighthearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.eighthearts);
        eighthearts = Bitmap.createScaledBitmap(eighthearts, eighthearts.getWidth()/3, eighthearts.getWidth()/3, false);

        ninehearts= BitmapFactory.decodeResource(context.getResources(), R.drawable.ninehearts);
        ninehearts = Bitmap.createScaledBitmap(ninehearts, ninehearts.getWidth()/3, ninehearts.getWidth()/3, false);

        tenhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.tenhearts);
        tenhearts = Bitmap.createScaledBitmap(tenhearts, tenhearts.getWidth()/3, tenhearts.getWidth()/3, false);

        jackhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.jackhearts);
        jackhearts = Bitmap.createScaledBitmap(jackhearts, jackhearts.getWidth()/3, jackhearts.getWidth()/3, false);

        queenhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.queenhearts);
        queenhearts = Bitmap.createScaledBitmap(queenhearts, queenhearts.getWidth()/3, queenhearts.getWidth()/3, false);

        kinghearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.kinghearts);
        kinghearts = Bitmap.createScaledBitmap(kinghearts, kinghearts.getWidth()/3, kinghearts.getWidth()/3, false);

        acehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.acehearts);
        acehearts = Bitmap.createScaledBitmap(acehearts, acehearts.getWidth()/3, acehearts.getWidth()/3, false);

        //spades
        twospades = BitmapFactory.decodeResource(context.getResources(), R.drawable.twospades);
        twospades = Bitmap.createScaledBitmap(twospades, twospades.getWidth() / 3, twospades.getWidth()/3, false);

        threespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.threespades);
        threespades = Bitmap.createScaledBitmap(threespades, threespades.getWidth() / 3, threespades.getWidth() / 3, false);

        fourspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.fourspades);
        fourspades = Bitmap.createScaledBitmap(fourspades, fourspades.getWidth() / 3, fourspades.getWidth()/3, false);

        fivespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.fivespades);
        fivespades = Bitmap.createScaledBitmap(fivespades, fivespades.getWidth() /3, fivespades.getWidth()/3, false);

        sixspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.sixspades);
        sixspades = Bitmap.createScaledBitmap(sixspades, sixspades.getWidth() / 3, sixspades.getWidth()/3, false);

        sevenspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.sevenspades);
        sevenspades = Bitmap.createScaledBitmap(sevenspades, sevenspades.getWidth()/3, sevenspades.getWidth()/3, false);

        eightspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.eightspades);
        eightspades = Bitmap.createScaledBitmap(eightspades, eightspades.getWidth()/3, eightspades.getWidth()/3, false);

        ninespades= BitmapFactory.decodeResource(context.getResources(), R.drawable.ninespades);
        ninespades = Bitmap.createScaledBitmap(ninespades, ninespades.getWidth()/3, ninespades.getWidth()/3, false);

        tenspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.tenspades);
        tenspades = Bitmap.createScaledBitmap(tenspades, tenspades.getWidth()/3, tenspades.getWidth()/3, false);

        jackspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.jackspades);
        jackspades = Bitmap.createScaledBitmap(jackspades, jackspades.getWidth()/3, jackspades.getWidth()/3, false);

        queenspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.queenspades);
        queenspades = Bitmap.createScaledBitmap(queenspades, queenspades.getWidth()/3, queenspades.getWidth()/3, false);

        kingspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.kingspades);
        kingspades = Bitmap.createScaledBitmap(kingspades, kingspades.getWidth()/3, kingspades.getWidth()/3, false);

        acespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.acespades);
        acespades = Bitmap.createScaledBitmap(acespades, acespades.getWidth()/3, acespades.getWidth()/3, false);
    }

    public void getCanvasDimensions(Canvas canvas) {
        y = canvas.getHeight();
        x = canvas.getWidth();
    }
    public void deal(Canvas canvas, int cardnum, int xdistance, int ydistance) {
        {
           getCanvasDimensions(canvas);
        if (Variables.card[cardnum].suit == 0) {

            if (Variables.card[cardnum].rank == 0) {
                canvas.drawBitmap(twoclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 1) {
                canvas.drawBitmap(threeclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 2) {
                canvas.drawBitmap(fourclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 3) {
                canvas.drawBitmap(fiveclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 4) {
                canvas.drawBitmap(sixclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 5) {
                canvas.drawBitmap(sevenclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 6) {
                canvas.drawBitmap(eightclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 7) {
                canvas.drawBitmap(nineclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 8) {
                canvas.drawBitmap(tenclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 9) {
                canvas.drawBitmap(jackclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 10) {
                canvas.drawBitmap(queenclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 11) {
                canvas.drawBitmap(kingclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 12) {
                canvas.drawBitmap(queenclubs, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }

        }
        if (Variables.card[cardnum].suit == 1) {

            if (Variables.card[cardnum].rank == 0) {
                canvas.drawBitmap(twodiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 1) {
                canvas.drawBitmap(threediamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 2) {
                canvas.drawBitmap(fourdiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 3) {
                canvas.drawBitmap(fivediamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 4) {
                canvas.drawBitmap(sixdiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 5) {
                canvas.drawBitmap(sevendiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 6) {
                canvas.drawBitmap(eightdiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 7) {
                canvas.drawBitmap(ninediamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 8) {
                canvas.drawBitmap(tendiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 9) {
                canvas.drawBitmap(jackdiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 10) {
                canvas.drawBitmap(queendiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 11) {
                canvas.drawBitmap(kingdiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 12) {
                canvas.drawBitmap(queendiamonds, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }

        }

        if (Variables.card[cardnum].suit == 2) {

            if (Variables.card[cardnum].rank == 0) {
                canvas.drawBitmap(twohearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 1) {
                canvas.drawBitmap(threehearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 2) {
                canvas.drawBitmap(fourhearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 3) {
                canvas.drawBitmap(fivehearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 4) {
                canvas.drawBitmap(sixhearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 5) {
                canvas.drawBitmap(sevenhearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 6) {
                canvas.drawBitmap(eighthearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 7) {
                canvas.drawBitmap(ninehearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 8) {
                canvas.drawBitmap(tenhearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 9) {
                canvas.drawBitmap(jackhearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 10) {
                canvas.drawBitmap(queenhearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 11) {
                canvas.drawBitmap(kinghearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 12) {
                canvas.drawBitmap(queenhearts, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }

        }

        if (Variables.card[cardnum].suit == 3) {

            if (Variables.card[cardnum].rank == 0) {
                canvas.drawBitmap(twospades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 1) {
                canvas.drawBitmap(threespades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 2) {
                canvas.drawBitmap(fourspades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 3) {
                canvas.drawBitmap(fivespades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 4) {
                canvas.drawBitmap(sixspades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 5) {
                canvas.drawBitmap(sevenspades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 6) {
                canvas.drawBitmap(eightspades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 7) {
                canvas.drawBitmap(ninespades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 8) {
                canvas.drawBitmap(tenspades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 9) {
                canvas.drawBitmap(jackspades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 10) {
                canvas.drawBitmap(queenspades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 11) {
                canvas.drawBitmap(kingspades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
            if (Variables.card[cardnum].rank == 12) {
                canvas.drawBitmap(queenspades, ((x/2) -500) + xdistance, (y/2) + ydistance, null);
            }
        }

        }

    }
}