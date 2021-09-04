import java.util.Arrays;
import java.util.List;

public class TxMsg {
    public String getMessage(String original) {

        String[] originalWords = original.split(" ");
        String[] encodedWords = new String[originalWords.length];

        for (int i = 0; i < originalWords.length; i++) {
            encodedWords[i] = encode(originalWords[i]);
        }

        return String.join(" ", encodedWords);

    }

    private String encode(String originalWord) {
        StringBuilder encodedWord = new StringBuilder();
        char[] chars = originalWord.toCharArray();

        // I add the first consonant to the encodedWord, if that's the case
        if(isConsonant(chars[0])) {
            encodedWord.append(chars[0]);
        }

        // Iterate through the remaining characters, if it is vowel, do not put it in the encodedWord
        // If it's a consonant, check if previous character is also a consonant.
        for (int i = 1; i < chars.length; i++) {
            if(isConsonant(chars[i]) && !isConsonant(chars[i - 1])) {
                encodedWord.append(chars[i]);
            }

        }

        if(encodedWord.length() == 0) { // Meaning all vowels
            return originalWord;
        } else {
            return encodedWord.toString();
        }
    }

    private boolean isConsonant(char character) {
        List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

        return !VOWELS.contains(character);
    }
}