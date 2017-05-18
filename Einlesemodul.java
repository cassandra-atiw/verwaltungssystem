/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassandra.modules;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.logging.Logger;

/**
 *
 * @author timon
 */
public class Einlesemodul {
    private static int INDEX = 0;
    private Path [] pfad;
    private List<String[]> wahldaten;
    
    public Einlesemodul(Path _pfad1, Path _pfad2, Path _pfad3) {
        pfad = new Path[]{ _pfad1, _pfad2, _pfad3};
        wahldaten = new ArrayList<String[]>();
    }
    
    public void leseDatensaetze(){
        String text ="";
        
        try(BufferedReader br = Files.newBufferedReader(pfad[0])){
            
            while((text = br.readLine()) != null){
                if(INDEX == 0 )
                    INDEX +=1;
                wahldaten.add(text.split(";"));
            }
        }catch(IOException io){
            System.out.println(io.getMessage());
        }
    }
}
