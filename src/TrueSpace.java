public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {

        long totalSpace = 0;

        for(int size: sizes) {
            int occupiedClusters = (int) Math.ceil(((double) size)/clusterSize);

            totalSpace += (long) occupiedClusters *clusterSize;
        }

        return totalSpace;

    }
}