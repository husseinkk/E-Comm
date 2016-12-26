package Controller;

import java.util.*;

/**
 * 
 */
public class Teacher extends User {

    /**
     * Default constructor
     */
    public Teacher() {
    }

    public Teacher(String name, int rate) {
		// TODO Auto-generated constructor stub
    	this.name = name;
    	this.rate = rate;
	}

	/**
     * 
     */
    private Set<Course> courses;

    /**
     * 
     */
    private int rate;

    /**
     * 
     */
    public String dept;


}