package paketit;

public class HuoneenMitat {
    private int leveys;
    private int pituus;
    public int pinta_ala;

    public HuoneenMitat(int leveys, int pituus) {
        this.leveys = leveys;
        this.pituus = pituus;
        pinta_ala = this.pituus * this.leveys;
    }

    public int get_leveys() {
        return leveys;
    }

    public int get_pituus() {
        return pituus;
    }

    public int get_pinta_ala() {
        return pinta_ala;
    }
}
