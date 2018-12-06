/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author dmc-4
 */
public class ClienteProxy {

    private final ServerSocket ss;
    
    public ClienteProxy() throws IOException {
        sendRequest();
        ss = new ServerSocket(1237);
        loop();
    }
    
    public void loop(){
        while(true){
            recibir(ss);
        }
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
    
    public void recibir(ServerSocket socketClient){
        try {
            Socket fromClientSocket = socketClient.accept();
            PrintWriter pw = new PrintWriter(fromClientSocket.getOutputStream(), true);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(fromClientSocket.getInputStream()));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println("The message: " + str);
                fromClientSocket.close();
                br.close();
                
            }
            
            
        } catch (IOException ex) {
            
        }
    }
    
    public void regresar(){
        
    }
}
