<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import ="model.Faculty" %>
    <% Faculty faculty = (Faculty) request.getAttribute("faculty"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Faculty</title>
</head>
<body>
<h1>Update Faculty</h1>
<form name = updateFaculty action = UpdateFaculty method = post>
<label>ID Number:</label>
<input type ="text" name = "ID" value = "<%faculty.getId(); %>" readonly/>
<br>
<label>First Name:</label>
<input type ="text" name = "firstName" value = "<%faculty.getFirstName(); %>"/>
<br>
<label>Last Name:</label>
<input type ="text" name = "lastName" value = "<%faculty.getLastName(); %>" />
<br>
<label>Title:</label>
<input type ="text" name = "title" value = "<%faculty.getTitle(); %>" />
<br>
<label>Teaching Load:</label>
<input type ="text" name = "loan" value = "<%faculty.getLoad(); %>" />
<br>
<label>UGA MyID:</label>
<input type ="text" name = "myID" value = "<%faculty.getMyID(); %>" />
<br>
<input type="submit" name="submit" value="Submit" />
</form>
</body>
</html>