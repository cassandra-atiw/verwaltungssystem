/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassandra.data;

/**
 * Fachklasse zur Darstellung der Parteien
 * @author denis
 */
public class Partei {
    
    //Attribute
    private String name;

    //Konstruktor
    public Partei(String name)
    {
        this.name=name;
    }
    
    //Getter
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
}
