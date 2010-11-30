/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Géza
 */
public class FtpClientConnectionHelperClass {

    private static FTPClient client = null;

    public static boolean connectClient(String username, String password, String url) {
        try {
            client = new FTPClient();
            client.connect(url);
            if (client.login(username, password) == true) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static void diconnectClient() {
        try {
            if (client.isConnected() == true) {
                client.disconnect();
            } else {
                if (client != null) {
                    client = null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static FTPClient getClient() {
        return client;
    }
}