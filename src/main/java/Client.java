
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
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
public class Client {

    Socket so;
    BufferedReader br;
    BufferedWriter bw;
    private int porta;

    public Client(InetAddress ip, int port) {
        try {
            
            so = new Socket(ip, porta);
            br = new BufferedReader(new InputStreamReader(so.getInputStream()));

        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public String leggi() {
        String msg = "";

        try {
            msg = br.readLine();
    
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);

        }

        return msg;
    }
}
        
        

