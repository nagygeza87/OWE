/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package page.splitter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.net.ftp.FTPClient;
import user.UserQueue;

/**
 *
 * @author geza
 */
public class PageSplitter {

    private static FTPClient client;
    


    public static String getBodyContent(String filename, Integer userid){
        try {
            client = UserQueue.getUser(userid).getClient();
            String vissza = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(client.retrieveFileStream(filename)));
            String temp = "";
            boolean append = false;
            while ((temp = br.readLine()) != null){
                if (temp.startsWith("<body")){
                    append = true;
                    continue;
                } else if (temp.contains("</body>")){
                    append = false;
                    break;
                }

                if (append == true){
                    vissza += temp + "\n";
                }
            }
            br.close();
            return vissza;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getHeaderOfFile(InputStream is){
        String vissza = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        return vissza;
    }

}
