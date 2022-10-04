public class Paralelogramma extends Sokszog {

    private double b;
    private double alfa;

    public Paralelogramma() {
        super(getVeletlenOldal(10, 5));
        this.b = getVeletlenOldal(10, 5);
        this.alfa  = getVeletlenOldal(180, 90);
    }

    public double getB() {
        return b;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott értékekkel a paralelogramma nem szerkeszthető!");
        }
    }

    public void setB(double b) {
        this.b = b;
    }


    private boolean isSzerkesztheto() {
        boolean szerkesztheto = true;
        if (alfa < 90 || alfa > 180) {
            szerkesztheto = false;
        }
        return szerkesztheto;
    }

    @Override
    public double getTerulet() {
        return getA() * getB() * Math.sin(Math.toRadians(getAlfa()));
    }

    @Override
    public double getKerulet() {
        return 2* (getA() + this.b);
    }

    @Override
    public String toString() {
        return String.format("Paralelogramma: a =%-10.3f b =%-10.3f alfa =%-10.3f %s",
                getA(), getB(), getAlfa(), super.toString());
    }
}
