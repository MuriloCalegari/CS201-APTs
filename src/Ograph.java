import java.util.*;

public class Ograph {

    private Map<Integer, List<Integer>> myGraph;
    private Set<Integer> visited;

    public int[] components(String[] data) {

        myGraph = new HashMap<>();
        visited = new HashSet<>();
        List<Set<Integer>> components = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            myGraph.put(i, new ArrayList<>());

            for(String s: data[i].split(" ")) {
                myGraph.get(i).add(Integer.valueOf(s));
            }
        }

        for(int v: myGraph.keySet()) {
            if(!visited.contains(v)) {
                visited.add(v);
                Set<Integer> currentVisit = new HashSet<>();
                explore(v, currentVisit);
                components.add(currentVisit);
            }
        }

        components.sort(Comparator.comparing(Set::size));

        int[] ret = new int[components.size()];

        for (int i = 0; i < components.size(); i++) {
            ret[i] = components.get(i).size();
        }

        return ret;
    }

    private void explore(int v, Set<Integer> currentVisit) {
        visited.add(v);
        currentVisit.add(v);

        for(int connection: myGraph.get(v)) {
            if(!visited.contains(connection)) {
                explore(connection, currentVisit);
            }
        }
    }
}