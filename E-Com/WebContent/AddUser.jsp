<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>

<!DOCTYPE html>
<html>
<head>
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"/>
  <link href="addUser_Style.css" rel="stylesheet"/>
  <title>Home</title>
</head>
<body>
  <div class="menu">
    <div class="avatar" style="background-color: #39679f; height: 100px; width: 235px; padding: 0; margin-left: 0; margin: 0; margin-top: 0; border-bottom: 10px solid #fecbf9; color: #fecbf9;">
      <header style="position: relative; margin: 0; margin-left: -15px; padding: 20px; font-size: 12px; font-family: sans-serif;">
        <h2>Welcome,</h2><a><span class="notify fa fa-bell-o"></span></a>
      </header>
    </div>
    <ul>
      <li>
        <a href="index.html"><span class="fa fa-tachometer"></span></a>Dashboard</li>
      <li>
        <a href="#"><span class="fa fa-users"></span></a>Users
        <ul>
          <li> <a href="users.html"><span class="fa fa-plus"></span></a>Add User</li>
          <li> <a href="users.html"><span class="fa fa-trash"></span></a>Remove User</li>
          <li> <a href="users.html"><span class="fa fa-pencil"></span></a>Edit User</li>
        </ul>
      </li>
      <li>
        <a href=""><span class="fa fa-file"></span></a>Courses
        <ul>
          <li> <a href="courses.html"><span class="fa fa-eye"></span></a>View Courses</li>
          <li> <a href="courses.html"><span class="fa fa-plus"></span></a>Add Course</li>
          <li> <a href="courses.html"><span class="fa fa-trash"></span></a>Remove Course</li>
          <li> <a href="courses.html"><span class="fa fa-link"></span></a>Assign Course</li>
        </ul>
      </li>
      <li>
        <a href=""><span class="fa fa-graduation-cap"></span></a>Grades
        <ul>
          <li> <a href="grades.html"><span class="fa fa-plus"></span></a>Add Grade</li>
          <li> <a href="grades.html"><span class="fa fa-pencil"></span></a>Edit Grades</li>
        </ul>
      </li>
    </ul>
  </div>
    <form class="design2" action="addUserServlet" method="post">
        <span class="fa fa-close close"></span>
      	<label style="color: #39679f;">Name <input placeholder="Name" type="text" name="name"/></label> 
        <label style="color: #39679f;">Username <input placeholder="username" type="text" name="un"/></label> 
        <label style="color: #39679f;">Password <input placeholder="password" type="text" name="pass"/></label> 
        <label style="color: #39679f; position:relative;">Type <select name="type">
        <option value="Admin"> Admin </option>
        <option value="Student"> Student </option>
        <option value="Teacher"> Teacher </option>
        <option value="OfferManager"> Offer Manager </option>
      </select></label> 
        <button type="submit" value = "Add User"><span class="fa fa-arrow-right next"></span></button>
    </form>

</body>
</html>