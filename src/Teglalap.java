import java.util.Random;

public class Teglalap  extends  Sokszog{


    private double b;


    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public Teglalap() {
        super(0);
        Random rnd = new Random();
        double rndA = rnd.nextDouble() * 100;
        double rndb = rnd.nextDouble() * 100;
        this.b = rndb;
        setA(rndA);


    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getKerulet() {
        return getA() * 2 + getB() * 2;
    }

    @Override
    public double getTerulet() {
        return getA() * getB();
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %-10.3f b = %f-10.3 %s",
                getA(), getB(), super.toString());
    }
}
