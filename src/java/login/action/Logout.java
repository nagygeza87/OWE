/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package login.action;

import com.opensymphony.xwork2.ActionContext;
import connection.FtpClientConnectionHelperClass;

/**
 *
 * @author Geza
 */
public class Logout {

    public String logout(){
        Integer userid = (Integer)ActionContext.getContext().getSession().get("user");
        FtpClientConnectionHelperClass.disconnectClient(userid);
        return "SUCCESS";
    }

}
