// Tehtävä 2
// a) Kirjoita luokka, joka kuvaa päivämäärän piirteet (tietoina kokonaisluvut päivä, kuukausi ja vuosi).
// Määrittele tiedot yksityisiksi ja kirjoita niille setterit ja getterit (Vinkki: saat setterit ja getterit Eclipsen
// avulla valitsemalla Source-valikosta Generate Getters and Setters…). Kirjoita luokkaan myös metodi
// public String toString()
// joka palauttaa päivämäärän tiedot merkkijonona muodossa 8.2.2018.
// b) Kirjoita parametriton konstruktori, joka alustaa päivämäärän järjestelmän päivämäärällä. Järjestelmän
// päivämäärä saadaan java.time.LocalDate-luokan avulla:
// java.time.LocalDate tanaan = java.time.LocalDate.now();
// paiva = tanaan.getDayOfMonth();
// kuukausi = tanaan.getMonthValue();
// vuosi = tanaan.getYear();
// c) Kirjoita konstruktori, jolle välitetään päivä, kuukausi ja vuosi kokonaislukuparametreina.
// d) Kirjoita konstruktori, jolle välitetään päivämäärä merkkijonona ”pp.kk.vvvv”, mistä konstruktori
// selvittää päivän, kuukauden ja vuoden. (Vinkki: katkaise tiedot merkkijonosta esim. split- tai substringmetodilla ja saatu merkkijono muutetaan int-tyyppiseksi Integer.parseInt(merkkijono)).
// e) Kirjoita metodi public boolean onSama(Paivamaara toinen), joka palauttaa totuusarvon, onko
// tämän olion päivämäärä sama kuin parametrina välitetty toinen päivämäärä. (Käytä parametrille
// tyyppinä omaa kirjoittamaasi luokkatyyppiä Paivamaaran sijaan.)
// Kirjoita main-metodi, jolla kokeilet konstruktoreiden ja vertailun toimintaa. Kysy ainakin jokin päivämäärä
// käyttäjältä (esim. muodossa pp.kk.vvvv).
// Jatka vielä päivämäärän käsittelyyn tarkoitettua luokkaa. Määrittele luokan olioille yhteinen Stringtaulukko, johon alustat kuukausien nimet:
// public static final String[] KUUKAUDET = {"tammikuu", "helmikuu",
// "maaliskuu", "huhtikuu", "toukokuu", "kesäkuu", "heinäkuu", "elokuu",
// "syyskuu", "lokakuu", "marraskuu", "joulukuu"};
// f) Kirjoita luokkaan instanssimetodi, joka palauttaa päivämäärän merkkijonona pitkässä muodossa, esim.
// 9. toukokuuta, 2017
// g) Kirjoita luokkametodi, jolle välitetään parametrina kuukauden nimi merkkijonona, ja metodi palauttaa
// kuukauden numeron. Tee metodista sellainen, että ei ole väliä, onko kuukauden nimi kirjoitettu isoilla vai
// pienillä kirjaimilla.
// Kirjoita main-metodiin lauseet, joilla kokeilet näiden metodien toimintaa.
// (Huom. Java APIssa on valmiina useita luokkia päivämäärien käsittelyyn, kuten java.util.Date,
// java.util.Calendar ja java.time.LocalDate. Kirjoitetaan tämä oma luokka oppimistarkoituksessa ja sen
// kehittämistä ja käyttöä jatketaan myös seuraavissa harjoituksissa.)

public class main {
    public static void main(String[] args) {
        dates_class dates = new dates_class("20");
        String text = dates.toString();
        System.out.println(text);
        // rectangle test;
        // double low[] = {0,0};
        // double high[] = {10,10};
        // test = new rectangle(low, high);
        // test.get_data();
        // test = new rectangle();
        // test.get_data();
    }

}


// a) Kirjoita luokka, joka kuvaa päivämäärän piirteet (tietoina kokonaisluvut päivä, kuukausi ja vuosi).
// Määrittele tiedot yksityisiksi ja kirjoita niille setterit ja getterit (Vinkki: saat setterit ja getterit Eclipsen
// avulla valitsemalla Source-valikosta Generate Getters and Setters…). Kirjoita luokkaan myös metodi
// public String toString()
public class dates_class {
    private int date;
    private int month;
    private int year;

    public dates_class() {
        java.time.LocalDate today = java.time.LocalDate.now();
        date = today.getDayOfMonth();
        month = today.getMonthValue();
        year = today.getYear();
    }
    public dates_class(int new_day, int new_month, int new_year) {
        date = new_day;
        month = new_month;
        year = new_year;
    }
    public dates_class(String date_string) {
        try {
            String[] values = date_string.split("\\.");
            date = Integer.parseInt(values[0]);
            month = Integer.parseInt(values[1]);
            year = Integer.parseInt(values[2]);
        }
        catch (Exception error) {
            System.out.println("Datetime error, date set to 0.0.0");
            date = 0;
            month = 0;
            year = 0;
        }
    }

    // Kirjoita metodi public boolean onSama(Paivamaara toinen), joka palauttaa totuusarvon, onko
    // tämän olion päivämäärä sama kuin parametrina välitetty toinen päivämäärä. (Käytä parametrille
    // tyyppinä omaa kirjoittamaasi luokkatyyppiä Paivamaaran sijaan.)
    public dates_class is_same(dates_class test_date) {
        int i = 0;
        return test_date;
    }

    public void set_date(int new_date) {
        date = new_date;
    }
    public void set_month(int new_month) {
        month = new_month;
    }
    public void set_year(int new_year) {
        year = new_year;
    }
    public int get_day() {
        return date;
    }
    public int get_year() {
        return year;
    }
    public int get_month() {
        return month;
    }
    public String toString() {
        String text = (date + "." + month + "." + year);
        return text;
    }
}