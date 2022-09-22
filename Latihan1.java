import java.util.Scanner;

public class Latihan1 {
    /* Buatlah sebuah program dengan menggunakan method return value atau method void
    menghitung luas segitiga dimana nilai alas dan tinggi diinput memlalui keyboard.
     */

   static float luasSegitiga(int alas, int tinggi) {
        return 0.5f *alas*tinggi;
   }
        // method ^^


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        System.out.print("Masukkan Nilai Alas : ");
         alas = sc.nextInt();
        System.out.print("Masukkan Nilai Tinggi : ");
        tinggi = sc.nextInt();
        System.out.println(" Luas Segitiga :  " + luasSegitiga(alas,tinggi));

    }
}
