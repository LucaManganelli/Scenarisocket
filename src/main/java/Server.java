

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
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
public class Server {
    
        
        ServerSocket ss;
        Socket so;
        BufferedReader br;
        BufferedWriter bw;
        
        public Server(int porta)
        {
                try{
                    ss = new ServerSocket (porta);
                    System.out.println ("OK sono in ascolto !!");
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null,ex);
                }
        }
        
        public void inAscolto(){
            
            try {
                
            so = ss.accept();
            System.out.println("Connessione stabilita");
            
        } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null,ex);
                }
            
            
        }

    void scrivi(String ciao_client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
   

