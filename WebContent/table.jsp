<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="CSS/tablestyles.css">

<title>Table View</title>
<link href="CSS/tableexport.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="header">
		<img src="IMG/ChemLogo.png">
  		<div class="headerContent"><a href="accountManagement.jsp">Manage Account</a></div>
	</div>
	<div class="content">
		<div class="tableContent">
			<%= (String) request.getAttribute("table") %>			
		</div>		
	</div>
</div>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script>
$(document).ready(function() {
    $('#table').DataTable( {
        "pagingType": "simple"
    } );
} );
</script>
<script src="JS/FileSaver.min.js"></script>
<script src="JS/xlsx.core.min.js"></script>
<script src="JS/tableexport.js"></script>
<script>
$("#table").tableExport({formats: ["xlsx","xls", "csv", "txt"], ignoreCols: [document.getElementById('table').rows[0].cells.length-2,document.getElementById('table').rows[0].cells.length-1],    });
</script>
</body>
</html>