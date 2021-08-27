public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r,
                            int x1, int y1, int x2, int y2) {

        /*
         If you are inside a district and your destination does not include that district,
         you need to get out of it in order to get to the other point. The same is valid for
         districts that exclusively contains your point of destination. You < must > cross them
         in order to get inside.
         Hence, I check how many of the districts exclusively contains A1 or A2
        */

        int nDistricts = x.length;

        // Number of circles that exclusively contains X1 or X2
        int nContainsX1 = 0;
        int nContainsX2 = 0;

        // Loops for each circle and calculates the euclidean distance of the point to
        // the center of the circle and compare it to the radius.
        // Here, I use the formula of (x - x_0)^2 + (y - y_0)^2 with no square root
        // to avoid unnecessary computational calculation
        for(int i = 0; i < nDistricts; i++) {
            if((x1 - x[i])*(x1 - x[i]) +
                    (y1 - y[i])*(y1 - y[i]) < r[i]*r[i] && ((x2 - x[i])*(x2 - x[i]) +
                    (y2 - y[i])*(y2 - y[i]) > r[i]*r[i])) { // the circle exclusively contains point X1
                nContainsX1++;
            } else if((x1 - x[i])*(x1 - x[i]) +
                    (y1 - y[i])*(y1 - y[i]) > r[i]*r[i] && ((x2 - x[i])*(x2 - x[i]) +
                    (y2 - y[i])*(y2 - y[i]) < r[i]*r[i])) {
                nContainsX2++;
            }
        }

        return nContainsX1 + nContainsX2;

    }
}