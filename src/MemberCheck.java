import java.util.*;

public class MemberCheck {

    private TreeSet<String> dishonests = new TreeSet<>();

    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {

        compare(club1, club2, club3);
        compare(club2, club1, club3);
        compare(club3, club1, club2);

        return dishonests.toArray(new String[0]);
    }

    private void compare(String[] comparingFromClub, String[] comparingTo1, String[] comparingTo2) {
        for(String person: comparingFromClub) {
            if(dishonests.contains(person)) continue;
            if(Collections.frequency(Arrays.asList(comparingTo2), person) > 0) dishonests.add(person);
            if(Collections.frequency(Arrays.asList(comparingTo1), person) > 0) dishonests.add(person);
        }
    }
}