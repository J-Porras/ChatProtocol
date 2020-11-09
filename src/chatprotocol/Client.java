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

/**
 *
 * @author Porras
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Client implements Serializable{
    
    //@XmlID
    private String id;
    
    private String password;
    private String nombre;
    private String nickname;
    
    private List<Client> friends;
    private List<Chat> chats;
    
    //@XmlIDREF
   // private Client destino;
    
    private boolean isonline;
    
    public Client(){
        
        this.id = "N/A";
        this.password = "`";
        this.nombre = "-";
        this.nickname = "-";
        
        this.friends = Collections.synchronizedList(new ArrayList<Client>());
        chats = Collections.synchronizedList(new ArrayList<Chat>());
        for (int i = 0; i < chats.size(); i++) {
            for (int j = 0; j < chats.get(i).getChat().size(); j++) {
                chats.get(j).getChat().get(i).setRemitente(this.nickname);
            }
        }
        
        //destino = null;
        isonline = true;

    }
 public Client(String id, String password, String nombre, String nickname) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.nickname = nickname;
          this.friends = Collections.synchronizedList(new ArrayList<Client>());
        chats = Collections.synchronizedList(new ArrayList<Chat>());
        for (int i = 0; i < chats.size(); i++) {
            for (int j = 0; j < chats.get(i).getChat().size(); j++) {
                chats.get(j).getChat().get(i).setRemitente(this.nickname);
            }
        }     

        isonline = false;
    }
    public Client(String id, String password, String nombre, String nickname, List<Client> friends) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.nickname = nickname;
          this.friends = Collections.synchronizedList(new ArrayList<Client>());
        chats = Collections.synchronizedList(new ArrayList<Chat>());
        for (int i = 0; i < chats.size(); i++) {
            for (int j = 0; j < chats.get(i).getChat().size(); j++) {
                chats.get(j).getChat().get(i).setRemitente(this.nickname);
            }
        }     

        isonline = false;
    }

    public Client(String id, String password, String nombre, String nickname, List<Client> friends, List<Chat> chats, boolean isonline) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.nickname = nickname;
        this.friends = friends;
        this.chats = Collections.synchronizedList(chats);
        //this.destino = destino;
        this.isonline = isonline;
    }

   
    
    
    // get and set por variable
    

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

 //   public Client getDestino() {
  //      return this.destino;
  //  }

  //  public void setDestino(Client destino) {
  //      this.destino = destino;
   /// }

    public boolean getIsonline() {
        return isonline;
    }

    public void setIsonline(boolean isonline) {
        this.isonline = isonline;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }
    
    public Client findFriend(String nickname){   
        System.out.println("Amigos Mostrados");
        for (int i = 0; i < this.friends.size(); i++) {
           
             System.out.println(friends.get(i).getNickname());
             
            if (nickname.equals(friends.get(i).getNickname())) {
                return friends.get(i);
            }
        }
          System.out.println("Null chay no encontrado");
        return null;
    }
    
    public Chat getChatFriend(String nickname){
        System.out.println("Chat protocol get chat friend");
        for (int i = 0; i < this.chats.size(); i++) {
             System.out.println(this.chats.get(i).getDestino());
            if (this.chats.get(i).getDestino().equals(nickname)) {
                System.out.println("OJO: chat encontrado");
                return chats.get(i);
            }
        }
        System.out.println("OJO CHAT NO ENCONTRADO");
        return null;
    }
    
    public void addtoChat(Mensaje msg){//busca el primer msg de la conversacion
        //Client destino = msg.getDestino();
        for (int i = 0; i < this.chats.size(); i++) {
            if (this.chats.get(i).getDestino().equals(msg.getDestino())) {
                chats.get(i).getChat().add(msg);
                break;
            }
            
        }
    }
    
    
    public void addFriend(Client c){
        if (!isDuplicated(c.getNickname())) {
            this.friends.add(c);
            Chat chat = new Chat(this.nickname,c.getNickname());
            this.chats.add(chat);
        }
    }
    
    public boolean isDuplicated(String nickname){
        for (int i = 0; i < this.friends.size(); i++) {
            if (nickname == friends.get(i).getNickname()) {
                return true;
            }
        }
        return false;
    }
    
    
    

        
    
}//fin clase
