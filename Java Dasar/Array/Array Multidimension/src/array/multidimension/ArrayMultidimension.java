/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package array.multidimension;

/**
 *
 * @author joker
 */
public class ArrayMultidimension {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dua baris dan dua kolom
        String[][] ar = new String[2][2];
        //Baris ke 0 kolom ke 0
        ar[0][0] = "Sani";
        //Baris ke 0 kolom ke 1
        ar[0][1] = "Ganteng";
        //Baris ke 1 kolom ke 0
        ar[1][0] = "Ganteng";
        //Baris ke 1 kolom ke 1
        ar[1][1] = "Ganteng";

        //deteksi ukuran baris array 
        int deteksi = ar.length;
        System.out.println(deteksi);
        //deteksi ukuran kolom array
        int deteksi2 = ar[0].length;
        System.out.println(deteksi2);

        char karakter[][] = {
            //Kolom
            /**
             * Baris
             */
            {'S', 'A'},
            /**
             * Baris
             */
            {'N', 'I'}
        };
        deteksi = karakter.length;
        System.out.println("jumlah baris pada array karakter = " + deteksi);
        deteksi2 = karakter[0].length;
        System.out.println("jumlah kolom pada array karakter = " + deteksi2);

        System.out.print(karakter[0][0]);
        System.out.print(karakter[0][1]);
        System.out.print(karakter[1][0]);
        System.out.println(karakter[1][1]);
    }
}
