import java.util.Random;

class Solution {

    private static final Random rnd = new Random();
    private static int mStartingInt = 1;

    private static int rand5() {
        return rnd.nextInt(5) + 1;
    }

    public static int rand7() {

        // implement rand7() using rand5()
         mStartingInt = (mStartingInt + 1) % 7 + 1;
        return (mStartingInt + (rand5() - 1) * 5 + rand5() - 1) % 7 + 1;
   
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", rand7());
        }
        System.out.println();
    }
}
