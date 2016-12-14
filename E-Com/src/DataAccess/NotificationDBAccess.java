package DataAccess;

import java.util.*;

/**
 * 
 */
public class NotificationDBAccess {

    /**
     * Default constructor
     */
    public NotificationDBAccess() {
    }

    /**
     * 
     */
    public Connection connect;


    /**
     * @param notif 
     * @param student 
     * @return
     */
    public boolean addNotification(Notification notif, Student student) {
        // TODO implement here
        return false;
    }

    /**
     * @param studID 
     * @return
     */
    public Set<Notification> getNotifications(int studID) {
        // TODO implement here
        return null;
    }

    /**
     * @param studID 
     * @param nID 
     * @return
     */
    public boolean removeNotification(int studID, int nID) {
        // TODO implement here
        return false;
    }

}