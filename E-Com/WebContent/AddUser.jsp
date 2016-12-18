<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
  <title>Add User</title>
      <link rel="stylesheet" href="/E-Com/add_user_style.css">

</head>
<body>
  <div class="form">
    <form action="addUserServlet" method="post">
      <input type="text" placeholder="Username" name="un"/>
      <input type="password" placeholder="Password" name= "pass"/>
      <input type="text" placeholder="name" name="name"/>
      <input type="text" placeholder="userID" name= "ID"/>
      <input type="text" placeholder="usertypr" name= "type"/>
       <input type="submit" value="Sign In">
    </form>
  </div>
</div>

</body>
</html>