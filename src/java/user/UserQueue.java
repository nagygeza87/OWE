/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.HashMap;
import user.model.User;

/**
 *
 * @author geza
 */
public class UserQueue {

    private static HashMap<Integer, User> felhasznalok = new HashMap<Integer, User>();
    private static Integer id = 0;

    public static Integer addUser(User u) {
        try {
            u.setId(id);
            felhasznalok.put(id++, u);
            return id-1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean removeUser(Integer id) {
        try {
            felhasznalok.remove(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public static User getUser(Integer id){
        return felhasznalok.get(id);
    }

    
}
