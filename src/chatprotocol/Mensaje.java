/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatprotocol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Porras
 */
public class Mensaje {
    private Client destino;
    private Client remitente;
    private String mensaje;

    public Mensaje(Client destino, Client remitente, String mensaje) {
        this.destino = destino;
        this.remitente = remitente;
        this.mensaje = mensaje;
    }
    
    public Mensaje(){
        destino = new Client();
        remitente = new Client();
        mensaje = "-";
        
    }

    public Client getDestino() {
        return destino;
    }

    public void setDestino(Client destino) {
        this.destino = destino;
    }

    public Client getRemitente() {
        return remitente;
    }

    public void setRemitente(Client remitente) {
        this.remitente = remitente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    
    
    
    
}
