public class Deltoid extends Sokszog {

    private double b;
    private double e;
    private double f;

    public Deltoid() {
        super(getVeletlenOldal(10, 5));
        this.b = getVeletlenOldal(10, 5);
        this.e = getVeletlenOldal(21, 5);
        this.f = getVeletlenOldal(21, 5);
        while (!isSzerkesztheto()) {
            super.setA(getVeletlenOldal(10, 5));
            this.b = getVeletlenOldal(10, 5);

            this.e = getVeletlenOldal(21, 5);
            this.f = getVeletlenOldal(21, 5);
        }
    }

    private boolean isSzerkesztheto() {
        boolean szerkesztheto = true;
        try {
            new Haromszog(getA(), getB(), getF());
            new Haromszog(getB(), getB(), getE());
        } catch (Exception e) {
            szerkesztheto = false;
        }
        return szerkesztheto;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public double getB() {
        return b;
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott deltoid nem szerkeszthető!");
        }
    }

    public void setB(double b) {
        this.b = b;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott deltoid nem szerkeszthető!");
        }
    }

    public void setE(double e) {
        this.e = e;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott deltoid nem szerkeszthető!");
        }
    }

    public void setF(double f) {
        this.f = f;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott deltoid nem szerkeszthető!");
        }
    }

    @Override
    public double getTerulet() {
        return (getE() * getF()) / 2;
    }

    @Override
    public double getKerulet() {
        return 2 * (getA() + getB());
    }

    @Override
    public String toString() {
        return String.format("Deltoid: a =%-10.3f b =%-10.3f e =%-10.3f f =%-10.3f %s ",
                getA(), getB(),getE(), getF(), super.toString());
    }
}
