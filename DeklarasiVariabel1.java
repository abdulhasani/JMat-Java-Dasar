/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joker
 */
public class DeklarasiVariabel1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Varibel dan Insialisasi Cara 1

        //Proses Deklarasi varibel
        //Ini variable
        byte angka;
        short nilai;
        int uang;
        long hutang;
        char karakter;
        float bilanganBerkoma;
        double angkaBerkom;
        boolean statusSingle;
        boolean belumMenikah;
        //Proses Inisialisasi Varibel

        angka = 12;
        nilai = 300;
        uang = 1000000;
        hutang = 2_000_000l;
        karakter = 'S';
        bilanganBerkoma=45.34499f;
        angkaBerkom=45.999999;
        statusSingle = false;
        belumMenikah=true;
        
        //Cetak Isi Variabel 
        System.out.println(angka);
        System.out.println(nilai);
        System.out.println(uang);
        System.out.println(hutang);
        System.out.println(karakter);
        System.out.println(bilanganBerkoma);
        System.out.println(angkaBerkom);
        System.out.println(statusSingle);
        System.out.println(belumMenikah);
        
        System.out.println("Bilangan Float "+bilanganBerkoma);
        System.out.println("Bilangan Double "+angkaBerkom);
        
    }
}
