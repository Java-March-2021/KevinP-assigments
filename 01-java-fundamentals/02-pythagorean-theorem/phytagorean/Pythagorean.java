

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double a=(double) legA;
        double b=(double) legB;
        double Hypotenuse= StrictMath.hypot((a),(b));
        return Hypotenuse;


    }
}
