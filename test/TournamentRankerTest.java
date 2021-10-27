import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TournamentRankerTest {

    @Test
    void rankTeams() {

        TournamentRanker tournament = new TournamentRanker();

        //tournament.rankTeams(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA"}, new String[]{"L", "T", "L", "FA", "A", "AA", "M", "M", "G", "L", "H", "S", "P", "H", "J", "S", "BA", "P", "", "P", "N", "P", "CA", "S", "M", "R", "S", "CA", "S", "Z", "R", "J"});
        //tournament.rankTeams(new String[]{"RODDICK", "SCHUETTLER", "FERREIRA", "AGASSI"}, new String[]{"SCHUETTLER", "AGASSI", "AGASSI", ""});
        assertArrayEquals(new String[]{ "DUKE",
                "XAVIER",
                "ILLINOIS",
                "TEXAS",
                "SETON HALL",
                "MISSISSIPPI STATE",
                "CINCINNATI",
                "NORTH CAROLINA" }, tournament.rankTeams(new String[]{"DUKE", "SETON HALL", "ILLINOIS", "CINCINNATI",
                "NORTH CAROLINA", "TEXAS", "XAVIER", "MISSISSIPPI STATE"}, new String[]{"", "DUKE", "DUKE", "ILLINOIS",
                "TEXAS", "XAVIER", "DUKE", "XAVIER"}));
    }
}