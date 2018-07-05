import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;

import static org.junit.Assert.*;

public class PermutPalin {

    public static boolean hasPalindromePermutation(String theString) {

        // check if any permutation of the input is a palindrome
        char[] chars = theString.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<chars.length;i++){
            if(stack.empty()){
                stack.push(chars[i]);
                System.out.println(stack.peek());
            }
            else{
                if(stack.peek().equals(chars[i])){
                    stack.pop();
                }
                else{
                    stack.push(chars[i]);
                }
            }
        }
        System.out.println(stack.size());
        if((stack.empty())||(stack.size()==1)){
            System.out.println("true");
            return true;
        }
        System.out.println("False");
        return false;
    }


















    // tests

    @Test
    public void permutationWithOddNumberOfCharsTest() {
        final boolean result = hasPalindromePermutation("aabcbcd");
        assertTrue(result);
    }

    @Test
    public void permutationWithEvenNumberOfCharsTest() {
        final boolean result = hasPalindromePermutation("aabccbdd");
        assertTrue(result);
    }

    @Test
    public void noPermutationWithOddNumberOfChars() {
        final boolean result = hasPalindromePermutation("aabcd");
        assertFalse(result);
    }

    @Test
    public void noPermutationWithEvenNumberOfCharsTest() {
        final boolean result = hasPalindromePermutation("aabbcd");
        assertFalse(result);
    }

    @Test
    public void emptyStringTest() {
        final boolean result = hasPalindromePermutation("");
        assertTrue(result);
    }

    @Test
    public void oneCharacterStringTest() {
        final boolean result = hasPalindromePermutation("a");
        assertTrue(result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}