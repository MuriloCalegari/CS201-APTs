import java.util.HashMap;

public class MaxDonor {
    public String generous(String[] orgs, int[] amount) {

        HashMap<String, Integer> donations = new HashMap<>();

        for(int i = 0; i < orgs.length; i++) {
            donations.putIfAbsent(orgs[i], 0);
            donations.replace(orgs[i], donations.get(orgs[i]) + amount[i]);
        }

        String kMax = "null";
        int maximumDonation = 0;
        for(String key: donations.keySet()) {
            int donation = donations.get(key);
            if(donation > maximumDonation) {
                kMax = key;
                maximumDonation = donation;
            }
        }

        return String.format("%s:$%s", kMax, maximumDonation);
    }
}
