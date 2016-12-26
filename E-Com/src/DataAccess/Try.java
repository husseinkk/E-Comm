package DataAccess;

import Controller.Course;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseDBAccess db = new CourseDBAccess();
		Course[] courses = db.selectCourses(1);
		for (Course c : courses) {
			System.out.println(c.getCourseName() +" " + c.getDept() + " " + c.getHours());
		}
	}

}
