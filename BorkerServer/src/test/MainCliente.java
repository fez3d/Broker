/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import broker.ClienteProxy;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class MainCliente {
    public static void main(String[] args) {
        try {
            System.out.println("cliente");
            new ClienteProxy();
        } catch (IOException ex) {
            Logger.getLogger(MainCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
