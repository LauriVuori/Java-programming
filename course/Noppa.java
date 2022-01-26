
// Tee ohjelma, joka pelaa konetta vastaan venttiä (black-jack variaatio) kahdella nopalla. Kone
// ja pelaaja pyrkivät saamaan summaksi 21 tai mahdollisimman lähelle sitä, mutta ei yli. (3
// pistettä)
// a. Ohjelmassa toistetaan kierroksia, joissa pelaaja haluaa jatkaa ja ei ole ylittänyt 21:tä.
// b. Jokaisen kierroksen alussa pelaajalta kysytään haluaako hän vielä heittää noppia ja
// kerätä lisää pisteitä.
// c. Kierroksella ohjelma simuloi kahden 6-sivuisen nopan heittoa. Ensin tietokone
// heittää nopat, sitten pelaaja – jos vielä haluaa. Ensimmäisellä kierroksella molemmat
// heittävät noppia. Seuraavilla kone heittää noppia, jos sillä on vähemmän pisteitä
// kuin pelaajalla (ja pelaaja on vielä mukana pelissä). Pelaaja saa päättää heittääkö
// noppia vai ei. Simuloi noppien heittoa valmiin luokan Noppa avulla, jonka koodi on
// Moodlessa.
// d. Ohjelma näyttää joka kierroksen lopuksi koneen ja pelaajan pisteet (ei siis ennen
// kuin pelaaja on heittänyt).
// e. Kun kumpikaan ei enää halua heittää ohjelma ilmoittaa pelin voittajan. 
import java.util.Random;
import java.util.Scanner;

public class Noppa {
    public int sivut;
    private int arvo;
    public int summa;
    private String pelaaja;

    public Noppa(int sivut, String pelaajan_nimi) {
        this.sivut = sivut;
        heita();
        set_pelaaja(pelaajan_nimi);
    }

    public void heita() {
        Random rand = new Random();
        arvo = rand.nextInt(sivut) + 1;
    }

    public int getSivut() {
        return sivut;
    }

    public int getArvo() {
        return arvo;
    }

    public void set_pelaaja(String pelaajan_nimi) {
        pelaaja = pelaajan_nimi;
    }

    public void heita_nopat() {
        System.out.println("Pelaajan: " + this.pelaaja);
        int heitto;
        heita();
        heitto = getArvo();
        System.out.println("Heitto 1: " + heitto);
        summa += heitto;
        heita();
        heitto = getArvo();
        System.out.println("Heitto 2: " + heitto);
        summa += heitto;
        System.out.println("Summa on:" + summa);
    }

    public static void main(String[] args) {
        Noppa pelaaja = new Noppa(6, "Pelaaja");
        Noppa tietokone = new Noppa(6, "Tietokone");
        Scanner myObj = new Scanner(System.in);
        String komento = "a";
        int kierros = 1, voittaja = 0;

        while (komento.equals("ei") == false) {
            System.out.println("Kierros: " + kierros);
            pelaaja.heita_nopat();
            if ((tietokone.summa < pelaaja.summa) && (pelaaja.summa <= 21)) {
                tietokone.heita_nopat();
            }
            System.out.println("Tilanne on: " + pelaaja.summa + " " + tietokone.summa);
            if (voittaja_testaus(pelaaja.summa, tietokone.summa) == 1) {
                komento = "ei";
                voittaja = 1;
            } else {
                System.out.println("Haluatko heittaa uudestaan? (Kyllä/Ei) ");
                komento = myObj.nextLine();
                if (komento.equals("ei") == true) {
                    while (tietokone.summa <= pelaaja.summa) {
                        tietokone.heita_nopat();
                        if (voittaja_testaus(pelaaja.summa, tietokone.summa) == 1) {
                            komento = "ei";
                            voittaja = 1;
                        }
                    }
                }
            }
        }
        if (voittaja == 0) {
            if (tietokone.summa > pelaaja.summa) {
                System.out.println("Tietokone voitti");
            } else if (tietokone.summa < pelaaja.summa) {
                System.out.println("Pelaaja voitti");
            } else {
                System.out.println("Tasapeli");
            }
        }
    }

    static int voittaja_testaus(int pelaaja_summa, int kone_summa) {
        if ((pelaaja_summa > 21) && (kone_summa > 21)) {
            System.out.println("Molempien summat ylittivät 21");
            return 1;
        }
        if ((pelaaja_summa == 21) && (kone_summa != 21)) {
            System.out.println("Pelaaja voitti");
            return 1;
        }
        if ((kone_summa == 21) && (pelaaja_summa != 21)) {
            System.out.println("Tietokone voitti");
            return 1;
        }
        if (pelaaja_summa > 21) {
            System.out.println("Pelaajan summa ylitti 21");
            System.out.println("Tietokone voitti");
            return 1;
        }
        if (kone_summa > 21) {
            System.out.println("Tietokoneen summa ylitti 21");
            System.out.println("Pelaaja voitti");
            return 1;
        }
        return 0;
    }

}
