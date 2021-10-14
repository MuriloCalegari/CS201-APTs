import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class OverEnroll {
    public String[] popular(String[] data) {

        String[] res = new String[2];

        HashMap<String, Integer> classesEnrollment = new HashMap<>();

        for(String s: data) {
            String[] info = s.split(":");
            String className = info[0];
            int enrollment = Integer.parseInt(info[2]);

            classesEnrollment.put(
                    className,
                    classesEnrollment.getOrDefault(className, 0) + enrollment
            );
        }

        final String[] mostPopularClass = {""};
        final int[] maxEnrollment = {0};

        final String[] leastPopularClass = {""};
        final int[] minEnrollment = {0};

        // Can be replaced by doing a foreach loop over classesEnrollment.entrySet()
        // This was done in a timed environment / test, so getting this to work was the immediate priority
        classesEnrollment.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String className, Integer enrollment) {
                if(enrollment > maxEnrollment[0]) {
                    mostPopularClass[0] = className;
                    maxEnrollment[0] = enrollment;
                }

                if(enrollment < minEnrollment[0] || leastPopularClass[0].equals("")) {
                    leastPopularClass[0] = className;
                    minEnrollment[0] = enrollment;
                }

            }
        });

        res[0] = mostPopularClass[0] + ":" + maxEnrollment[0];
        res[1] = leastPopularClass[0] + ":" + minEnrollment[0];

        return res;
    }
}