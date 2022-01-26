public class Juttu {
    private int x;
    private int y;
    private static int z = 0;

    public Juttu() {
        x = z;
        y = z;
    }

    static void asetaJuttu(int a) {
        z = a;
    }

    public int get_juttu() {
        return z;
    }

    public static void main(String[] args) {
        Juttu yksi = new Juttu();
        Juttu kaksi = new Juttu();
        Juttu kolme = new Juttu();
        yksi.asetaJuttu(5);
        System.out.println(yksi.get_juttu());
        yksi.asetaJuttu(3);
        System.out.println(kaksi.get_juttu());
        System.out.println(kolme.get_juttu());
    }
}