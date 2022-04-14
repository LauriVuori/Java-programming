import java.io.*;

public class Lasku {
    public static void main(String args[]) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int luku1, luku2, sum;
        try {
            System.out.print("Anna ensimmäinen luku:");
            luku1 = Integer.parseInt(in.readLine());
            System.out.print("Anna toinen luku:");
            luku2 = Integer.parseInt(in.readLine());
            sum = luku1 + luku2;
            System.out.println("Antamiesi lukujen summa on " + sum);
        } catch (Exception e) {
            System.out.println("Antamasi syöte oli virheellinen...");
        }

    }
}
