<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/search.css" >
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <div class="container">
   <div class="ui" >
    <div class="head" >
       <h1>Hello ${sessionScope.user.username}</h1>
       <div class="heada" >
       <a href="ChangePassword.jsp" >Change Password</a>
       <a href="logout" class="logout" >LOGOUT</a>
       </div>
    </div>
   <div class="body">
   <c:forEach items="${Listu}" var="x">
   <a href="LoadCvUserServlet?idu=${x.idu}" >Xem Cv của ${x.username} </a> <br>
   
    </c:forEach>
   </div>
   
   </div>
 </div>
 
 
 
</body>
</html>