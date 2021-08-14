/*
Tehtävä 1
Kirjoita luokka Suorakulmio, joka kuvaa 2D-koordinaatistossa olevan suorakulmion piirteet (suorakulmion
sivut ovat koordinaattiakseleiden suuntaiset). 
-Suorakulmion tietoina ovat vasemman alanurkan ja oikean
ylänurkan koordinaatit (neljä double-tyyppistä arvoa). -
Kirjoita seuraavat konstruktorit:
 parametriton konstruktori, joka alustaa alanurkaksi (0, 0) ja ylänurkaksi (1, 1)
 parametrillinen konstruktori, jolle välitetään vain ylänurkan koordinaatit ja alanurkaksi alustetaan
origo (0, 0)
 parametrillinen konstruktori, jolle välitetään parametrina sekä alanurkan että ylänurkan
koordinaatit.
Kirjoita metodi, joka laskee suorakulmion kannan pituuden, ja metodi, joka laskee suorakulmion
korkeuden. Kirjoita myös metodi, joka laskee suorakulmion pinta-alan (käytä hyväksi kannan ja korkeuden
laskevia metodeita). Settereitä ja gettereitä ei tässä tehtävässä välttämättä tarvita.
Kirjoita pääohjelmametodi main, jossa luot kullakin konstruktorilla suorakulmio-olion ja tulostat niiden
kannat, korkeudet ja pinta-alat. 
*/
public class main {
    public static void main(String[] args) {
        rectangle test;
        test = new rectangle();
        test.get_data();
    }

}
public class rectangle {
    double lower_left_corner[];
    double high_right_corner[];
    public rectangle() {
        lower_left_corner = new double[2];
        high_right_corner = new double[2];
        lower_left_corner[0] = 0;
        lower_left_corner[1] = 0;
        high_right_corner[0] = 1;
        high_right_corner[1] = 1;
        
    }
    public void get_data() {
        System.out.println("lower left xy: " + lower_left_corner[0] + " " + lower_left_corner[1]);
        System.out.println("higher right xy: " + high_right_corner[0] + " " + high_right_corner[1]);
    }
    public void base_lenght() {

    }
}
