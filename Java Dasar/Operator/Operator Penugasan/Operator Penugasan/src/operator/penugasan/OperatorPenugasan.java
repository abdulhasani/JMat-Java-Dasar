/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.penugasan;

/**
 *
 * @author joker
 */
public class OperatorPenugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int uang;
        int uang2;
        int uang3;
        double nilai;
        int nilai2;

        uang = 1000;
        //uang=uang+1000;
        uang+=1000;

        uang2 = 5000;
        uang2 -= 5000;

        uang3 = 2000;
        uang3*=4000;

        nilai = 5;
        nilai/=2;

        nilai2 = 10;
        nilai2 %= 2;

        System.out.println(uang);
        System.out.println(uang2);
        System.out.println(uang3);
        System.out.println(nilai);
        System.out.println(nilai2);
    }
}
