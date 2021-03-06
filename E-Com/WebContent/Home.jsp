<%@page import="Controller.WorkYear"%>
<%@page import="jdk.nashorn.internal.parser.JSONParser"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javafx.scene.web.WebView"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Welcome Home</title>
<%@page import="Controller.User"%>
<%@page import="Controller.Course"%>
<%@page import="Controller.WorkYear"%>
<%@page import="DataAccess.CourseDBAccess"%>
<link rel="stylesheet" href="/E-Com/style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="http://fonts.googleapis.com/css?family=Tangerine">
<script src="/E-Com/myScript.js"></script>
<script type="text/javascript">
	function viewBox() {
		var element = document.getElementById('box');
		var element1 = document.getElementById('content');
		element.style.display = "block";
		element1.style.display = "None";
	}
	function viewDash() {
		var element = document.getElementById('box');
		var element1 = document.getElementById('content');
		element.style.display = "None";
		element1.style.display = "block";
	}
	
</script>
</head>
<body>
	<div id="wrapper">
		<div id="banner">
			<button href="#"></button>
		</div>
		<div id="menuLeft">
			<ul>
				<div id="avatar">
					<%
						User user = (User) request.getAttribute("user");
						session.setAttribute("user", user);
					%>
					<%
						Course[] crs = CourseDBAccess.selectCourses(user.userID);
					%>
					<label>Hello, <%
						out.print(user.name);
					%>
					</label>
					<%
						if (user.usertype.equals("Student")) {
					%>
					<div id="dropdown">
						<button class="dropbtn">
							<span class="fa fa-bell"></span>
						</button>


						<div id="dropdown-content">
							<a href="#"> <%
 	out.print(crs.length);
 %> <span class="fa fa-close"></span>
							</a> <a href="#"> <%
 	out.print(user.userID);
 %> <span class="fa fa-close"></span>
							</a> <a href="#">Notification 3 <span class="fa fa-close"></span></a>
							<a href="#">Notification 4 <span class="fa fa-close"></span></a>
							<a href="#">Notification 5 <span class="fa fa-close"></span></a>
						</div>
					</div>
				</div>
				<li onclick="viewDash()"><span class="fa fa-home" id="button">
						Dashboard</span></li>

				<li><span class="fa fa-file"> Courses</span>
					<ul>

						<li><a href="#" onclick=""><span class="fa fa-plus"
								id="button"> Register Course</span></a></li>
						<li><a href="#" onclick=""><span class="fa fa-trash"
								id="button"> Drop Course</span></a></li>
						<li><a href="#" onclick="viewBox()"><span
								class="fa fa-eye" id="button"> View Courses</span></a></li>

					</ul></li>
				<li><span class="fa fa-graduation-cap"> Grades</span>
					<ul>
						<li><a href="#" onclick=""><span class="fa fa-eye"
								id="button"> View Grades</span></a></li>


					</ul>
				<li onclick="signout()"><span class="fa fa-sign-out"
					id="button"> Sign out</span></li>
			</ul>
			</li>
		</div>
		<div id="box">
				<div id="scrollMenu">
				<%
					for (int i = 0; i < crs.length; i++) {
				%>
				<div id="block">
					<label><%out.print(crs[i].courseName);%></label>
					<div id="block-content">
						<p>Credit Hours:<%out.print(crs[i].Hour);%></p>
						</br>
						<p>Grades: </p>
						<%WorkYear[] wk = crs[i].grade; %>
						<%for(int j = 0; j < wk.length; j++){ %>
						</br>
							<p><%out.print(wk[j].type + " : " + wk[j].score);%></p>
							</br>
							<p><%out.print("Description :" +  wk[j].description);%></p>
							<%} %>
					</div>
				</div>
				<% } %>
				</div>
			</div>
		<div id="content">
			<div id="form-style-1">
				<header>
				<h2>Progress</h2>
				</header>
				<label id="home">GPA : 2.85</label> <label id="home">Hours :
					18 Hours</label> <label id="home">Courses : 8 Courses</label>
			</div>

		</div>
		<%
			} else if (user.usertype.equals("Admin")) {
		%>

	</div>
	<li onclick="home()"><span class="fa fa-home" id="button">
			Dashboard</span></li>

	<li><span class="fa fa-users"> Users</span>
		<ul>
			<li><a href="#" onclick="addUser()"><span class="fa fa-plus"
					id="button"> Add User</span></a></li>
			<li><a href="#" onclick="removeUser()"><span
					class="fa fa-trash" id="button"> Remove User</span></a></li>
			<li><a href="#" onclick="editUser()"><span class="fa fa-pencil"
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
	<li onclick="signout()"><span class="fa fa-sign-out" id="button">
			Sign out</span></li>
	</ul>

	</div>

	<div id="content"></div>
	<%
		} else if (user.usertype.equals("Teacher")) {
	%>


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
	<li onclick="signout()"><span class="fa fa-sign-out" id="button">
			Sign out</span></li>
	</ul>
	</div>

	<div id="content"></div>

	<%
		}
	%>
	</div>
</body>
</html>