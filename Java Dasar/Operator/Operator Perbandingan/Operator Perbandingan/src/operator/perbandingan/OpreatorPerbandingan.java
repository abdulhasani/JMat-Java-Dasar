/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package operator.perbandingan;

/**
 *
 * @author joker
 */
public class OpreatorPerbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Hasil dari perbandingan merupakan nilai boolean 
        // TRUE  FALSE;
        boolean samaDengan;
        boolean samaDengan2;
        boolean tidakSamaDengan;
        boolean lebihBesar;
        boolean lebihBesarSamaDengan;
        boolean lebihKecil;
        boolean lebihKecilSamaDengan;

        samaDengan = 3 == 3;
        samaDengan2 = 'A' == 'a';
        tidakSamaDengan = 3 != 3;
        lebihBesar = 3 > 2;
        lebihBesarSamaDengan = 3 >= 3;
        lebihKecil = 3 < 4;
        lebihKecilSamaDengan = 3 <= 2;
        
        System.out.println(samaDengan);             //True
        System.out.println(samaDengan2);            //False
        System.out.println(tidakSamaDengan);        //False
        System.out.println(lebihBesar);             //True
        System.out.println(lebihBesarSamaDengan);  //True
        System.out.println(lebihKecil);             //True
        System.out.println(lebihKecilSamaDengan);   //False
    }
}
