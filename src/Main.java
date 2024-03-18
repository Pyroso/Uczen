import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Krystian krystian = new Krystian();
        Roch roch = new Roch();

        ArrayList<Uczen> uczniowie = new ArrayList<>();

        uczniowie.add(krystian);
        uczniowie.add(roch);

        Collections.sort(uczniowie);


        for (Uczen u: uczniowie){
            System.out.println(u.getClass().getName());
            u.uczSie();
        }

    }
}