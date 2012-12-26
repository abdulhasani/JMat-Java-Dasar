/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package array.single.dimension;

/**
 *
 * @author joker
 */
public class ArraySingleDimension {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cara pendeklarasian dan inisialisasi model array pertama
        //Batas maksimal data yang bisa disimpan pada array 5
        //index dimulai dari 0
        String [] ar;
        ar = new String[5];
        ar[0]="Abdul";
        ar[1]="Kadir";
        ar[2]="Hasani";
        ar[3]="Bridge";
        ar[4]="Joker";
        
        //cara mengambil isi index
        System.out.print(ar[0]+" ");
        System.out.print(ar[1]+" ");
        System.out.println(ar[2]);
        //deteksi ukuran array array
        Integer panjangArray;
        panjangArray = ar.length;
        System.out.println("ukuaran array = "+panjangArray);
        
        //cara deklarasi dan inisialisasi array model ke 2
        Integer [] angka={
        0,1,2,3,4,5
        };
        
        //akses isi indek, yang di akses itu indexnya bukan isi
        //indexnya
        System.out.println(angka[0]);
        System.out.println(angka[1]);
        System.out.println(angka[2]);
        System.out.println(angka[3]);
        System.out.println(angka[4]);
        System.out.println(angka[5]);
    }
}
