import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {

        HashMap<String, Integer> freqMap = new HashMap<>();

        for(String s: data) {
            freqMap.putIfAbsent(s, 0);

            freqMap.put(s, freqMap.get(s) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());

        Collections.sort(list, Map.Entry.comparingByKey());

        Collections.sort(list,
                (Map.Entry.comparingByValue(
                        Comparator.reverseOrder()
                ))
        );

        String[] ret = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            ret[i] = entry.getKey();
        }

        return ret;

    }
}