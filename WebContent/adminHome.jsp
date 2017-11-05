<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="CSS/homestyles.css">
<title>Admin Home</title>
</head>
<body>
<div class="container">
  <div class="header">
  	<img src="IMG/ChemLogo.png">
  	<div class="headerContent"><a href="accountManagement.jsp">Manage Account</a></div>
  </div>
  <div class="content">
    <div class="smallTableContainer">
      <a href="CSAServlet">
        <div class="smallTable1" id="hoverEvent">
          <div class="smallTableContent">
            CSA
          </div>
        </div>
      </a>
      <a href="CourseServlet">
        <div class="smallTable2" id="hoverEvent">
          <div class="smallTableContent">
            Courses
          </div>
        </div>
      </a>
      <a href="FacultyServlet">
        <div class="smallTable3" id="hoverEvent">
          <div class="smallTableContent">
            Faculty
          </div>
        </div>
      </a>
    </div>
  </div>
</div>
</body>
</html>