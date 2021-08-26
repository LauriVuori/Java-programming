// Tehtävä 2
// Kirjoita ohjelma (main-metodin sisältävä luokka riittää), joka säilyttää tuotenumeroita (int, Integer) ja
// hintoja (double, Double) HashMap-kokoelmassa. Tuotenumero on avain, ja hinta on siihen liittyvä tieto.
// Lisää ohjelmakoodissa valmiiksi joitakin tuotenumeroita ja hintoja kokoelmaan (esim. tuotteen 100 hinta
// on 12.50).
// Ohjelma kysyy käyttäjältä tuotenumeron ja ohjelma tulostaa kyseisen tuotteen hinnan. Tätä toistetaan
// niin kauan kuin käyttäjä haluaa.
import java.util.Scanner; 
import java.util.HashMap;

public class hashmaptest {
    public static void main(String[] args) {
        Scanner scanner_obj = new Scanner(System.in);
        String user_input = "exmpl";

        while (user_input.equals("") != true) {
            System.out.println("Give dates: (emptyline to exit)");
            user_input = scanner_obj.nextLine();

            if (user_input.equals("") != true) {

            }
        }

        scanner_obj.close();
    }
}
