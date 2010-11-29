/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package login.action;

/**
 *
 * @author Géza
 */

public class Login{

    String username;
    String password;
    String address;


    public String login() throws Exception {
        System.out.println(username+" "+password+" "+address);
        return "SUCCESS";
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