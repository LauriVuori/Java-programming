import lv_packages.dates_class;
import java.util.ArrayList;
import java.util.Scanner; 
// Tehtävä 1
// Kirjoita ohjelma, joka säilyttää Harjoituksen 2 päivämääräluokkasi olioita java.util.ArrayList-kokoelmassa.
// Ohjelma kysyy ArrayList-kokoelmaan laitettavat päivämäärät käyttäjältä siten, että käyttäjä voi syöttää
// yhden päivämäärän per rivi niin monta kuin haluaa ja tyhjä rivi lopettaa syötön. Ohjelma myös tulostaa
// syötetyt päivämäärät.
// Ohjelma kysyy käyttäjältä vuosiluvun ja tulostaa ArrayList-kokoelmasta kaikki kyseisen vuoden
// päivämäärät.
// Ohjelma kysyy etsittävän päivämäärän ja ilmoittaa, missä indeksikohdassa päivämäärä on kokoelmassa
// tai ettei päivämäärää löytynyt. Käytä hyväksi kirjoittamaasi onSama-metodia.
// (Huomautus: Jos päivämäärälle on kirjoitettu toteutus equals-metodille muodossa public boolean
// equals(Object another)..., voitaisiin olion etsimiseen ArrayList-kokoelmasta käyttää indexOf-metodia.) 
public class ArrayListexe {
    public static void main(String[] args) {
        ArrayList<dates_class> dates_array = new ArrayList<dates_class>(); 
        Scanner scanner_obj = new Scanner(System.in);
        String dates_input = "example";
        int counter = 0, found = 0;

        while (dates_input.equals("") != true) {
            System.out.println("Give dates: (emptyline to exit)");
            dates_input = scanner_obj.nextLine();

            if (dates_input.equals("") != true) {
                dates_class dates_obj = new dates_class(dates_input);
                dates_array.add(dates_obj);
                System.out.println("date added:" + dates_array.get(counter));
                counter++;
            }
        }
        dates_input = "example";

        while (dates_input.equals("") != true) {
            System.out.println("Give date to find from arraylist: (emptyline to exit)");
            dates_input = scanner_obj.nextLine();

            if (dates_input.equals("") != true) {
                dates_class dates_obj = new dates_class(dates_input);
                for (int ii = 0; ii < dates_array.size(); ii++) {
                    if (dates_obj.is_same(dates_array.get(ii))) {
                        System.out.println("Date found");
                        found = 1;
                    }
                }
            }

            if (found == 0) {
                System.out.println("Date not found");
                found = 0;
            }
            scanner_obj.close();
        }

        // System.out.println(dates_array);
        // dates_class dates1 = new dates_class();
        // dates_class dates2 = new dates_class("1.1.1111");
        // System.out.println(dates1.get_full_date());
        // dates_array.add(dates1);
        // dates2 = dates_array.get(0);
        // System.out.println(dates_array);
        // System.out.println(dates2);
    }

}


// cars.set(0, "Opel");
// cars.remove(0);
// cars.clear();
// cars.size();