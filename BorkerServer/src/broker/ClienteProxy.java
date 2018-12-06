/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broker;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author dmc-4
 */
public class ClienteProxy {

    public ClienteProxy() throws IOException {
        sendRequest();
    }
    
    
    
    public void packData(){
        
    }
    
    public void unpackData(){
        
    }
    
    public void sendRequest() throws IOException{
        Socket socket = null;
        OutputStreamWriter osw;
        String str = "Hello World";
        try {
            socket = new Socket("localhost", 1235);
            osw =new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(str, 0, str.length());
            bw.flush();
            socket.close();
            //osw.write(str, 0, str.length());
        } catch (IOException e) {
            System.err.print(e);
        } finally {
            socket.close();
        }
        
    }
    
    public void regresar(){
        
    }
}
