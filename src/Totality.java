public class Totality {
    public int sum(int[] a, String stype) {

        int sum = 0;

        switch(stype) {
            case "odd":
                for(int i = 1; i < a.length; i += 2) {
                    sum += a[i];
                }
                break;
            case "even":
                for(int i = 0; i < a.length; i += 2) {
                    sum += a[i];
                }
                break;
            case "all":
                for(int i: a) {
                    sum += i;
                }
                break;
        }

        return sum;
    }
}