<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Faculty</title>
</head>
<body>

<h1> Add New Faculty</h1>

<form name=addForm action=addFaculty method=get> 

   <label>
   		UGA ID:
   </label>
   <input type=text name=id value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		First Name:
   </label>
   <input type=text name=firstName value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Last Name: 
   </label>
   <input type=text name=lastName value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Title: 
   </label>
   <input type=text name=title value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Teaching Load: 
   </label>
   <input type=text name=load value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		UGA My ID: 
   </label>
   <input type=text name=myID value = "" /> 
   <br /> 
   <br /> 
   
   <input type=submit name=submit value = "Add Faculty" /> 

</form>


</body>
</html>