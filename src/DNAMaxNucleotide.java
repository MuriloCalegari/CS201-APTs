import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {

        String result = "";
        char nucChar = nuc.toCharArray()[0];
        ArrayList<Integer> countNuc = new ArrayList<>(strands.length);

        for (int i = 0; i < strands.length; i++) {

            countNuc.add(i, 0);

            for(char c: strands[i].toCharArray()) {
                if(c == nucChar) {
                    countNuc.set(i, countNuc.get(i) + 1);
                }
            }
        }

        int biggestCount = Collections.max(countNuc);

        if(biggestCount != 0) {
            for (int i = 0; i < countNuc.size(); i++) {
                if (countNuc.get(i) == biggestCount && result.length() < strands[i].length()) {
                    result = strands[i];
                }
            }
        }

        return result;
    }
}