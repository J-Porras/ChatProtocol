/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatprotocol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

/**
 *
 * @author Porras
 */
public class Chat {
    
    private String codigo;
    @XmlIDREF
    private Client emisor;
    @XmlIDREF
    private Client receptor;
    
    private List<Mensaje> chat;
    
    public Chat(){}


 
    
    public Chat(Client emisor,Client receptor){
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

    public Client getRemitente() {
        return emisor;
    }

    public void setRemitente(Client remitente) {
        this.emisor = remitente;
    }

    public Client getDestino() {
        return receptor;
    }

    public void setDestino(Client receptor) {
        this.receptor = receptor;
    }
    
    
    
    

}
