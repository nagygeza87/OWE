/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Géza
 */
public class FtpClientConnectionHelperClass {

    FTPClient client = null;

    public void connectClient(String username, String password, String url) throws SocketException, IOException{
        client = new FTPClient();
        client.connect(url);
        client.login(username, password);

    }

    public void diconnectClient() throws IOException{
        if (client.isConnected()==true){
            client.disconnect();
        } else {
            if (client!= null){
                client = null;
            }
        }
    }


}
