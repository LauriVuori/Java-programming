// // 5. Tee metodi naytaMerkki. 
// Metodilla on kaksi parametria: String-tyyppinen muuttuja ja kokonaisluku. 
// Kokonaisluku kertoo sen paikan merkkijonosta, jossa olevan merkin metodi palauttaa.
// Metodi myös tulostaa merkistä seuraavat tiedot: onko se numero vai kirjain ja jos se on kirjain, niin onko se iso vai pieni kirjain.
// Ensimmäisen merkin paikka on 0. 
// Kirjoita myös pääohjelma ja testaa metodin toiminta. (1 piste)

public class nayta {

    public char naytaMerkki(String muuttuja, int kokonaisluku) {
        // Kokonaisluku kertoo sen paikan merkkijonosta, jossa olevan merkin metodi
        // palauttaa.
        // Metodi myös tulostaa merkistä seuraavat tiedot: onko se numero vai kirjain ja
        // jos se on kirjain, niin onko se iso vai pieni kirjain.
        char merkki = muuttuja.charAt(kokonaisluku);

        if ((merkki <= 'Z') && (merkki >= 'A')) {
            System.out.println("ISO");
        } else if ((merkki <= 'z') && (merkki >= 'a')) {
            System.out.println("PIENI");
        }
        return merkki;
    }

    public static void main(String[] args) {
        nayta nayta_luokka = new nayta();
        nayta_luokka.naytaMerkki("tervE", 4);
        nayta_luokka.naytaMerkki("tervE", 3);
        nayta_luokka.naytaMerkki("tervE", 2);

        // yksi.asetaJuttu(5);
        // System.out.println(yksi.get_juttu());
        // yksi.asetaJuttu(3);
        // System.out.println(kaksi.get_juttu());
        // System.out.println(kolme.get_juttu());
    }

}

public class Noppa {
    public int sivut;
    private int arvo;
}
