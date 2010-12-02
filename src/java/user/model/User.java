/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package user.model;

import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author geza
 */
public class User {

    private String username;
    private String password;
    private String address;
    private Integer id;
    FTPClient client;



    public User(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public User() {
    }

    public FTPClient getClient() {
        return client;
    }

    public void setClient(FTPClient client) {
        this.client = client;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
