/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mediator;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Noah
 */
public class Mediator {    
    public Boolean UsernameIsAvailable(String Username)
    {
        Boolean Available = false;
        
        try {
            List<String> Usernames = GetAllUsernamesInRoom();
            if (Usernames.contains(Username)) {
                Available = true;
            }
        }
        catch (Exception e) {
            throw e;
        }
        return Available;
    }
    
    public List<String> GetAllUsernamesInRoom() 
    {
        List<String> Usernames = new ArrayList();
        Usernames.add("nxsanders");
        Usernames.add("chmthompson");
        return Usernames;
    }
}
