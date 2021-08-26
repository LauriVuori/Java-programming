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
        HashMap<Integer, Double> product_map = new HashMap<Integer, Double>();
        Integer user_input_product_id = 1;
        Double user_input_product_price = 5.0;
        // people.put("John", 32)

        while (user_input_product_id != 0) {
            System.out.println("Give product id: (0 to quit)");
            user_input_product_id = scanner_obj.nextInt();
            if (user_input_product_id != 0) {
                System.out.println("Give produt price: ");
                user_input_product_price = scanner_obj.nextDouble();
                product_map.put(user_input_product_id, user_input_product_price);
            }
        }
        user_input_product_id = 1;
        while (user_input_product_id != 0) {
            System.out.println("Give product id to find: (0 to quit)");
            user_input_product_id = scanner_obj.nextInt();
            if (product_map.get(user_input_product_id) != null) {
                System.out.println("Found: " + product_map.get(user_input_product_id));
            }
            else {
                System.out.println("Not found");
            }

        }
        System.out.println(product_map);
        scanner_obj.close();
    }
}

// HashMap<String, String> capitalCities = new HashMap<String, String>();
// capitalCities.put("England", "London");
// capitalCities.get("England");
// capitalCities.remove("England");
// apitalCities.clear();
// capitalCities.size();
// Print keys

// loop key
// for (String i : capitalCities.keySet()) {
//     System.out.println(i);
//   }


// HashMap<String, Integer> people = new HashMap<String, Integer>();
// // Add keys and values (Name, Age)
// people.put("John", 32)