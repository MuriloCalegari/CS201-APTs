import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {

        String[] ret = new String[]{};

        HashSet<String> club1Set = new HashSet<>(Arrays.asList(club1));
        HashSet<String> club2Set = new HashSet<>(Arrays.asList(club2));
        HashSet<String> club3Set = new HashSet<>(Arrays.asList(club3));

        HashSet<String> res1 = new HashSet<>(club1Set);
        HashSet<String> res2 = new HashSet<>(club2Set);
        HashSet<String> res3 = new HashSet<>(club3Set);

        TreeSet<String> dishonests = new TreeSet<>();

        res1.retainAll(club2Set);
        res2.retainAll(club3Set);
        res3.retainAll(club1Set);

        dishonests.addAll(res1);
        dishonests.addAll(res2);
        dishonests.addAll(res3);

        return dishonests.toArray(new String[0]);
    }
}