<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Welcome Home</title>
<%@page import="Controller.User"%>
<%@page import="DataAccess.CourseDBAccess"%>
<link rel="stylesheet" href="/E-Com/style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="http://fonts.googleapis.com/css?family=Tangerine">
<script src="/E-Com/myScript.js"></script>

</head>
<body>
	<div id="wrapper">
		<div id="banner">
			<button href="#"></button>
		</div>
		<div id="menuLeft">
			<ul>
				<div id="avatar">
					<%User user = (User)request.getAttribute("user");
                	session.setAttribute("user", user);%>
					<label>Hello, <%out.print(user.name); %> <%if(user.usertype.equals("Student")){ %>
						<div id="dropdown">
							<button class="dropbtn">
								<span class="fa fa-bell"></span>
							</button>
							<div id="dropdown-content">
								<a href="#">Notification 1 <span class="fa fa-close"></span></a>
								<a href="#">Notification 2 <span class="fa fa-close"></span></a>
								<a href="#">Notification 3 <span class="fa fa-close"></span></a>
								<a href="#">Notification 4 <span class="fa fa-close"></span></a>
								<a href="#">Notification 5 <span class="fa fa-close"></span></a>
							</div>
						</div>
				</div>
				<li onclick="home()"><span class="fa fa-home" id="button">
						Dashboard</span></li>

				<li><span class="fa fa-file"> Courses</span>
					<ul>

						<li><a href="#" onclick=""><span class="fa fa-plus"
								id="button"> Register Course</span></a></li>
						<li><a href="#" onclick=""><span class="fa fa-trash"
								id="button"> Drop Course</span></a></li>
						<li><a href="#" onclick='viewCoursesStudent(<% CourseDBAccess.selectCourses(user.userID); %>)'><span class="fa fa-trash"
								id="button"> View Courses</span></a></li>
					</ul></li>
				<li><span class="fa fa-graduation-cap"> Grades</span>
					<ul>
						<li><a href="#" onclick=""><span class="fa fa-eye"
								id="button"> View Grades</span></a></li>

					</ul></li>

			</ul>

		</div>

		<div id="content">
			<div id="form-style-1">
				<header>
				<h2>Progress</h2>
				</header>
				<label id="home">GPA : 2.68</label> <label id="home">Hours :
					18 Hours</label> <label id="home">Courses : 8 Courses</label>
			</div>

		</div>
		<%}else if(user.usertype.equals("Admin")){ %>


	</div>
	<li onclick="home()"><span class="fa fa-home" id="button">
			Dashboard</span></li>
	<li><span class="fa fa-users"> Users</span>
		<ul>
			<li><a href="#" onclick="addUser()"><span class="fa fa-plus"
					id="button"> Add User</span></a></li>
			<li><a href="#" onclick="removeUser()"><span
					class="fa fa-trash" id="button"> Remove User</span></a></li>
			<li><a href="#" onclick=""><span class="fa fa-pencil"
					id="button"> Edit User</span></a></li>
		</ul></li>
	<li><span class="fa fa-file"> Courses</span>
		<ul>
			<li><a href="#" onclick=""><span class="fa fa-eye"
					id="button"> View Courses</span></a></li>
			<li><a href="#" onclick="addCourse()"><span
					class="fa fa-plus" id="button"> Add Course</span></a></li>
			<li><a href="#" onclick="removeCourse()"><span
					class="fa fa-trash" id="button"> Remove Course</span></a></li>
			<li><a href="#" onclick="assignCourse()"><span
					class="fa fa-link" id="button"> Assign Course</span></a></li>
		</ul></li>
	<li><span class="fa fa-graduation-cap"> Grades</span>
		<ul>
			<li><a href="#" onclick=""><span class="fa fa-eye"
					id="button"> View Grades</span></a></li>
			<li><a href="#" onclick="addGrade()"><span
					class="fa fa-plus" id="button"> Add Grade</span></a></li>
			<li><a href="#" onclick="editGrade()"><span
					class="fa fa-pencil" id="button"> Edit Grade</span></a></li>
		</ul></li>
	<li><span class="fa fa-handshake-o"> Offers</span>
		<ul>
			<li><a href="#" onclick="addOffer()"><span
					class="fa fa-plus" id="button"> Add Offer</span></a></li>
		</ul></li>
	</ul>

	</div>

	<div id="content">
			</div>
	<%}else if(user.usertype.equals("Teacher")){ %>


	</div>
	<li onclick="home()"><span class="fa fa-home" id="button">
			Dashboard</span></li>
	<li><span class="fa fa-file"> Courses</span>
		<ul>
			<li><a href="#" onclick=""><span class="fa fa-eye"
					id="button"> View Courses</span></a></li>
		</ul></li>
	<li><span class="fa fa-graduation-cap"> Grades</span>
		<ul>
			<li><a href="#" onclick=""><span class="fa fa-eye"
					id="button"> View Grades</span></a></li>
			<li><a href="#" onclick="addGrade()"><span
					class="fa fa-plus" id="button"> Add Grade</span></a></li>
			<li><a href="#" onclick="editGrade()"><span
					class="fa fa-pencil" id="button"> Edit Grade</span></a></li>
		</ul></li>
	</ul>

	</div>

	<div id="content">
	</div>
	<%} %> 

	</div>

</body>
</html>