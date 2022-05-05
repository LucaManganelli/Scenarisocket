
import java.net.InetAddress;
import java.net.UnknowHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucamanganelli
 */
public class GestoreClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try {
   
        // TODO code application logic here
        Client cli = new Client(InetAddress.getLocalHost(),2000);
        
        String messaggioletto = cli.leggi();
        System.out.println(messaggioletto);
    
    }   catch (UnknowHostException ex) {
        Logger.getLogger(GestoreClient.class.getName()).log(Level.SEVERE, null, ex);
        
        }   
    }
    
}
   
    


   
