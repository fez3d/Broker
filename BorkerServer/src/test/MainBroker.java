/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import broker.Broker;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class MainBroker {
    public static void main(String[] args) {
        try {
            System.out.println("broker");
            new Broker();
        } catch (IOException ex) {
            Logger.getLogger(MainBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
