/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import org.apache.commons.net.ftp.FTPClient;
import user.UserQueue;
import user.model.User;

/**
 *
 * @author Géza
 */
public class FtpClientConnectionHelperClass {

    public static boolean connectClient(Integer userid) {
        try {
            User u = UserQueue.getUser(userid);
            u.setClient(new FTPClient());
            u.getClient().connect(u.getAddress());
            if (u.getClient().login(u.getUsername(), u.getPassword()) == true) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static void disconnectClient(Integer id) {
        try {
            User u = UserQueue.getUser(id);
            if (u.getClient().isConnected() == true) {
                u.getClient().disconnect();
                u.setClient(null);
            } else {
                if (u.getClient() != null) {
                    u.setClient(null);
                }
            }
            UserQueue.removeUser(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static FTPClient getClient(Integer id) {
        return UserQueue.getUser(id).getClient();
    }
}