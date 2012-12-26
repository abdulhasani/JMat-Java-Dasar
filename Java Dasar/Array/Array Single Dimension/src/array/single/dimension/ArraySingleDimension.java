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
        String[] ar = new String[2];
        ar[0] = "Sani";
        ar[1] = "Hasani";
        int ukuran = ar.length;
        System.out.println(ukuran);
        System.out.print(ar[0] + " ");
        System.out.println(ar[1]);

        int[] nilai={
        50,60,70,80
        };
        
        System.out.println(nilai[0]);
        System.out.println(nilai[3]);
    }
}
