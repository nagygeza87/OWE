/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package login.action;

import connection.FtpClientConnectionHelperClass;

/**
 *
 * @author Geza
 */
public class Logout {

    public String logout(){
        FtpClientConnectionHelperClass.diconnectClient();
        return "SUCCESS";
    }

}
