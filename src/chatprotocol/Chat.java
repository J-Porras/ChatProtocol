/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatprotocol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.annotation.XmlIDREF;

/**
 *
 * @author Porras
 */
public class Chat {
    private String codigo;
    @XmlIDREF
    private Client remitente;
    @XmlIDREF
    private Client destino;
    @XmlIDREF
    private List<Mensaje> chat;
    
    public Chat(){}


    public Chat(Client remitente, Client destino, List<Mensaje> chat) {
        this.remitente = remitente;
        this.destino = destino;
        this.chat = Collections.synchronizedList(chat);
        codigo = this.remitente.getNickname() + "-"+ this.destino.getNickname();
    }
    
    public Chat(Client remitente,Client destino){
        this.remitente = remitente;
        this.destino = destino;
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
        return remitente;
    }

    public void setRemitente(Client remitente) {
        this.remitente = remitente;
    }

    public Client getDestino() {
        return destino;
    }

    public void setDestino(Client destino) {
        this.destino = destino;
    }
    
    
    
    

}
