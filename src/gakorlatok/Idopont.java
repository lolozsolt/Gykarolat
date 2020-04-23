/*
 Készítsünk Idopont osztályt, mely egy napon belüli időpontot tárol ( int ora , int perc , int masodperc ), melyekről
tudjuk, hogy az ora 0..23 tartományban vehet fel értéket, a perc 0..59 tartományban, a masodperc szintén 0..59
tartományban. Készítsünk az osztályhoz void kiir() metódust, amivel kiírhatjuk az időpontot ebben a formátumban:
09:01:08 . Készítsünk olyan metódust, amely egy megadott számú másodperccel növeli az időpontot úgy, hogy a túlcsordulást
kezeli ( void novel(int mp) ). Tehát ha 13:44:51 -hez 15 másodpercet adunk, akkor 13:45:06 lesz, míg ha 23:59:59 -
hez 5 másodpercet adunk, akkor 00:00:04 lesz.
 */
package gakorlatok;

public class Idopont {

int ora;
int perc;
int masodperc;

public void kiir(){
   //perc < 10 ? "0" + perc.toString() : perc;
   
   
    System.out.println(ora+": " +perc +": " +masodperc);
   
}
public void novel(int mp){
    if(masodperc + mp > 59){
        perc++;
        masodperc = (masodperc + mp)-60;
    }
    else{
        if(masodperc + mp <=59){
           masodperc += mp;
        }            
    }
    
    if(perc > 59){
       ora++;
       perc = 0;
       masodperc = 0;
    }
        
    if(ora > 23){
       ora = 0;
    }
  }

}
