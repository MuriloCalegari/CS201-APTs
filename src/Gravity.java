public class Gravity {
    public double falling(double time, double velo){

        float g = (int) 9.8;

        return velo*time + 0.5*g*time*time;
    }
}
