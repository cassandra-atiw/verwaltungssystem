/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassandra.data;

import java.util.HashMap;

/**
 *
 * @author timon
 */
public class Landesliste {
    
    // Attribute
    
    HashMap<Politiker, Integer> landesliste;
    
    // Konstruktoren
    
    public Landesliste(){
        this.landesliste = new HashMap<>();
    }
    
    // Getter & Setter
    
    public int getLandeslistenPlatz(Politiker p){
        return this.landesliste.get(p);
    }
    
    public void add(Politiker p, int listenplatz){
        this.landesliste.put(p, listenplatz);
    }
    
}
