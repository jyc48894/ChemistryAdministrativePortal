<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New CSA </title>
</head>
<body>
<h1> Add New CSA </h1>


<form name=addForm action=addCSA method=get> 

   <label>
   		Year: 
   </label>
   <input type=text name=year value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Term: 
   </label>
   <input type=text name=term value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		callNumber: 
   </label>
   <input type=text name=callNumber value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Period: 
   </label>
   <input type=text name=period value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Start Time: 
   </label>
   <input type=text name=startTime value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		End Time: 
   </label>
   <input type=text name=endTime value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Days:
   </label>
   <input type=text name=days value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Faculty ID: 
   </label>
   <input type=text name=facultyID value = "" /> 
   <br /> 
   <br /> 
   
   <label>
   		Name: 
   </label>
   <input type=text name=name value = "" /> 
   <br /> 
   <br /> 
   
   <input type=submit name=submit value = "Add CSA" /> 

</form>

</body>
</html>