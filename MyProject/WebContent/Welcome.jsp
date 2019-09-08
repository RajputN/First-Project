<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
  <h1>WELCOME USER!!!</h1> 
 <%
 
        String nm=(String)session.getAttribute("ky");
          out.println( "Welcome "+  nm);
 %>
 

 
 
 
 <a href=UpdateUser.jsp>Click for Update</a><br/>
 <form action="Delete" method="post">
  <button>Remove Account</button>
</form>
 
</body>
</html>