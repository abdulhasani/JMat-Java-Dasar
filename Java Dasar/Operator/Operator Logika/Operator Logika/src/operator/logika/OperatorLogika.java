/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package operator.logika;

/**
 *
 * @author joker
 */
public class OperatorLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean AND;
        boolean AND2;
        boolean AND3;
        boolean AND4;

        AND = true && true;
        AND2 = true && false;
        AND3 = false && true;
        AND4 = false && false;
        System.out.println("TRUE && TRUE = " + AND);
        System.out.println("TRUE && FALSE = " + AND2);
        System.out.println("FALSE && TRUE = " + AND3);
        System.out.println("FALSE && FALSE = " + AND4);
        //Jadi bagaimana kesimpulan dari Operator AND ini  ??

        boolean OR;
        boolean OR2;
        boolean OR3;
        boolean OR4;

        OR = true || true;
        OR2 = true || false;
        OR3 = false || true;
        OR4 = false || false;
        System.out.println();
        System.out.println("TRUE || TRUE = " + OR);
        System.out.println("TRUE || FALSE = " + OR2);
        System.out.println("FALSE || TRUE = " + OR3);
        System.out.println("FALSE || FALSE = " + OR4);
       //Jadi bagaimana kesimpulan dari Operator OR ini  ??
    }
}
