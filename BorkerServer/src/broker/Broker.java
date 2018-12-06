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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dmc-4
 */
public class Broker {
    
    public void mainEventLoop() throws IOException{
        ServerSocket socketServer = new ServerSocket(1234);
        ServerSocket socketClient = new ServerSocket(1235);
        while(true){
            if(findClient(socketClient)){
                
            }
        }
    }
    
    public void updateRepository(){
        
    }
    
    public void findServer(){
        
    }
    
    public boolean findClient(ServerSocket socketClient){
        try {
            Socket fromClientSocket = socketClient.accept();
            PrintWriter pw = new PrintWriter(fromClientSocket.getOutputStream(), true);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(fromClientSocket.getInputStream()));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println("The message: " + str);
                
            }
            
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    
    public void fowardRequest(){
        
    }
    
    public void fowardResponse(){
        
    }
}
