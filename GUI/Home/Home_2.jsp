
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<html>

<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="sign_in_style.css">
<link rel="stylesheet" href="style_2.css">
<title>Home</title>
<%@page import="Controller.User" %>
</head>
<body>
	<div class="menu">
		<div class="avatar"
			style="background-color: #39679f; height: 100px; width: 235px; padding: 0; margin-left: 0; margin: 0; margin-top: 0; border-bottom: 10px solid #fecbf9; color: #fecbf9;">
			<header
				style="position: relative; margin: 0; margin-left: -15px; padding: 20px; font-size: 12px; font-family: sans-serif;">
				<%User user = (User)request.getAttribute("user");%>
				<h2>Welcome,<%out.print(user.name); %> </h2>
				<a><span class="notify fa fa-bell-o">
						<ul class="notifications">
							<li><a href="#">A</a></li>
							<li><a href="#">b</a></li>
							<li><a href="#">C</a></li>
							<li><a href="#">D</a></li>
							<li><a href="#">E</a></li>
							<li><a href="#">F</a></li>
						</ul>
				</span></a>
			</header>
		</div>
		<ul>
			<li><a href="index.html"><span class="fa fa-tachometer"></span></a>Dashboard</li>
			<li><a href="#"><span class="fa fa-users"></span></a>Users
				<ul>
					<li><a href="users.html"><span class="fa fa-plus"></span></a>Add
						User</li>
					<li><a href="users.html"><span class="fa fa-trash"></span></a>Remove
						User</li>
					<li><a href="users.html"><span class="fa fa-pencil"></span></a>Edit
						User</li>
				</ul></li>
			<li><a href=""><span class="fa fa-file"></span></a>Courses
				<ul>
					<li><a href="courses.html"><span class="fa fa-eye"></span></a>View
						Courses</li>
					<li><a href="courses.html"><span class="fa fa-plus"></span></a>Add
						Course</li>
					<li><a href="courses.html"><span class="fa fa-trash"></span></a>Remove
						Course</li>
					<li><a href="courses.html"><span class="fa fa-link"></span></a>Assign
						Course</li>
				</ul></li>
			<li><a href=""><span class="fa fa-graduation-cap"></span></a>Grades
				<ul>
					<li><a href="grades.html"><span class="fa fa-plus"></span></a>Add
						Grade</li>
					<li><a href="grades.html"><span class="fa fa-pencil"></span></a>Edit
						Grades</li>
				</ul></li>

		</ul>

	</div>
	<main class="content">
	<form class="gpa" type=>
		<header>
			<h2>GPA</h2>
		</header>
	</form>
	</main>
</body>

</html>