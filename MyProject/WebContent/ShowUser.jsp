<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form> <h1>All Users</h1> 
  <table>
       <thead>
     <tr>
           <th> Uname </th>
           <th> Password </th>
           <th> Contact </th>
           <th> Email</th>  
             
     </tr>       
       
       </thead>
       
       <tbody>
       <c:forEach  items="${val }"    var="UserField" >
              <tr>
                    <td>${UserField.name} </td> 
                    <td>${UserField.password} </td>
                  <td>${UserField.email} </td>
                  <td>${UserField.contact} </td> 
             </tr>
             
       </c:forEach>
       </tbody>
  
  </table>

  
  
  
  
  </form>
</body>
</html>