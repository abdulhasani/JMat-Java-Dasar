/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package san.jmat.belajar.metode.string;

/**
 *
 * @author joker
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama;
        int panjangNama;
        nama = "Java Master";
        //Abil panjang String 
        panjangNama = nama.length();
        System.out.println("Nama\t\t : "+nama);
        System.out.println("Panjang String\t : "+panjangNama);
        
        //Mendeteksi sebuah kata atau karakter Di Awal
        //pada sebuah String 
        boolean startsWith;
        boolean endsWith;
        startsWith = nama.startsWith("Java");
        endsWith = nama.endsWith("Master");
        System.out.println();
        System.out.println("Apakah kata pertama adalah : Java = "+startsWith);
        System.out.println("Apakah kata kedua adalah : Master = "+endsWith);
        //Mengambil Karekter tertentu pada String
        char charAt = nama.charAt(0);
        System.out.println();
        System.out.println("Karekter ke 1 pada Java Master adalah "+charAt);
        //Menyamakan String
        System.out.println();
        boolean equals = nama.equals("java master");
        System.out.println("Apakah Java Master == java master "+equals);
        System.out.println();
        //Memotong Spase Di Awal dan Di Akhir
        String trim;
        trim = " Java Master ";
        int length = trim.length();
        System.out.println("Panjang String Sebelum DiPotong "+length);
        String trim1 = trim.trim();
        System.out.println("Panjang String Sesudah DiPotong "+trim1.length());
        System.out.println();
        
        String sub="Java Master";
        //Menghilangkan Karakter tertentu pada String
        //initinya membaca stringnya dimulai dari index berapa
        String substring = sub.substring(4);
        System.out.println("Java dihilangkan menjadi ="+substring);
        //initinya membaca stringnya dimulai dari index berapa dan diakhiri
        //di index berapa
        String substring1 = sub.substring(4, 6);
        System.out.println("Java aser dihilangkan menjadi ="+substring1);
        System.out.println();
        //Merubah Kapital ke non kapital dan sebaliknya
        String kata="JaVa mASTEr";
        String toLowerCase = kata.toLowerCase();
        System.out.println(toLowerCase);
        String toUpperCase = toLowerCase.toUpperCase();
        System.out.println(toUpperCase);
        //Menggabungkan Dua String
        String bahasa="Java";
        String pakar="Master";
        String gabungkan=bahasa.concat(pakar);
        System.out.println();
        System.out.println(gabungkan);
    }
}
