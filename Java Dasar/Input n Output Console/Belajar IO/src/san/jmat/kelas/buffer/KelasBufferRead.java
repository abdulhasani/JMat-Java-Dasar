/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package san.jmat.kelas.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joker
 */
public class KelasBufferRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan Nama = ");
        String readLine = reader.readLine();
        System.out.println("Nama Yang DiInputkan = "+readLine);
        
        /*System.out.print("Masukan Angka = ");
         * String baca = reader.readLine();
         * int konversiBaca=Integer.parseInt(baca);
         * int jumlah=konversiBaca+10;
         * System.out.println("Penjumlahan "+konversiBaca+" + 10 = "+jumlah);*/
    }
}
