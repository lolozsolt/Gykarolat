
package gakorlatok;



import java.util.Scanner;

/**
 *
 * @author Batman
 */
public class Gakorlatok {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kancso k1 = new Kancso();
        k1.urtartalom = 500;
        Kancso k2 = new Kancso();
        k2.urtartalom = 400;
        k1.atOnt(k2, 200);
        System.out.println(k1.getFolyadekMl()); // 0
        System.out.println(k2.getFolyadekMl()); // 0
        k1.teleTolt();
        k1.atOnt(k2, 200);
        System.out.println(k1.getFolyadekMl()); // 300
        System.out.println(k2.getFolyadekMl()); // 200
        k1.atOnt(k2, 400);
        System.out.println(k1.getFolyadekMl()); // 0 - nem volt benne több, csak 300
        System.out.println(k2.getFolyadekMl()); // 400 - nem fért bele több
        k2.atOnt(k1, 500);
        System.out.println(k1.getFolyadekMl()); // 400 - nem volt benne több, csak 400
        System.out.println(k2.getFolyadekMl()); // 0 - nem volt benne több, csak 400
    }
    
}
