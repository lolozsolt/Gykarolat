/*
 Néhány leckével ezelőtt volt egy buszos példánk, ahol a busz 5 megállón keresztül ment és a megállókban utasok szálltak fel és le.
Modellezzük objektum-orientáltan ezt a buszt:
Az Autobusz osztálynak van kapacitása ( int kapacitas ), és pillanatnyi utasszáma ( int utasszam ).
A busz vezérléséhez a írjuk meg a megallo(int felszall, int leszall) metódust, mely egy megállóban történteket
szimulálja. Az akkori feladat kérdéseire a következő metódusok válaszolnak:
hányan utaztak a 4. megálló elhagyása után? - a 4. megálló után lekérdezzük a busztól az utasszam adattag 
értékét. hibásak-e az adatok, ha tudjuk, hogy az első megállóhoz üres busz érkezik? - 
Írjunk boolean vanHiba() metódust, mely
megadja, hogy volt-e hiba (túl sok ember, negatív utasszám, van-e még fent utas)
Ha az adatsor hibás, írjuk ki, hányadik megállónál van (az első) hiba? - Írjunk int getElsoHibaHely() metódust, 
amely visszaadja az első hiba megállójának számát.
Mennyi volt a felszálló utasok minimális száma? - int getMinimumFelszallo()
Mennyi volt a buszon utazók átlagos száma? - int getAtlagUtas()
Melyik megálló után volt a legtöbb utas az autóbuszon? - int getMaximumUtasHely()
 */
package gakorlatok;

public class Autobusz {
    
    int kapacitas;
    int utasszam;
    
    public void megallo(int felszall,int leszall){
        utasszam += felszall - leszall;
    }
    
    public boolean vanhiba(){
        boolean igaz = false;   
        if(utasszam > kapacitas || utasszam < 0 || utasszam > 1){
            igaz = true;
        }
        return igaz;
    }
    
    // nem tudom ha jo amit ide irtam.
    public int getElsoHibaHely(){
        int elsoHiba = 0;
        for(int i =0; i < 4; i++){
            if(this.vanhiba())
               elsoHiba = i; 
        }
        return elsoHiba;
    }
    
    //Adattag nelkul nem tudom megoldani
    public int getMinimumFelszallo(){
        
    }
    
    public int getAtlagUtas(){
        return utasszam / 5;
    }
    
    public int getMaximumUtasHely(){
        
    }
    
    
}
