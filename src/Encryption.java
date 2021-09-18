import java.util.HashMap;

public class Encryption {
    public String encrypt(String message){
        char[] ret = new char[message.length()];
        HashMap<Character, Character> mappedCharacters = new HashMap<>();

        char[] charArray = message.toCharArray();
        int greatestChar = 97;

        for (int i = 0; i < charArray.length; i++) {

            char c = charArray[i];

            if(!mappedCharacters.containsKey(c)) {
                mappedCharacters.put(c, (char) greatestChar);
                greatestChar++;
            }

            ret[i] = mappedCharacters.get(c);

        }

        return new String(ret);
    }
}