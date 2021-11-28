import java.util.*;

public class Internet {

    HashMap<Integer, List<Integer>> myGraph;

    public int articulationPoints(String[] routers) {

        myGraph = new HashMap<>();

        for(int i = 0; i < routers.length; i++) {
            myGraph.put(i, new ArrayList<>());

            for(String router: routers[i].split(" ")) {
                myGraph.get(i).add(Integer.valueOf(router));
            }
        }

        int count = 0;

        for(Integer router: myGraph.keySet()) {
            if(isArticulationPoint(router)) count++;
        }

        return count;

    }

    private boolean isArticulationPoint(Integer router) {

        List<Integer> connections = myGraph.get(router);

        if(connections.size() == 1) return false;

        for(int i = 0; i < connections.size(); i++) {
            for(int j = i + 1; j < connections.size(); j++) {
                if(!canConnect(connections.get(i), connections.get(j), router, new HashSet<>())) return true;
            }
        }

        return false;
    }

    /**
     * Start from router1 and check if it is connected to router2
     * without going through avoidedRouter
     */
    private boolean canConnect(int router1, int router2, int avoidedRouter, Set<Integer> visited) {

        if(router1 == router2) return true; // routers can connect to themselves

        visited.add(router1);

        List<Integer> adjacentRouters = myGraph.get(router1);

        if(adjacentRouters.size() == 1
                && adjacentRouters.get(0) == avoidedRouter) {
            return false; // if avoidedRouter is only connection to router1, then router1 cannot connect to anyone
        }

        for(int adjacentRouter: adjacentRouters) {
            if(!visited.contains(adjacentRouter)) {
                if (adjacentRouter != avoidedRouter &&
                        canConnect(adjacentRouter, router2, avoidedRouter, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}