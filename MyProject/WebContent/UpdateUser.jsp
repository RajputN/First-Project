<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form class="form"  method="get"  action="UpdateServlet" autocomplete="off" >
        <h3> Update Details</h3>    
           Name:<input type="text"  name="username"   readonly="readonly" value="<% String k=(String)session.getAttribute("ky");
               out.println(k);%>"/> <br/>
             
           Email : <input type="text" name="email" /> <br/>
           Password:<input type= "password"  name="pass" /> <br/>
           Contact :<input type="number" name="con" /> <br/>

          <input type="submit"   value="Update" />  
    </form>    
</body>
</html>