/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassandra;

import com.datastax.driver.core.*;

/**
 *
 * @author timon
 */
public class DBVerbindung {
        
        
         public final static Cluster cl = Cluster.builder().addContactPoint("127.0.0.1").withPort(9042).build(); 
         public static Session s;
         
         public static ResultSet select(String query) throws Exception
         {
             s=cl.connect("Sitzplatzverteilung");
             ResultSet rs=s.execute(query);
             s.close();
             return rs;
         }
         
         public static void  insert(String query) throws Exception
         {
                   s=cl.connect("Sitzplatzverteilung");
                   s.execute(query);           
         }
}
