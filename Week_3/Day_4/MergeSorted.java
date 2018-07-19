import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static int[] mergeArrays(int[] myArray, int[] alicesArray) {

        // combine the sorted arrays into one large sorted array
        
    int[] answer = new int[myArray.length + alicesArray.length];
    int i = 0, j = 0, k = 0;
    while (i < myArray.length && j < alicesArray.length)
    {
        if (myArray[i] <alicesArray[j])
        {
            answer[k] = myArray[i];
            i++;
        }
        else
        {
            answer[k] = alicesArray[j];
            j++;
        }
        k++;
    }

    while (i < myArray.length)
    {
        answer[k] = myArray[i];
        i++;
        k++;
    }

    while (j < alicesArray.length)
    {
        answer[k] = alicesArray[j];
        j++;
        k++;
    }

    return answer;
    }

