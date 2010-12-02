/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package list.action;

import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Arrays;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import user.UserQueue;
/**
 *
 * @author Géza
 */

public class ListDirectoryContents {

    List<FTPFile> elemek;
    String directory;
    

    public String list(){
        try {
            Integer userid = (Integer)ActionContext.getContext().getSession().get("user");
            FTPClient cl = UserQueue.getUser(userid).getClient();
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
            Integer userid = (Integer)ActionContext.getContext().getSession().get("user");
            FTPClient cl = UserQueue.getUser(userid).getClient();
            cl.enterLocalPassiveMode();
            cl.cwd(directory);
            elemek = Arrays.asList(cl.listFiles());
            return "SUCCESS";
        } catch (Exception e){
            e.printStackTrace();
            return "ERROR";
        }
    }

    public String upDirectory(){
        try{
            Integer userid = (Integer)ActionContext.getContext().getSession().get("user");
            FTPClient cl = UserQueue.getUser(userid).getClient();
            cl.changeToParentDirectory();
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