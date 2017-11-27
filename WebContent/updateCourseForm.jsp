<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="model.Course" %>
    <% Course course = (Course) request.getAttribute("course"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Course</title>
</head>
<body>
<h1>Update Course</h1>
<form name = updateCourse action = UpdateCourse method = post>
<label>Name:</label>
<input type ="text" name = "name" value = "<%course.getName(); %>" readonly/>
<br>
<label>Title:</label>
<input type ="text" name = "title" value = "<%course.getTitle(); %>"/>
<br>
<label>Credits:</label>
<input type ="text" name = "credits" value = "<%course.getCredits(); %>" />
<br>
<label>Division:</label>
<input type ="text" name = "division" value = "<%course.getDivision(); %>" />
<br>
<input type="submit" name="submit" value="Submit" />
</form>

</body>
</html>