package Controller;

import java.util.*;

/**
 * 
 */
public class Course {
	
    /**
     * Default constructor
     */
    public Course() {
    }

    public Course(int id, String name, String description, int hour, String department, WorkYear[] grade, Teacher[] teachers) {
		// TODO Auto-generated constructor stub
    	this.ind = id;
    	this.courseName = name;
    	this.courseDescription = description;
    	this.Hour =hour;
    	this.setDept(department);
    	this.setGrade(grade);
    	this.doctors = teachers;
	}

	/**
     * 
     */
    public int Hour;
    public int ind;
    /**
     * 
     */
    public String courseName;

    /**
     * 
     */
    public String courseDescription;

    /**
     * 
     */
    private Course[] prerequisites;

    /**
     * 
     */
    private Teacher[] doctors;

    /**
     * 
     */
    private Teacher[] assistants;

    /**
     * 
     */
    private Student[] students;

    /**
     * 
     */
    private WorkYear[] grade;

    /**
     * 
     */
    private String dept;



    /**
     * @return
     */
    public String getCourseName() {
        // TODO implement here
        return courseName;
    }

    /**
     * @return
     */
    public String getCourseDescription() {
        // TODO implement here
    	return courseDescription;
    }

    /**
     * @return
     */
    public int getHours() {
        // TODO implement here
        return Hour;
    }

    /**
     * @return
     */
    public Teacher[] getDoctors() {
        // TODO implement here
        return doctors;
    }

    /**
     * @return
     */
    public Teacher[] getAssistant() {
        // TODO implement here
        return assistants;
    }

    /**
     * @return
     */
    public Student[] getStudents() {
        // TODO implement here
        return students;
    }

	public void setDoctors(Teacher[] doctors) {
		this.doctors = doctors;
	}

	public WorkYear[] getGrade() {
		return grade;
	}

	public void setGrade(WorkYear[] grade) {
		this.grade = grade;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}