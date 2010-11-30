/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package list.action;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import list.model.FtpFileListItem;
import connection.FtpClientConnectionHelperClass;
/**
 *
 * @author Géza
 */

public class ListDirectoryContents {

    List<FtpFileListItem> elemek;
    String directory;
    

    public String list(){
        try {
            FtpClientConnectionHelperClass.getClient().listFiles();
            return "SUCCESS";
        } catch (Exception e) {
            e.printStackTrace();
            return "ERROR";
        }
    }

}