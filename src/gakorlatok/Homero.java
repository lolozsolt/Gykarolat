
package gakorlatok;

import java.util.Scanner;    
    /*Készítsünk Homero osztályt, mely egy olyan hőmérőt modellez, amelyen van Fahrenheit és Celsius-skála is, azaz 
a hőmérsékletet megadhatjuk és lekérdezhetjük Celsius-fokban és Fahrenheit-fokban is, tehát rendelkezik void 
setFahrenheit(double fahr) , void setCelsius(double celsius) , double getFahrenheit() és double getCelsius() metódusokkal.
Ezek a metódusok ugyanazt az EGY(!!!) adattagot változtatják! Az adattag tárolja az értéket Celsius-fokban ( double
celsius ), és mikor a Fahrenheitben állítjuk be vagy kérdezzük le az adatokat ( setFahrenheit() vagy getFahrenheit() ),
akkor Celius-fokba és Celsius-fokból átkonvertálja! */

public class Homero{

Scanner sc = new Scanner(System.in);
double celsius;

    public void setFahrenheit(double fahr){
        celsius = fahr -32 /1.800;
    }
    
    public void setCelsius(double celsius){
        this.celsius = celsius;
    }

    public double getFahrenheit(){
        return celsius *(9/5)+32;
    }

    public double getCelsius(){
        return celsius;
    }    

}



