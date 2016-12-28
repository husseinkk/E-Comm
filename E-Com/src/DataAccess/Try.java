package DataAccess;

import java.sql.Date;

import Controller.Course;
import Controller.Grade;
import Controller.WorkYear;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeDBAccess db = new GradeDBAccess();
		WorkYear g = new WorkYear();
		g.description = "g";
		g.score = 8;
		g.type = "Task";
		db.addGrade(g, "Network", 1);
	}

}
