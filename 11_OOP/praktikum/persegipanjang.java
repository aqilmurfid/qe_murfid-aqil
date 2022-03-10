import java.util.Scanner;
public class persegipanjang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int panjang, lebar, luas, keliling;

        System.out.println("PROGRAM JAVA MENGHITUNG  PERSEGI PANJANG : ");
        System.out.println("-----------------------------------------------");

        System.out.print("Masukan Panjang      : ");
        panjang=input.nextInt();
        System.out.print("Masukan Lebar        : ");
        lebar=input.nextInt();

        luas=panjang*lebar;
        keliling=2*(panjang+lebar);

        System.out.println("Luas Persegi Panjang : "+luas);
        System.out.println("Keliling Persegi Panjang : "+keliling);
    }
}
