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

/**
 *
 * @author Porras
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Client implements Serializable{
    
    @XmlID
    private String id;
    
    private String password;
    private String nombre;
    private String nickname;
    private List<Client> friends;
    private List<Mensaje> chats;
    private Client destino;
    private boolean isonline;
    
    public Client(){
        this.id = "";
        this.password = "";
        this.nombre = "";
        this.nickname = "";
        this.friends = Collections.synchronizedList(new ArrayList<Client>());
        chats = Collections.synchronizedList(new ArrayList<Mensaje>());
        for (int i = 0; i < chats.size(); i++) {
            chats.get(i).setDestino(this);
        }
        destino = null;
        isonline = false;
    }

    public Client(String id, String password, String nombre, String nickname, List<Client> friends) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.nickname = nickname;
        this.friends = Collections.synchronizedList(new ArrayList<Client>());
        isonline = false;
    }

    public Client(String id, String password, String nombre, String nickname, List<Client> friends, List<Mensaje> chats, Client destino) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.nickname = nickname;
        this.friends = Collections.synchronizedList(new ArrayList<Client>());;
        this.chats = Collections.synchronizedList(new ArrayList<Mensaje>());
        for (int i = 0; i < chats.size(); i++) {
            chats.get(i).setDestino(this);
        }
        this.destino = destino;
    }
    
    
    // get and set por variable
    
    public List<Mensaje> getChats() {    
        return chats;
    }

    
    public void setChats(List<Mensaje> chats) {
        this.chats = chats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Client> getFriends() {
        return friends;
    }

    public void setFriends(List<Client> friends) {
        this.friends = friends;
    }

    public Client getDestino() {
        return destino;
    }

    public void setDestino(Client destino) {
        this.destino = destino;
    }

    public boolean getIsonline() {
        return isonline;
    }

    public void setIsonline(boolean isonline) {
        this.isonline = isonline;
    }
    
    public void addtoChat(String id,String msg){
        for (int i = 0; i < this.chats.size(); i++) {
            if (this.chats.get(i).getDestino().getId() == id) {
                this.chats.get(i).getMensajes().add(msg);
                break;
            }
        }
    }
        
    
}//fin clase
