package Controller;

import java.util.*;

import DataAccess.NotificationDBAccess;
import DataAccess.UserDBAccess;

/**
 * 
 */
public class OfferManagemet {

    /**
     * Default constructor
     */
    public OfferManagemet() {
    }


    /**
     * @param offer
     */
    public void addOffer(Offer offer) {
        // TODO implement here
    	UserDBAccess u = new UserDBAccess();
    	NotificationDBAccess n = new NotificationDBAccess();
    	Student[] s = u.selectStudents(offer.GPA, offer.department);
    	for (Student st : s) {
    		n.addNotification(offer.description, st.studID);
    	}
    	
    }

}