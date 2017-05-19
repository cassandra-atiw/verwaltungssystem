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
public class Erstimmenliste {
    
    //Attribute
    private HashMap<Politiker, Integer> map;
    
    //Konstruktor
    public Erstimmenliste()
    {
        map=new HashMap();
    }
    
    //Getter
    public int getStimmen(Politiker politiker)
    {
        return map.get(politiker);
    }
    
    /**
     * Fügt ein Keyvaluepaar hinzu
     * @param pol
     * @param stimmen 
     */
    public void add(Politiker pol, int stimmen)
    {
        map.put(pol, stimmen);
    }
    
    //
}
