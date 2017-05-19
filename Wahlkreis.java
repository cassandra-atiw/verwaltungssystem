/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassandra.data;

/**
 *
 * @author denis
 */
public class Wahlkreis {
    //Attribute
    private int wahlkreisnummer;
    private String name;
    private int gueltigeErststimmen;
    private int gueltigeZweitstimmen;
    private int anzahlWaehler;
    private Erstimmenliste erstListe;
    private Zweitstimmliste zweitListe;
    
    //Konstruktor
    public Wahlkreis(int nummer, int jahr)
    {
        leseDaten(nummer, jahr);
    }

//Getter
    /**
     * @return the wahlkreisnummer
     */
    public int getWahlkreisnummer() {
        return wahlkreisnummer;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the gueltigeErststimmen
     */
    public int getGueltigeErststimmen() {
        return gueltigeErststimmen;
    }

    /**
     * @return the gueltigeZweitstimmen
     */
    public int getGueltigeZweitstimmen() {
        return gueltigeZweitstimmen;
    }

    /**
     * @return the anzahlWaehler
     */
    public int getAnzahlWaehler() {
        return anzahlWaehler;
    }

    /**
     * @return the erstListe
     */
    public Erstimmenliste getErstListe() {
        return erstListe;
    }

    /**
     * @return the zweitListe
     */
    public Zweitstimmliste getZweitListe() {
        return zweitListe;
    }
    
    //Methoden
    private void leseDaten(int nummer, int jahr)
    {
        
    }
}
