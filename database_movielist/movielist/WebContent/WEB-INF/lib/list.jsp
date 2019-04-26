<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"  import="java.util.ArrayList" import="uqu.jeelab.model.movieslist"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movies List</title>
</head>
<body>
	<% 
	ArrayList movieslist = (ArrayList) request.getAttribute("movieslist"); 
	out.println("<table border><tr><th>Name</th><th>Date</th><th>Time</th><th>Ticket</th></tr>"); 
	for (Object ex : movieslist){ 
 		 movieslist e = (movieslist) ex; 
		String Name = e.getName();  
		String Date = e.getDate(); 
		String Time = e.getTime(); 
		out.println("<tr><td>" + Name + "</td><td>" + Date + 
				"</td></tr>"+ Time + "</td></tr>"); 
		} 
	out.println("</table>"); %>
</body>
</html>