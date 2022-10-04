public class Haromszog extends Sokszog {
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott három szög nem szerkeszthető");
        }
    }

    public Haromszog() {
        super(getVeletlenOldal());
        this.b = getVeletlenOldal();
        this.c = getVeletlenOldal();

        while (!isSzerkesztheto()) {
            super.setA(getVeletlenOldal());
            this.b = getVeletlenOldal();
            this.c = getVeletlenOldal();
        }

    }

    private static double getVeletlenOldal() {
        return Math.random() * 5 + 5;
    }

    private boolean isSzerkesztheto() {
        boolean szerkesztheto = true;
        if ((getA() + getB() <= getC()) || (getA() + getC() <= getB()) || (getB() + getC() <= getA())) {
            szerkesztheto = false;
        }
        return szerkesztheto;
    }


    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott három szög nem szerkeszthető");
        }
    }

    public void setC(double c) {
        this.c = c;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott három szög nem szerkeszthető");
        }
    }

    @Override
    public double getKerulet() {
        return getA() + getB() + getC();
    }

    @Override
    public double getTerulet() {
        double s = getKerulet() / 2;
        return Math.sqrt(s * (s - getA()) * (s - getB()) * (s - getC()));
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott három szög nem szerkeszthető");
        }
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %-10.3f b = %-10.3f C = %-10.3f %s",
                getA(), getB(), getC(), super.toString());
    }
}
