/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassandra.data;

/**
 * Fachklasse zur Darstellung der politiker
 * @author denis
 */
public class Politiker {
    //Attribute
    private int politikerID;
    private String name;
    private Partei partei;
    private String beruf;
    
    //Konstruktor
    public Politiker(int politikerID, int jahr)
    {
        leseDaten(politikerID, jahr);
    }
    //Getter
    /**
     * @return the politikerID
     */
    public int getPolitikerID() {
        return politikerID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the partei
     */
    public Partei getPartei() {
        return partei;
    }
    
    /**
     *
     * @param partei
     */
    public void setPartei(Partei partei){
        this.partei=partei;
    }
    
    /**
     * @return the beruf
     */
    public String getBeruf() {
        return beruf;
    }   
    //Methoden
    
    private void leseDaten(int politikerID, int jahr)
    {
        
    }
}
