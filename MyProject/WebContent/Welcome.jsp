<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
  <h1>WELCOME USER  Page!!!</h1> 
                 Welcome ${ky} 
                 
    
 
  
<form action="LogoutServlet" >
 <input type="submit"  value="Logout">
</form> 
 
 <br/><a href=UpdateUser.jsp>Click for Update</a><br/>
 <br><form action="Delete" method="post">
  <br><button>Remove Account</button>
</form>
 
</body>
</html>