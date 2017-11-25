<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Course</title>
</head>
<body>

<h1> Add New Course </h1>

<form name=addForm action=addCourse method=get> 

   <label>
   		Name: 
   </label>
   <input type=text name=name value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Title: 
   </label>
   <input type=text name=title value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Credits: 
   </label>
   <input type=text name=credits value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Division: 
   </label>
   <input type=text name=division value = "" /> 
   <br /> 
   <br /> 

	<input type=submit name=submit value = "Add Course" /> 
	
</form>

</body>
</html>