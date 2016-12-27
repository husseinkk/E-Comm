function addUser() {
    document.getElementById("content").innerHTML = "";
    var longEntry =
      '<form id=\"form-style-1\" action="addUserServlet" method="post">\
                <button href="Home.jsp" class="close"> X </button>\
                <label>Name <input type="text" id="z"placeholder="Name" name="name"/></label>\
                <label>Username <input type="text" id ="x"placeholder="Username" name="un"/></label>\
                <label>Password <input type="text" id="y"placeholder="Password" name="pass"/></label>\
                <label>Type\
                <select name="type" id="c">\
                <option value="Admin">Admin</option>\
                <option value="Student">Student</option>\
                <option value="Teacher">Teacher</option></select></label>\
                <label><input style="margin:0;margin-top: -8px; margin-left:70px;"type="button" value="Submit" onclick="path(document.getElementById(\'c\').value,document.getElementById(\'z\').value,document.getElementById(\'x\').value, document.getElementById(\'y\').value)"/></label>\
                </form>';
    document.getElementById("content").innerHTML = longEntry;
  }

  function removeUser() {
    document.getElementById("content").innerHTML = "";
    var longEntry =
      '<form id=\"form-style-1" <style="height:30px;" action="removeUserServlet" method="post">\
                <button href="#" class="close"> X </button>\
                <label>Username <input type="text" placeholder="Username" name="name"/></label>\
                <label><input type="submit"/></label>\
                </form>';
    document.getElementById("content").innerHTML = longEntry;
  }

  function path(a,z,x,y) {
    a.toString();
    z.toString();
    x.toString();
    y.toString();
    if (a == "Student") {
      document.getElementById("content").innerHTML = "";
      var longEntry =
        '  	  <form id=\"form-style-1" method="post" action="addUserServlet">\
                <button href="#" class="close"> X </button>\
    	  		<label>Name<input name="name" value=' + z + ' readonly="readonly"></input></label>\
    	  		<label>UserName<input name="username" value=' + x + ' readonly="readonly"></input></label>\
    	  		<label>Password<input name="password" value=' + y + ' readonly="readonly"></input></label>\
    	  		<label>UserType<input name="usertype" value=' + a + ' readonly="readonly"></input></label>\
                <label>Student ID <input type="text" placeholder="Student ID" name="studID"/></label>\
                <label>Department\
                <select name="typeDept">\
                <option value="DS">DS</option>\
                <option value="CS">CS</option>\
                <option value="IT">IT</option></select></label>\
                <label><input href="#" type="submit"/></label>\
                </form>';
      document.getElementById("content").innerHTML = longEntry;
    } else if (a == "Teacher") {
      document.getElementById("content").innerHTML = "";
      var longEntry =
        '<form id=\"form-style-1" action="addUserServlet" method="post">\
                <button href="#" class="close"> X </button>\
    	  		<label>Name<input name="name" value=' + z + ' readonly="readonly"></input></label>\
    	  		<label>UserName<input name="username" value=' + x + ' readonly="readonly"></input></label>\
    	  		<label>Password<input name="password" value=' + y + ' readonly="readonly"></input></label>\
    	  		<label>UserType<input name="usertype" value=' + a + ' readonly="readonly"></input></label>\
                <label>Department\
                <select name="typeDept">\
                <option value="DS">DS</option>\
                <option value="CS">CS</option>\
                <option value="IT">IT</option></select></label>\
                <label><input type="submit"/></label>\
                </form>';
      document.getElementById("content").innerHTML = longEntry;
    } else if (a == "Admin") {
        document.getElementById("content").innerHTML = "";
        var longEntry =
          '<form id=\"form-style-1" action="addUserServlet" method="post">\
            <button href="#" class="close"> X </button>\
      	  	<label>Name<input name="name" value=' + z + ' readonly="readonly"></input></label>\
      	  	<label>UserName<input name="username" value=' + x + ' readonly="readonly"></input></label>\
      	 	<label>Password<input name="password" value=' + y + ' readonly="readonly"></input></label>\
      	  	<label>UserType<input name="usertype" value=' + a + ' readonly="readonly"></input></label>\
            <label><input type="submit"/></label>\
            </form>';
        document.getElementById("content").innerHTML = longEntry;
      }
  }

  function addCourse() {
    document.getElementById("content").innerHTML = "";
    var longEntry =
      '<form id=\"form-style-1\" action="addCourseServlet" method="post">\
                <button href="#" class="close"> X </button>\
                <label>Course Name <input type="text" placeholder="Name" name="Cname" /></label>\
                <label>Credit Hours<input type="text" placeholder="Hours" name="Chours"/></label>\
                <label>Department\
                <select name="Cdesc">\
                <option value="CS">CS</option>\
                <option value="IT">IT</option>\
                <option value="DS">IT</option></select></label>\
                <label>Description <textarea style="resize:none;" name="Cdept"></textarea></label>\
                <label><input type="submit"/></label>\
                </form>';
    document.getElementById("content").innerHTML = longEntry;
  }

  function removeCourse() {
    document.getElementById("content").innerHTML = "";
    var longEntry =
      '<form id=\"form-style-1\">\
                <button href="#" class="close"> X </button>\
                <label>Course\
                <select name="course">\
                <option value="algorithms">Algorithms</option>\
                <option value="SWE-2">SWE-2</option>\
                <option value="Concept Of PLs">Concepts</option></select></label>\
                <label><input type="submit"/></label>\
                </form>';
    document.getElementById("content").innerHTML = longEntry;
  }
 function addOffer() {
    document.getElementById("content").innerHTML = "";
    var longEntry =
      '<form id=\"form-style-1\">\
                <button href="index.html" class="close"> X </button>\
                <label>Offer Name <input type="text" placeholder="Name"/></label>\
                <label>GPA <input type="text" placeholder="GPA"/></label>\
                <label>Department\
                <select name="type">\
                <option value="CS">CS</option>\
                <option value="IT">IT</option>\
                <option value="DS">IT</option></select></label>\
                <label>Description <textarea style="resize:none;"></textarea></label>\
                <label><input type="submit"/></label>\
                </form>';
    document.getElementById("content").innerHTML = longEntry;
  }
 function addGrade() {
    document.getElementById("content").innerHTML = "";
    var longEntry =
      '<form id=\"form-style-1\">\
                <button href="index.html" class="close"> X </button>\
                <label>Student ID <input type="text" placeholder="Student ID"/></label>\
                <label>Course ID <input type="text" placeholder="Course ID"/></label>\
                <label>Type\
                <select name="type">\
                <option value="attendance">Attendance</option>\
                <option value="bonus">Bonus</option>\
                <option value="assignment">Assignment</option>\
                <option value="midterm">Mid-Term</option>\
                <option value="final">Final</option></select></label>\
                <label>Value <input type="text" placeholder="Value"/></label>\
                <label><input type="submit"/></label>\
                </form>';
    document.getElementById("content").innerHTML = longEntry;
  }
function editGrade() {
    document.getElementById("content").innerHTML = "";
    var longEntry =
      '<form id=\"form-style-1\">\
                <button href="index.html" class="close"> X </button>\
                <label>Student ID <input type="text" placeholder="Student ID"/></label>\
                <label>Course ID <input type="text" placeholder="Course ID"/></label>\
                <label>Type\
                <select name="type">\
                <option value="attendance">Attendance</option>\
                <option value="bonus">Bonus</option>\
                <option value="assignment">Assignment</option>\
                <option value="midterm">Mid-Term</option>\
                <option value="final">Final</option></select></label>\
                <label>New Value <input type="text" placeholder="Value"/></label>\
                <label><input type="submit"/></label>\
                </form>';
    document.getElementById("content").innerHTML = longEntry;
  }
function home()
{
    document.getElementById("content").innerHTML = "";
    var longEntry ='<div id="form-style-1">\
            <header>\
                <h2>Progress</h2>\
                <label id="home">GPA : 2.68</label>\
                <label id="home">Hours : 18 Hours</label>\
                <label id="home">Courses : 8 Courses</label>\
                </header>\
            </div>\
            <div id="form-style-1">\
            <header>\
                <h2>Offers</h2>\
                </header>\
                <form id="scrollMenu">\
                    <label>Microsoft internship <span href="#"class="fa fa-external-link"></span></label>\
                    <label>MSSTC High Board Requirements <span href="#"class="fa fa-external-link"></span></label>\
                    <label>COMET High Board Requirements <span href="#"class="fa fa-external-link"></span></label>\
                    <label>Microsoft internship <span href="#"class="fa fa-external-link"></span></label>\
                    <label>MSSTC High Board Requirements <span href="#"class="fa fa-external-link"></span></label>\
                    <label>COMET High Board Requirements <span href="#"class="fa fa-external-link"></span></label>\
                    <label>Microsoft internship <span href="#"class="fa fa-external-link"></span></label>\
                    <label>MSSTC High Board Requirements <span href="#"class="fa fa-external-link"></span></label>\
                    <label>COMET High Board Requirements <span href="#"class="fa fa-external-link"></span></label>\
                </form>\
            </div>';
    document.getElementById("content").innerHTML = longEntry;
}
function assignCourse()
{
    document.getElementById("content").innerHTML = "";
    var longEntry =
        '<form id=\"form-style-1\">\
                <button href="index.html" class="close"> X </button>\
                <label>Course\
                <select name="type">\
                <option value="algorithms">Algorithms</option>\
                <option value="SWE-2">SWE-2</option>\
                <option value="math-1">Math-1</option>\
                <option value="math-2">Math-2</option>\
                <option value="pl1">PL1</option></select></label>\
                <label><input href="#" type="submit" onclick="doctor()"/></label>\
                </form>';
    document.getElementById("content").innerHTML = longEntry;
}
function doctor()
{
    document.getElementById("content").innerHTML = "";
    var longEntry =
        '<form id=\"form-style-1\">\
                <button href="index.html" class="close"> X </button>\
                <label>Doctor\
                <select name="type">\
                <option value="111">Sherif Khattab</option>\
                <option value="124">Emad Nabil</option>\
                <option value="142">Hussein Khaled</option>\
                <option value="114">Mohamed Abo Treka</option>\
                <option value="126">Abdallah Ahmed</option></select></label>\
                <label><input type="submit"/></label>\
                </form>';
    document.getElementById("content").innerHTML = longEntry;
    
}
function viewGrades()
{
    document.getElementById("content").innerHTML = "";
    var longEntry =
        '<form id=\"form-style-1\">\
        <button href="index.html" class="close"> X </button>\
        <label>Course\
        <select name="type" id="c">\
        <option value="algorithms">Algorithms</option>\
        <option value="SWE-2">SWE-2</option>\
        <option value="math-2">Math-2</option>\
        <option value="networks-1">Networks-1</option></select></label>\
        <label><input href="#" onclick="course(document.getElementById(\'c\').value" type="submit"/></label>\
        </form>';
    document.getElementById("content").innerHTML = longEntry;
}
function course(c)
{
    document.getElementById("content").innerHTML = "";
    var longEntry;
    c.toString();
    switch(c)
    {
        case "algorithms":
            var longEntry =
        '<form id=\"form-style-1\">\
        <button href="index.html" class="close"> X </button>\
        <label>Course\
        <select name="type" id=""c>\
        <option value="algorithms">Algorithms</option>\
        <option value="SWE-2">SWE-2</option>\
        <option value="math-2">Math-2</option>\
        <option value="networks-1">Networks-1</option></select></label>\
        <label><input href="#" onclick="course(document.getElementById(\'c\').value" type="submit"/></label>\
        </form>';
            break;
            
    }
}

function viewCoursesStudent(x)
{
	alert(x);
    document.getElementById("content").innerHTML = "";
    var longEntry = 
    	'<form><div id="form-style-1"><div id="scrollMenu">';
    	/*<div id="block">\
    	<label>Algorithms</label>\
    	<div id="block-content">\
    	<p>CreditHours : 4</p>\
    	</div>\
    	</div>\
    	<div id="block">\
    	<label>Algorithms</label>\
    	<div id="block-content">\
    	<p>CreditHours4</p>\
    	</div>\
    	</div>\
    	<div id="block">\
    	<label>Algorithms</label>\
    	<div id="block-content">\
    	<p>CreditHours4</p>\
    	</div>\
    	</div>\
    	<div id="block">\
    	<label>Algorithms</label>\
    	<div id="block-content">\
    	<p>CreditHours4</p>\
    	</div>\
    	</div>\
    	</div></form>'*/
    for(var i = 0 ; i < x.length ; i++) {
    	longEntry += '<div id="block">\
            <label>' + x[i].courseName + '</label>\
            <div id="block-content">\
            <p>CreditHours : '+ x[i].Hour +'</p>\
            </div>\
            </div>';
    }
    
    longEntry += '</div></form>';
    
    document.getElementById("content").innerHTML = longEntry;
}
