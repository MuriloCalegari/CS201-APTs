import java.util.Arrays;
import java.util.HashSet;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){

        HashSet<String> availableIngredients = new HashSet<>(Arrays.asList(available));

        for(int i = 0; i < orders.length; i++) {
            if(availableIngredients.containsAll(Arrays.asList(orders[i].split(" ")))) {
                return i;
            }
        }

        return -1;
    }
}