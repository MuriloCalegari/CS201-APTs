public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {

        String result = "";

        for(int u: rights) {
            result += u >= minPermission ? "A" : "D";
        }

        return result;
    }
}