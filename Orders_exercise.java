/*
Kirjoita luokka, joka kuvaa tilaukseen kuuluva tilausrivin piirteet. Sillä on tietoina tilattavan
tuotteen nimi (esim. "reppu"), hinta (esim. 17.50) ja tilausmäärä (esim. 10). Määrittele tiedot
private-määreellä ja kirjoita setterit ja getterit). Kirjoita myös metodi, joka laskee hinnan
yhteensä (määrä*hinta). Kirjoita lyhyt main-metodi, missä luot tällaisen olion, sijoitat sen 
Pirjo Prosi/VAMK 4
tiedoille jotkut arvot settereitä käyttäen ja tulostat tiedot gettereitä käyttäen sekä tulostat
hinnan yhteensä.
b) Tee uuteen luokkaan uusi main-metodi, joka kysyy, kuinka monta tilausriviä tilaukseen
kuuluu, kyselee tilausrivien tiedot taulukkoon ja lopuksi ohjelma tulostaa kaikki tilausrivit ja
koko tilauksen hinnan yhteensä. (Tarvittaessa voit katsoa esimerkkiä luentojen luvun 3
esimerkin 3.2 loppuosan luokasta KurssinOpiskelijat2).*/


import java.util.Scanner;  // Import the Scanner class


public class exercise_1 {
    public static void main(String[] args) {
        Scanner myObj;
        order order_list[];
        int arr[];
        int order_list_len = 0;

        myObj = new Scanner(System.in);

        System.out.println("Give order count: ");
        order_list_len = myObj.nextInt();
        
        System.out.println("order_count: " + order_list_len);
        order_list = new order[order_list_len];

        for (int i = 0; i < order_list_len; i++) {
            order_list[i] = new order();
            order_list[i].set_all_values();
            order_list[i].get_full_price_and_order();
        }
        // String userName = myObj.nextLine();  // Read user input

    }

    // public static void main(String[] args) {
    //     order test = new order();
    //     test.set_name_of_order("Backbag");
    //     test.set_price(15.15);
    //     test.set_order_count(3);
    //     test.get_full_price_and_order();
    // }
}

public class order {
    private String name_of_order;
    private double price;
    private int order_count;
    private Scanner myObj;

    public order() {
        myObj = new Scanner(System.in);
    }

    public void set_all_values() {
        System.out.println("Give name: ");
        name_of_order = myObj.nextLine();
        set_name_of_order(name_of_order);
        System.out.println("Give price: ");
        price = myObj.nextDouble();
        set_price(price);
        System.out.println("Give count: ");
        order_count = myObj.nextInt();
        set_order_count(order_count);
    }

    public void set_name_of_order(String name) {
        name_of_order = name;
    }
    public void set_price(double new_price) {
        price = new_price;
    }
    public void set_order_count(int new_orders) {
        order_count = new_orders;
    }

    public void get_name_of_order() {
        System.out.println("Name of order is: " + name_of_order);
    }
    public void get_price_of_order() {
        System.out.println("Single price is: " + price);
    }
    public void get_order_count() {
        System.out.println("Order count is: " + order_count);
    }

    public void get_full_price_and_order() {
        System.out.println("Order and full price is: " + name_of_order + " " + price*order_count + "$");
    }
}
