/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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

    public Broker() throws IOException {
        mainEventLoop();
    }
    
    
    
    public void mainEventLoop() throws IOException{
        ServerSocket socketServer = new ServerSocket(1234);
        ServerSocket socketClient = new ServerSocket(1235);
        while(true){
            if(findClient(socketClient)){
                System.out.println("maineventloop");
            }
        }
    }
    
    public void updateRepository(){
        
    }
    
    public void findServer(){
        
    }
    
    public boolean findClient(ServerSocket socketClient){
        try {
            //System.out.println("findclient");
            Socket fromClientSocket = socketClient.accept();
            //PrintWriter pw = new PrintWriter(fromClientSocket.getOutputStream(), true);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(fromClientSocket.getInputStream()));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println("The message: " + str);
                fowardRequest(str);
                fromClientSocket.close();
                br.close();
            }
            
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    
    public void fowardRequest(String str) throws IOException{
        Socket socket = null;
        OutputStreamWriter osw;
        
        try {
            socket = new Socket("localhost", 1236);
            osw =new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(str, 0, str.length());
            bw.flush();
            socket.close();
        } catch (IOException e) {
            System.err.print(e);
        } finally {
            socket.close();
        }
        
    }
    
    public void fowardResponse(String response){
        
    }
}
