import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OlympicCandles{

    List<Integer> myCandles = new ArrayList<>();

    public int numberOfNights(int[] candles){

        for(int candle: candles) myCandles.add(candle);

        myCandles.sort(Comparator.reverseOrder());

        int nights = 0;

        while(burnCandles(nights + 1)) {
            nights++;
        }

        return nights;

    }

    /**
     * @return whether you can still burn enough candles
     */
    private boolean burnCandles(int nights) {

        if(nights > myCandles.size()) return false;

        for(int i = 0; i < nights; i++) {
            if(myCandles.get(i) == 0) {
                return false;
            } else {
                myCandles.set(i, myCandles.get(i) - 1);
            }
        }

        myCandles.sort(Comparator.reverseOrder());
        return true;
    }
}