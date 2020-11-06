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
    private List<String>  mensajes;

    public Mensaje(Client destino, Client remitente, List<String> mensajes) {
        this.destino = destino;
        this.remitente = remitente;
        this.mensajes = mensajes;
    }
    
    public Mensaje(){
        destino = new Client();
        remitente = new Client();
        mensajes = Collections.synchronizedList(new ArrayList<String>());
        
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

    public List<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<String> mensajes) {
        this.mensajes = mensajes;
    }
    
    
    
    
}
