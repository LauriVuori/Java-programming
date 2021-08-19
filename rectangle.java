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
        double low[] = {0,0};
        double high[] = {10,10};
        test = new rectangle(low, high);
        test.get_data();
        test = new rectangle();
        test.get_data();
    }

}
public class rectangle {
    private static final int SIDE = 1;  
    private static final int BASE = 0;  
    double lower_left_corner[];
    double high_right_corner[];
    double base_lenght;
    double side_height;
    double area;
    public rectangle() {
        lower_left_corner = new double[2];
        high_right_corner = new double[2];
        lower_left_corner[BASE] = 0;
        lower_left_corner[SIDE] = 0;
        high_right_corner[BASE] = 1;
        high_right_corner[SIDE] = 1;
        base_lenght();
        side_lenght();
        set_area();
    }
    public rectangle(double lower_corner[], double higher_corner[]) {
        lower_left_corner = new double[2];
        high_right_corner = new double[2];
        lower_left_corner[BASE] = lower_corner[BASE];
        lower_left_corner[SIDE] = lower_corner[SIDE];
        high_right_corner[BASE] = higher_corner[BASE];
        high_right_corner[SIDE] = higher_corner[SIDE];;
        base_lenght();
        side_lenght();
        set_area();
    }
    public void get_data() {
        System.out.println("lower left xy: " + lower_left_corner[0] + " " + lower_left_corner[1]);
        System.out.println("higher right xy: " + high_right_corner[0] + " " + high_right_corner[1]);
        System.out.println("Base lenght: " + base_lenght);
        System.out.println("Side height: " + side_height);
        System.out.println("Area is: " + area);

    }
    public void base_lenght() {
        base_lenght = high_right_corner[BASE] - lower_left_corner[BASE];
    }
    public void side_lenght() {
        side_height = high_right_corner[SIDE] - lower_left_corner[SIDE];
    }
    public void set_area() {
        area = base_lenght * side_height;
    }
}
