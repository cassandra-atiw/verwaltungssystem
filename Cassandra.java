/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassandra;

import com.datastax.driver.core.*;
import com.datastax.driver.core.Session;


/**
 *
 * @author timon
 */
public class Cassandra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        com.datastax.driver.core.Session s = null;
        
        String query = "Insert into t2 (name, age) VALUES ('Peter', 2)";
        Cluster cl = Cluster.builder().addContactPoint("127.0.0.1").withPort(9042).build();
        
        s = cl.connect("fs152");
        
        ResultSet rs = s.execute(query);
        if(rs.isExhausted()){
            System.out.println("Befehl '"+query+"' erfolgreich");
        }
        //
        s.close();
        cl.close();
        
        
       
    }
    
}
