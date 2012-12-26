/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package perluasan.operator.logika;

/**
 *
 * @author joker
 */
public class PerluasanOperatorLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean nilai;
        nilai = (40 == 40) && (40 > 30);
        //True  &&    True

        System.out.println(nilai);
        nilai = (40 < 20) || ('A' == 'a');
        //False  ||    False
        System.out.println(nilai);

        nilai = 40 > 20 || 'A' == 'C' && 'A' == 'B';//Apa hasilnya ???
                //True || False  && False 
        System.out.println(nilai);
        
        
    }
}
