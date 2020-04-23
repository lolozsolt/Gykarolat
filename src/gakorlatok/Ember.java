/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gakorlatok;

/**
 *
 * @author Batman
 */
public class Ember {
    
    String nev;
    int kilogramm;
    double alkoholGramm;
    
    void megiszik(Ital ital){
        alkoholGramm +=ital.getAlkoholGramm();
    }
    
    void pihen(double ora){
        alkoholGramm -= (ora * 9);
    }
    
    double veralkoholEzrelek(){
        return alkoholGramm / kilogramm;
    }
    
    double getJozanIdo(){
        return alkoholGramm/9;
    }
}
