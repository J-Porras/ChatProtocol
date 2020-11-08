/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatprotocol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.annotation.XmlIDREF;

/**
 *
 * @author Porras
 */
public class Mensaje implements Serializable{
    
    private String codigo;
    @XmlIDREF
    private Client _destino;
    @XmlIDREF
    private Client _remitente;
    private String mensaje;

    public Mensaje(Client destino, Client remitente, String mensaje) {
        this._destino = destino;
        this._remitente = remitente;
        this.mensaje = mensaje;
        codigo = destino.getNickname() + " - " + remitente.getNickname() + mensaje.substring(1);
    }
    
    public Mensaje(){
        _destino = new Client();
        _remitente = new Client();
        mensaje = "-";
        
    }

    public Client getDestino() {
        return _destino;
    }

    public void setDestino(Client destino) {
        this._destino = destino;
    }

    public Client getRemitente() {
        return _remitente;
    }

    public void setRemitente(Client remitente) {
        this._remitente = remitente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    
    
    
    
}
