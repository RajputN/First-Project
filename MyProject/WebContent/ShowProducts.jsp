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

 <form method="post">
  <h1>All Products</h1> 
  <table>
       <thead>
     <tr>
           <th> Id</th>
           <th> Name</th>
           <th> URL </th>
           <th> Category Id</th>  
             <th>  Description </th>
             <th>  Price</th>         
             <th>Quantity</th>
     </tr>       
       
       </thead>
       
                              
       <tbody>
       <c:forEach  items="${value}"    var="images" >
              <tr>
                    <td>${images.id} </td> 
                    <td>${images.name} </td>
                  <td><img src="${images.url}" ></img> </td>
                  <td>${images.categoryid} </td> 
                  <td>${images.description} </td> 
                  <td>${images.price} </td> 
                 <td>${images.quantity} </td> 
                 <td>
                  <input type= "submit"  formaction="DeleteProduct?pid=${images.id}"   value="Delete">
                  <input type= "submit" formaction="UpdateProduct.jsp?id=${images.id}" value="Update">
                  </td>
             </tr>   <br>
 
       </c:forEach>
       </tbody>
  
  </table>

  
  
  
  
  </form>

</body>
</html>