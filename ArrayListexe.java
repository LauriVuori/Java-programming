import lv_packages.dates_class;
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
        dates_class dates1 = new dates_class();
        System.out.println(dates1.get_full_date());
    }

}
