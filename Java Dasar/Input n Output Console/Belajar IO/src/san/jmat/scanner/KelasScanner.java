/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package san.jmat.scanner;
import java.util.Scanner;
/**
 *
 * @author joker
 */
public class KelasScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Buat Objeck Scanner
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Input Nama = ");
        String nextLine = scanner.nextLine();
        System.out.println("Nama Yang Anda Inputkan = "+nextLine);
        
        /*System.out.print("Input Angka = ");
         * int nextInt;
         * nextInt = scanner.nextInt();
         * int jumlah=nextInt+10;
         * System.out.println("Penjumlahan "+nextInt+" + 10 = "+jumlah);
         * 
         * System.out.print("Input Angka = ");
         * double nextDouble;
         * nextDouble = scanner.nextDouble();
         * double jum=nextDouble+5.5;
         * System.out.println("Penjumlahan "+nextDouble+" + 5.5 = "+jum);*/
    }
}
