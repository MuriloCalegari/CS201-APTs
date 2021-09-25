import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Thesaurus {
    public String[] edit(String[] entry) {

        ArrayList<TreeSet<String>> thesaurus = new ArrayList<>();

        for(String s: entry) {
            thesaurus.add(new TreeSet<>(Arrays.asList(s.split(" "))));
        }

        boolean modified = true;

        while(modified) {

            modified = false;

            for (int i = 0; i < thesaurus.size() - 1; i++) {
                TreeSet<String> entry1 = thesaurus.get(i);

                for(int j = i + 1; j < thesaurus.size(); j++) {
                    TreeSet<String> entry2 = thesaurus.get(j);

                    if (countCommonWords(entry1, entry2) >= 2) {
                        entry1.addAll(entry2);
                        thesaurus.remove(entry2);
                        modified = true;
                    }
                }
            }
        }

        String[] ret = new String[thesaurus.size()];

        for(int i = 0; i < ret.length; i++) {
            ret[i] = String.join(" ", thesaurus.get(i));
        }

        Arrays.sort(ret);

        return ret;

    }

    private int countCommonWords(TreeSet<String> entry1, TreeSet<String> entry2) {
        ArrayList<String> entry1Aux = new ArrayList<>(entry1);

        entry1Aux.retainAll(entry2);

        return entry1Aux.size();
    }

}
