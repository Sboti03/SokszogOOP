import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sokszogek {

    private List<Sokszog> sokszogek;

    public Sokszogek() {
        Random rnd = new Random();
        sokszogek = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int fajta = rnd.nextInt(4);
            switch (fajta + 1) {
                case 1:
                    sokszogek.add(new Haromszog());
                    break;
                case 2:
                    sokszogek.add(new Teglalap());
                    break;
                case 3:
                    sokszogek.add(new Deltoid());
                    break;
                case 4:
                    sokszogek.add(new Paralelogramma());
                    break;
                default:
                    System.out.println("Hiba");
            }
        }
    }

    public double osszKerulet() {
        int count = 0;
        for (Sokszog s: sokszogek) {
            count += s.getKerulet();
        }
        return count;
    }

    public double osszTerulet() {
        int count = 0;
        for (Sokszog s: sokszogek) {
            count += s.getTerulet();
        }
        return count;
    }

    public int maxTerulet() {
        int legnagyobb = 0;
        for (int i = 1; i < sokszogek.size(); i++) {
            if (sokszogek.get(i).getTerulet() > sokszogek.get(legnagyobb).getTerulet()) {
                legnagyobb = i;
            }
        }
        return legnagyobb;
    }

    @Override
    public String toString() {
        String adat = "";
        for (Sokszog s:sokszogek) {
            adat += s.toString() + "\n";
        }
        return adat;
    }
}
