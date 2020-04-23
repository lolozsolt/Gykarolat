
package gakorlatok;

import java.util.Scanner;


public class ItalVezerlo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
       
        
        Ember feri = new Ember();
        feri.nev = "Feri";
        feri.kilogramm = 98;
        Ital palinka = new Ital();
        palinka.ml = 50;
        palinka.szazalek = 50;
        System.out.println(palinka.getAlkoholGramm()); // 20
        feri.megiszik(palinka);
        System.out.println(feri.veralkoholEzrelek()); // 0.204081
        System.out.println(feri.getJozanIdo()); // 2.2222
        feri.pihen(9.3);
        System.out.println(feri.veralkoholEzrelek()); // 0.0
        System.out.println(feri.getJozanIdo()); // 0.0
    }
}
