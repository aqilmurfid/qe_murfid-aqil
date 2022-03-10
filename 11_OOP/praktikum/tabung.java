import java.util.Scanner;
public class tabung {
    public static void main(String[] args) {
        double r, t;
        final double PHI = 3.14;
        double luasTabung, volTabung;

        Scanner scanInput = new Scanner(System.in);

        System.out.println("PROGRAM MENGHITUNG LUAS & VOLUME TABUNG");
        System.out.print("Jari-jari alas: ");
        r = scanInput.nextDouble();
        System.out.print("Tinggi tabung: ");
        t = scanInput.nextDouble();

        luasTabung = 2 * (PHI * r * r) + (2 * PHI * r * t);
        volTabung = (PHI * r * r) * t;

        System.out.println("Luas Tabung = " + luasTabung);
        System.out.println("Volume Tabung = " + volTabung);
    }
}
