import java.util.*;

public class TournamentRanker  {

    HashMap<String, Team> teams = new HashMap<>();

    public String[] rankTeams(String[] names, String[] lostTo) {

        for (int i = 0; i < lostTo.length; i++) {
            String loserName = names[i];
            String winnerName = lostTo[i];

            updateTeams(loserName, winnerName);
        }

        List<Team> rankedTeams = new ArrayList<>(teams.values());

        rankedTeams.sort((new Comparator<Team>() {
            @Override
            public int compare(Team team1, Team team2) {

                if (team1.getGamesWon() != team2.getGamesWon()) {
                    return team2.getGamesWon() - team1.getGamesWon();
                }

                return compare(team1.getLostTo(), team2.getLostTo());
            }
        }));

        String[] ret = new String[rankedTeams.size()];

        for (int i = 0; i < rankedTeams.size(); i++) {
            ret[i] = rankedTeams.get(i).getName();
        }

        return ret;

    }

    private void updateTeams(String loserName, String winnerName) {
        Team loser = null;
        Team winner = null;

        if(!teams.containsKey(loserName)) {
            loser = new Team(loserName);
            teams.put(loserName, loser);
        } else {
            loser = teams.get(loserName);
        }

        if(!winnerName.equals("")) {
            if (!teams.containsKey(winnerName)) {
                winner = new Team(winnerName);
                teams.put(winnerName, winner);
            } else {
                winner = teams.get(winnerName);
            }
        }

        if(winner != null) {
            loser.setLostTo(winner);
            winner.addWonTo(loser);
        }
    }

    private class Team {
        private String myName;
        private Team lostTo;
        private List<Team> wonTo;

        private Team(String name) {
            this.myName = name;
            this.wonTo = new ArrayList<>();
        }

        public String getName() {
            return myName;
        }

        public Team setName(String name) {
            this.myName = name;
            return this;
        }

        public Team getLostTo() {
            return lostTo;
        }

        public Team setLostTo(Team lostTo) {
            this.lostTo = lostTo;
            return this;
        }

        public List<Team> getWonTo() {
            return wonTo;
        }

        public Team setWonTo(List<Team> wonTo) {
            this.wonTo = wonTo;
            return this;
        }

        public void addWonTo(Team loser) {
            wonTo.add(loser);
        }

        public int getGamesWon() {
            return wonTo.size();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Team team = (Team) o;
            return Objects.equals(myName, team.myName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(myName);
        }
    }
}
