
// 3. Tarkastellaan alla olevaa luokan määrittelyä. (1 piste)
// public class Kertoja {
// public int luku1, luku2;
// public String s1;
// public int kerro(int luku1, int luku2) {
// int tulo = luku1 * luku2;
// return tulo;
// }
// }
// a. Tee luokalle parametriton alustaja, joka sijoittaa kenttien luku1 ja luku2
// arvoksi 0.
// b. Kirjoita luokalle alustaja, joka saa parametrina kaksi merkkijonoa.
// Alustaja yhdistää
// ne yhdeksi merkkijonoksi ja sijoittaa kentän s1 arvoksi.
// c. Kirjoita pääohjelma, joka
// i. Luo olion luokasta sen alustajan avulla, jonka parametreina on kaksi
// merkkijonoa
// ii. Laskee luokan Kertoja avulla lukujen 23 ja 99 tulon sekä tulostaa
// tuloksen
// näkyville.
// iii. tulostaa kentän s1 arvon

public class kertoja {
    public static void main(String[] args) {
        kertoja kertoja_luokka = new kertoja();

    }

    public int luku1, luku2;
    public String s1;
    // Tee luokalle parametriton alustaja, joka sijoittaa kenttien luku1 ja luku2
    // arvoksi 0.

    public kertoja() {
        // parametriton alustaja
        luku1 = 0;
        luku1 = 0;
        s1 = "tyhja";
    }

    // b. Kirjoita luokalle alustaja, joka saa parametrina kaksi merkkijonoa.
    // Alustaja yhdistää
    // ne yhdeksi merkkijonoksi ja sijoittaa kentän s1 arvoksi

    public int kerro(int luku1, int luku2) {
        int tulo = luku1 * luku2;
        return tulo;

    }
}
