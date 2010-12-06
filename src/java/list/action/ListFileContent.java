/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package list.action;

import com.opensymphony.xwork2.ActionContext;
import page.splitter.PageSplitter;

/**
 *
 * @author geza
 */

public class ListFileContent {

    private String content;
    private String filename;

    public String execute() throws Exception {
        Integer userid = (Integer) ActionContext.getContext().getSession().get("user");
        content = PageSplitter.getBodyContent(filename, userid);
        return "SUCCESS";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }




}