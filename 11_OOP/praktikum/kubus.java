import java.util.Scanner;
public class kubus {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int sisi, hasil;
        System.out.println("Program Menghitung Volume Kubus");
        System.out.println("=============================");

        // logic
        System.out.print("Masukan Sisi Kubus: ");
        sisi = input.nextInt();
        // hitung volume balok;
        hasil = sisi * sisi * sisi;

        System.out.println("Volume Kubus tersebut adalah: " + hasil);
    }
}
