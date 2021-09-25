public class PairDown {
    public int[] fold(int[] list) {

        int[] ret = new int[(int) Math.ceil(list.length / 2.0)];

        for(int i = 0; i < list.length; i += 2) {
            ret[i/2] = list[i] + (i + 1 > list.length - 1 ? 0 : list[i + 1]);
        }

        return ret;
    }
}