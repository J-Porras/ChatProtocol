/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatprotocol;

/**
 *
 * @author Porras
 */
public interface IService {
    public Client login(Client c) throws Exception;
    public void logout(Client c) throws Exception;
    public void post_msg(String msg);
    
}
