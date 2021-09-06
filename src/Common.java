import java.util.ArrayList;
import java.util.Arrays;

public class Common {
    public int count (String a, String b) {

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        /*
         For each of the characters in String a, I search for the same character in b.
         I store results in the boolean array countedCharsB, marking the j-th character in B as counted.
         Therefore, duplicates are not counted.
        */

        boolean[] countedCharsB = new boolean[b.length()];

        for(int i = 0; i < charsA.length; i++) {
            char charA = a.charAt(i);
            for (int j = 0; j < charsB.length; j++) {
                if (charA == charsB[j] && !countedCharsB[j]) { // Check if char is common and if it hasn't been counted in B yet
                    countedCharsB[j] = true;

                    // I break the loop so it doesn't continue until the end of String b and
                    // count characters that does not have one in common at String a.
                    break;
                }
            }
        }

        return sumBooleans(countedCharsB);
    }

    public int sumBooleans(boolean[] booleans) {
        int sum = 0;

        for(boolean b: booleans) {
            sum += b ? 1 : 0;
        }

        return sum;
    }
}