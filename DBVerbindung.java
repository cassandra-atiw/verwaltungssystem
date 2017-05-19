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
         
         public static void openSession(){
             s = cl.connect("Sitzplatzverteilung");
         }
         
         public static void closeSession(){
             s.close();
         }
         
         public static ResultSet select(String query) throws Exception{
            return s.execute(query);
         }
         
         public static void insert(String query) throws Exception{
            s.execute(query);  
         }
}
