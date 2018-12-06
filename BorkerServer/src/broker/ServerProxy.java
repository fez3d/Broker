/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author dmc-4
 */
public class ServerProxy {

    private final ServerSocket ss;

    public ServerProxy() throws IOException {
        ss = new ServerSocket(1236);
        loop();
    }
    
    public void loop(){
        while(true){
            call_service(ss);
        }
    }
    
    public void unpack_data(){
        
    }
    
    public void pack_data(){
        
    }
    
    public void call_service(ServerSocket socketClient){
        try {
            Socket fromClientSocket = socketClient.accept();
            PrintWriter pw = new PrintWriter(fromClientSocket.getOutputStream(), true);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(fromClientSocket.getInputStream()));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println("The message: " + str);
                
            }
            
            
        } catch (IOException ex) {
            
        }
    }
    
    public void send_response(String response){
        
    }
}
