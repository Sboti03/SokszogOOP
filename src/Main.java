public class Main {
    public static void main(String[] args) {
        double legnagyobbE = 10;
        double legnagyobbF = 10;
        for (int i = 0; i < 100000; i++) {
            Deltoid pm = new Deltoid();
            if (legnagyobbF < pm.getF()) {
                legnagyobbF = pm.getF();
            }
            if (legnagyobbE < pm.getE()) {
                legnagyobbE = pm.getE();
            }
            System.out.println(pm.toString());
        }
        System.out.println(legnagyobbF);
        System.out.println(legnagyobbE);
    }
}