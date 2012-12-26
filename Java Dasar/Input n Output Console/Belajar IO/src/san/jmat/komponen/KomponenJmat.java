/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package san.jmat.komponen;

import san.jmat.data.JMatVersion1J;

/**
 *
 * @author joker
 */
public class KomponenJmat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputString = JMatVersion1J.getInputString("Masukan Nama Anda = ");
        System.out.println("Nama Yang Anda Inputkan = " + inputString);
        System.out.println();
        Integer inputInterger = JMatVersion1J.getInputInterger("Masukkan Angka = ");
        int jumlah = 10;
        jumlah += inputInterger;
        System.out.println("Penjumlahan Angka 10 + " + inputInterger + " = " + jumlah);
    }
}
