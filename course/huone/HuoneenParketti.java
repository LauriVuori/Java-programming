package paketit;

import paketit.*;

public class HuoneenParketti {
    public HuoneenMitat huone;
    double nelio_hinta;

    public HuoneenParketti(int leveys_uusi, int pituus_uusi, double hinta) {
        huone = new HuoneenMitat(leveys_uusi, pituus_uusi);
        nelio_hinta = hinta;
    }

    public void get_hinta() {
        System.out.println("Huoneen hinta on: " + nelio_hinta * huone.pinta_ala);
    }

}
