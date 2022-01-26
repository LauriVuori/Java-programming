// Parkettiyhtiö Savon Lattia tarvitsee ohjelman, jolla se voi laskea parketointitarjoustensa
// kustannuksia. Aluksi riittää, että ohjelma on yksinkertainen ja laskee vain suorakulmion
// muotoisia alueita lattiasta. Parketin hinta saadaan kertomalla pinta-ala neliömetreinä
// parketin neliöhinnalla.
// Tee ensin luokka HuoneenMitat, jossa on kaksi kenttää: huoneen leveys ja pituus.
// Kertomalla nämä keskenään saadaan huoneen lattianpinta-ala, jota tässä käytetään
// parketoinnin pinta-alana.
// Tee luokka HuoneenParketti, jonka kenttänä on HuoneenMitat olio ja toisena kenttänä
// parketin neliöhinta. Luokassa on metodi, joka palauttaa parketin hinnan olion ilmentymän
// tietoihin perustuen (pinta-ala ja neliöhinta).
// Tee pääohjelma, joka kysyy huoneen mitat ja parketin neliöhinnan, ja sitten kertoo
// HuoneenParketti olion avulla parketoinnin hinnan. (3 pistettä)

import paketit.*;
import java.util.Scanner;

public class parketti_laskuri {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int leveys = 0;
        int pituus = 0;
        double parkettihinta = 0;

        System.out.println("Anna leveys");
        leveys = myObj.nextInt();
        System.out.println("Anna pituus");
        pituus = myObj.nextInt();
        System.out.println("Anna parkettihinta");
        parkettihinta = myObj.nextDouble();
        HuoneenParketti uusi_huone = new HuoneenParketti(leveys, pituus, parkettihinta);
        uusi_huone.get_hinta();
    }
}
