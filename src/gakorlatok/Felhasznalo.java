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
public class Felhasznalo {
   private static int nextId = 1;
   private int id;

   public void setID(int id){
       nextId = id;
   }
   
   public void kiir(){
       System.out.println("ID: " +nextId);
   }   
   
}

