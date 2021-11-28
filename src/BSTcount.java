import java.util.HashMap;

public class BSTcount {

    HashMap<Integer, Long> cache = new HashMap<>();

    public long howMany(int[] values) {
        return countTrees(values.length);
    }

    private long countTrees(int nValues) {

        if(nValues == 0 || nValues == 1) return 1;

        if(cache.containsKey(nValues)) return cache.get(nValues);

        long count = 0;

        for(int i = 0; i < nValues; i++) {
            count += countTrees(i) * countTrees(nValues - i - 1);
        }

        cache.put(nValues, count);

        return count;
    }
}