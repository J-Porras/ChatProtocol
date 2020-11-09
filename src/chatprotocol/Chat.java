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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Porras
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Chat implements Serializable {
    
    private String codigo;
 //@XmlIDREF
    private String emisor;
   //@XmlIDREF
    private String receptor;
    
    private List<Mensaje> chat;
    
    public Chat(){}


 
    
    public Chat(String emisor,String receptor){
        this.emisor = emisor;
        this.receptor = receptor;
        this.chat = Collections.synchronizedList(new ArrayList<Mensaje>());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    

    public List<Mensaje> getChat() {
        return chat;
    }

    public void setChat(List<Mensaje> chat) {
        this.chat = chat;
    }
    
    public void addMsg(Mensaje msg){
        chat.add(msg);
    }

    public String getRemitente() {
        return emisor;
    }

    public void setRemitente(String remitente) {
        this.emisor = remitente;
    }

    public String getDestino() {
        return receptor;
    }

    public void setDestino(String receptor) {
        this.receptor = receptor;
    }
    
    
    
    

}
