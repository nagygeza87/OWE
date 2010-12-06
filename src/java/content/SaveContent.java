/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package content;

import com.opensymphony.xwork2.ActionContext;
import org.apache.commons.net.ftp.FTPClient;
import user.UserQueue;

/**
 *
 * @author geza
 */

public class SaveContent {

    String bodycontent;
    String filename;

    public String execute() throws Exception {
        Integer userid = (Integer) ActionContext.getContext().getSession().get("user");
        FTPClient cl = UserQueue.getUser(userid).getClient();
        String header = "";
        cl.retrieveFileStream(filename);
        String content = "";
        String footer = "";
        return "SUCCESS";
    }

    public String getBodycontent() {
        return bodycontent;
    }

    public void setBodycontent(String bodycontent) {
        this.bodycontent = bodycontent;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }


}