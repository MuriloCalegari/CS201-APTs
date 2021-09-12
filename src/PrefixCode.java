public class PrefixCode {
    public String isOne(String[] words) {

        for (int i = 0; i < words.length; i++) {
            String wordA = words[i];
            for (String wordB : words) {
                if (!wordA.equals(wordB) && wordB.startsWith(wordA)) {
                    return "No, " + i;
                }
            }
        }

        return "Yes";

    }
}