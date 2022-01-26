package course;

public class salasana {
    // Tee ohjelma, joka tutkii täyttääkö sille annettu salasana kaikki vaatimukset.
    // Salasanan tulee olla vähintään 15 merkkiä pitkä, sen tulee sisältää isoja ja
    // pieniä kirjaimia ja sen lisäksinumeroita ja erikoismerkkejä.
    // Ohjelmassa on metodi tutkiSalasana, joka saa parametrina
    // tutkittavan salasanan ja palauttaa totuusarvon true/false sen mukaan
    // täyttääkö salasana
    // kaikki ehdot. Tee myös pääohjelma, jolla testaat metodin toiminnan.
    // Pääohjelmassa
    // kysytään käyttäjältä salasana, tutkitaan sen kelvollisuus metodilla ja
    // ilmoitetaan ohjelman
    // käyttäjälle selväkielisesti, oliko salasana kelvolline

    public static void main(String[] args) {
        String test = "terve";
        try {
            char merkki = test.charAt(5);
        } catch (Exception e) {
            System.out.println("Salasana liian lyhyt");
        }
        boolean aa = true;

    }
}