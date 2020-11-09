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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;

/**
 *
 * @author Porras
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Mensaje implements Serializable{
    
    private String codigo;
  //  @XmlIDREF
    private String _destino;
    //@XmlIDREF
    private String _remitente;
    private String mensaje;

    public Mensaje(String destino, String remitente, String mensaje) {
        this._destino = destino;
        this._remitente = remitente;
        this.mensaje = mensaje;
        codigo = destino + " - " + remitente + mensaje.substring(1);
    }
    
    public Mensaje(){
     
        
    }

    public String getDestino() {
        return _destino;
    }

    public void setDestino(String destino) {
        this._destino = destino;
    }

    public String getRemitente() {
        return _remitente;
    }

    public void setRemitente(String remitente) {
        this._remitente = remitente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    
    
    
    
}
