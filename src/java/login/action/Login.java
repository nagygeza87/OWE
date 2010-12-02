/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package login.action;

import com.opensymphony.xwork2.ActionContext;
import connection.FtpClientConnectionHelperClass;
import user.UserQueue;
import user.model.User;

/**
 *
 * @author Géza
 */

public class Login{

    String username;
    String password;
    String address;


    public String login() throws Exception {
        User u = new User(username, password, address);
        UserQueue.addUser(u);
        if (FtpClientConnectionHelperClass.connectClient(u.getId()) == true){ 
            ActionContext.getContext().getSession().put("user", u.getId());
            return "SUCCESS";
        } else {
            return "CONNECTIONERROR";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}