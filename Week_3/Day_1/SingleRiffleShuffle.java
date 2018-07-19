import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck) {

         if (shuffledDeck == null) 
         { throw new IllegalArgumentException("Input not be null."); 
             
         }
        int len = shuffledDeck.length;
        if (len <= 3) 
        {
            return true; 
        }

        int LastSeenDeckA = shuffledDeck[0];
        final int UNKNOWN_CARD = -1;
        int LastSeenDeckB = UNKNOWN_CARD; 

        for (int i = 1; i < len; i++) {
            int currentCard = shuffledDeck[i];
            if (currentCard == LastSeenDeckA + 1) {
                LastSeenDeckA = currentCard;
            } else if (LastSeenDeckB == UNKNOWN_CARD || currentCard == LastSeenDeckB + 1) 
            {
                LastSeenDeckB = currentCard;
            } else 
            {
                return false;
            }
        }
        return true;
    }

