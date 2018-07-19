import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static int findRepeat(int[] theArray) {

        // find a number that appears more than once
        int i;  
        for (i = 0; i <theArray.length; i++)
        {
            if (theArray[Math.abs(theArray[i])] >= 0)
                theArray[Math.abs(theArray[i])] = -theArray[Math.abs(theArray[i])];
            else
                return Math.abs(theArray[i]);
        }    
        return 0;
    }
