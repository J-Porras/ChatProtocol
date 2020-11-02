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
public class Protocol {
    public static final String SERVER = "localhost";
    public static final int PORT = 8086;
    
    
    // parte cliente -> server
    public static final int LOGIN = 1;
    public static final int LOGOUT = 2;
    public static final int SIGNIN = 3;
    public static final int MSG = 4;
    
    
    // parte server -> cliente
    public static final int DELIVER = 1;
    
    public static final int ERROR_NO_ERROR = 0;
    public static final int ERROR_LOGIN = 1;
    public static final int ERROR_LOGOUT = 2;
    public static final int ERRRO_POST = 3;

}
