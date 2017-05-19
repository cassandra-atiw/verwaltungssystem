/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassandra.data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author timon
 */
public class Zweitstimmliste {
    
    // Attribute
    private HashMap<Partei, Integer> zweitstimmListe; 
    
    //Konstruktor
    public Zweitstimmliste(){
        zweitstimmListe = new HashMap<>();
    }

    // Getter & Setter
    
    public int getZweitstimmListe(Partei p){
        return this.zweitstimmListe.get(p);
    }
    
    public void add(Partei p, int stimmenAnz){
        this.zweitstimmListe.put(p, stimmenAnz);
    }
    
}

