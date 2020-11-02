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
public class Client {
    
    private String id;
    private String password;
    private String nombre;
    private String nickname;
    private List<Client> friends;
    
    public Client(){}

    public Client(String id, String password, String nombre, String nickname, List<Client> friends) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.nickname = nickname;
        this.friends = Collections.synchronizedList(new ArrayList<Client>());
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
    
    
    
        
        
    
    
    
    
    
}
