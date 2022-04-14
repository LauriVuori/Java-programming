
import java.io.*;

public class eka {
    public static void main(String args[]) {
        String merkkijono = "Anna merkkijono, jonka tulostan: ";
        KysyJaTulosta olio = new KysyJaTulosta();
        olio.teeHommasi(merkkijono);
    }
}

class KysyJaTulosta {
    public void teeHommasi(String merkkijono) {
        BufferedReader aa = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println(merkkijono);
            merkkijono = aa.readLine();
            System.out.println(merkkijono);
        } catch (Exception e) {
            System.out.println("Ei toimi.");

        }

    }
}

// public class eka {
// public static void main(String args[]) {
// String merkkijono;
// BufferedReader olio = new BufferedReader(new InputStreamReader(System.in));
// TulostusLuokka tulostaja = new TulostusLuokka();

// try {
// System.out.println("Anna merkkijono, jonka tulostan: ");
// merkkijono = olio.readLine();
// tulostaja.Tulosta(merkkijono);

// } catch (Exception e) {
// System.out.println("Ei toimi.");

// }
// }
// }

// class TulostusLuokka {
// public void Tulosta(String test) {
// System.out.println(test);
// }
// }
