  function addUser()
         {
            document.getElementById("content").innerHTML = "";
             var longEntry = 
                '<form id=\"form-style-1\" action="addUserServlet" method="post">\
                <button href="index.html" class="close"> X </button>\
                <label>Name <input type="text" placeholder="Name"/></label>\
                <label>Username <input type="text" placeholder="Username"/></label>\
                <label>Password <input type="text" placeholder="Password"/></label>\
                <label>Type\
                <select name="type">\
                <option value="admin">Admin</option>\
                <option value="student">Student</option>\
                <option value="teacher">Teacher</option></select></label>\
                <label><input type="submit"/></label>\
                </form>';
            document.getElementById("content").innerHTML = longEntry;
            
         }
  function removeUser()
         {
            document.getElementById("content").innerHTML = "";
             var longEntry = 
                '<form id=\"form-style-1" <style="height:30px;">\
                <button href="index.html" class="close"> X </button>\
                <label>Username <input type="text" placeholder="Username"/></label>\
                <label><input type="submit"/></label>\
                </form>';
            document.getElementById("content").innerHTML = longEntry;
            
         }
  function addCourse()
         {
            document.getElementById("content").innerHTML = "";
             var longEntry = 
                '<form id=\"form-style-1\">\
                <button href="index.html" class="close"> X </button>\
                <label>Course Name <input type="text" placeholder="Name"/></label>\
                <label>Course ID <input type="text" placeholder="Username"/></label>\
                <label>Credit Hours<input type="text" placeholder="Password"/></label>\
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
function removeCourse()
         {
            document.getElementById("content").innerHTML = "";
             var longEntry = 
                '<form id=\"form-style-1\">\
                <button href="index.html" class="close"> X </button>\
                <label>Course\
                <select name="course">\
                <option value="algorithms">Algorithms</option>\
                <option value="SWE-2">SWE-2</option>\
                <option value="Concept Of PLs">Concepts</option></select></label>\
                <label><input type="submit"/></label>\
                </form>';
            document.getElementById("content").innerHTML = longEntry;
            
         }