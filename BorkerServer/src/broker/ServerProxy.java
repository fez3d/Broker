/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broker;

/**
 *
 * @author dmc-4
 */
public class ServerProxy {
    private final Server server = new Server();
    private final Broker broker = new Broker();
    
    public void unpack_data(){
        
    }
    
    public void pack_data(){
        
    }
    
    public void call_service(){
        server.run_service();
    }
    
    public void send_response(String response){
        broker.fowardResponse(response);
    }
}
