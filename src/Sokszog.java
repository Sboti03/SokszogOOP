public abstract class Sokszog {
    private double a;

    public Sokszog(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
    public static int getVeletlenOldal(int max, int min) {
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }
    public void setA(double a) {
        this.a = a;
    }


    public abstract double getTerulet();

    public abstract double getKerulet();

    @Override
    public String toString() {
        return String.format("K =%-10.3f T =%-10.3f", getKerulet(), getTerulet());
    }
}
