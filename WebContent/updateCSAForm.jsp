<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="model.CSA" %>
    <% CSA csa = (CSA) request.getAttribute("csa"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Course Section Assignments</title>
</head>
<body>
<h1>Update Course Section Assignments</h1>
<form name = updateCSA action = UpdateCSA method = post>
<label>Year:</label>
<input type ="text" name = "year" value = "<%csa.getYear(); %>" readonly/>
<br>
<label>Term:</label>
<input type ="text" name = "term" value = "<%csa.getTerm(); %>"readonly/>
<br>
<label>Call Number:</label>
<input type ="text" name = "callNumber" value = "<%csa.getCallNumber(); %>" />
<br>
<label>Period:</label>
<input type ="text" name = "period" value = "<%csa.getPeriod(); %>" readonly/>
<br>
<label>Start Time:</label>
<input type ="text" name = "startTime" value = "<%csa.getStartTime(); %>" />
<br>
<label>End Time:</label>
<input type ="text" name = "endTime" value = "<%csa.getEndTime(); %>" />
<br>
<label>Days:</label>
<input type ="text" name = "days" value = "<%csa.getDays(); %>" />
<br>
<label>Faculty UGA ID:</label>
<input type ="text" name = "FacultyID" value = "<%csa.getFacultyID(); %>"readonly />
<br>
<label>Course Name:</label>
<input type ="text" name = "name" value = "<%csa.getName(); %>"readonly />
<br>
<input type="submit" name="submit" value="Submit" />
</form>
</body>
</html>