import java.util.*;

public class MedalTable {
    public String[] generate(String[] results) {
        HashMap<String, Country> countriesMap = new HashMap<>();

        for(String result: results) {
            String[] info = result.split(" ");

            String goldCountry = info[0];
            String silverCountry = info[1];
            String bronzeCountry = info[2];

            countriesMap.putIfAbsent(goldCountry, new Country(goldCountry));
            countriesMap.putIfAbsent(silverCountry, new Country(silverCountry));
            countriesMap.putIfAbsent(bronzeCountry, new Country(bronzeCountry));

            countriesMap.get(goldCountry).myGoldCount++;
            countriesMap.get(silverCountry).mySilverCount++;
            countriesMap.get(bronzeCountry).myBronzeCount++;
        }

        List<Country> countries = new ArrayList<>(countriesMap.values());

        countries.sort(Comparator.comparing(Country::getMyName));
        countries.sort(Collections.reverseOrder(Comparator.comparing(Country::getMyBronzeCount)));
        countries.sort(Collections.reverseOrder(Comparator.comparing(Country::getMySilverCount)));
        countries.sort(Collections.reverseOrder(Comparator.comparing(Country::getMyGoldCount)));

        String[] ret = new String[countries.size()];

        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);

            ret[i] = String.format(
                    "%s %s %s %s",
                    country.getMyName(),
                    country.getMyGoldCount(),
                    country.getMySilverCount(),
                    country.getMyBronzeCount()
            );

        }

        return ret;
    }

    private class Country {
        public String myName;
        public int myGoldCount;
        public int mySilverCount;
        public int myBronzeCount;

        public Country(String myName) {
            this.myName = myName;
        }

        public String getMyName() {
            return myName;
        }

        public void setMyName(String myName) {
            this.myName = myName;
        }

        public int getMyGoldCount() {
            return myGoldCount;
        }

        public void setMyGoldCount(int myGoldCount) {
            this.myGoldCount = myGoldCount;
        }

        public int getMySilverCount() {
            return mySilverCount;
        }

        public void setMySilverCount(int mySilverCount) {
            this.mySilverCount = mySilverCount;
        }

        public int getMyBronzeCount() {
            return myBronzeCount;
        }

        public void setMyBronzeCount(int myBronzeCount) {
            this.myBronzeCount = myBronzeCount;
        }
    }
}

