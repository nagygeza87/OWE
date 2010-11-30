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
import java.util.Arrays;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
/**
 *
 * @author Géza
 */

public class ListDirectoryContents {

    List<FTPFile> elemek;
    String directory;
    

    public String list(){
        try {
            FTPClient cl = FtpClientConnectionHelperClass.getClient();
            cl.enterLocalPassiveMode();
            elemek = Arrays.asList(cl.listFiles());
            return "SUCCESS";
        } catch (Exception e) {
            e.printStackTrace();
            return "ERROR";
        }
    }

    public String listDirectory(){
        try{
            FTPClient cl = FtpClientConnectionHelperClass.getClient();
            cl.enterLocalPassiveMode();
            cl.cwd(directory);
            elemek = Arrays.asList(cl.listFiles());
            return "SUCCESS";
        } catch (Exception e){
            e.printStackTrace();
            return "ERROR";
        }
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public List<FTPFile> getElemek() {
        return elemek;
    }

    public void setElemek(List<FTPFile> elemek) {
        this.elemek = elemek;
    }


}