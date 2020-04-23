/*
 Készítsünk Kancso osztályt, amelyik tárolja, hogy mekkora űrtartalmű ( double urtartalom ml-ben), valamint pillanatnyilag
mennyi folyadék van benne ( double folyadek ml-ben).
Ezen kívül rendelkezik kiUrit() metódussal, ami a tárolt folyadék mennyiségét 0-ra állítja,
teleTolt() metódussal, amely a tárolt folyadék szintjét átállítja maximálisra, valamint
kiOnt(double mennyiseg) kiönt a kancsóból valamennyit. (De nem lehet a kancsót üresnél jobban kiüríteni!)
beleTolt(double mennyiseg) , amely beletölt a kancsóba megadott mennyiségű (ml) folyadékot. Ha túl sokat töltünk a
kancsóba, a bele nem férő mennyiség kifolyik!
A kancsóban lévő folyadék mennyiségét és az űrtartalmát le lehet kérdezni ( getFolyadekMl() és getUrtartalomMl()
metódusok).
Adjunk az előbbi feladat Kancso osztályához egy olyan metódust, amellyel egy másik Kancsóba átönthetünk valamennyi
folyadékot: atOnt(Kancso mibe, double mennyiseg) . A metódus figyel arra, hogy ne lehessen se túl sok, se túl kevés
folyadék egyik kancsóban sem.
 */
package gakorlatok;

/**
 *
 * @author Batman
 */
public class Kancso {
    
    double urtartalom;
    double folyadek;
    
    void kiUrit(){
        folyadek = 0;
    }
    
    void teleTolt(){
        folyadek = urtartalom;
    }
    
    void kiOnt(double mennyiseg){
        if(mennyiseg > folyadek){
            folyadek -= folyadek;
        }else{
            folyadek -= mennyiseg;
        }
    }
    
    void beleTolt(double mennyiseg){
        if(mennyiseg + folyadek > urtartalom){
            folyadek = urtartalom;
        }else{
            folyadek += mennyiseg;
        }
    }
    
    double getFolyadekMl(){
        return folyadek;
    }
    
    double getUrtartalomMl(){
        return urtartalom;
    }
    
    void atOnt(Kancso mibe, double mennyiseg){
        if(mennyiseg < this.folyadek){
            mibe.folyadek+= mennyiseg;
            this.folyadek -=mennyiseg;
        }else 
            if(mennyiseg > this.folyadek && mennyiseg > mibe.urtartalom - mibe.folyadek){
                this.folyadek = 0;
                mibe.folyadek += mibe.urtartalom - mibe.folyadek;
            }
            
    }
}
