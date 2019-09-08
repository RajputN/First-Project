<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                <form action="AddProduct"  method="get">  <br/>
                    Product Id<input type= "text"  name="pid">  <br/>
                   Product name<input type="text" name="pname">  <br/>
                   URL<input type="file" name="url"> <br/>
                   Category<input type="text" name="cate">  <br/>
                   Description<input type="text" name="des"> <br/>
                   Price<input type="text" name="price"> <br/>
                   Quantity<input type="text" name="quant"> <br/>
                 <br/> <br/>
                   <input type="submit"  value="AddProduct">
                
                </form>
</body>
</html>