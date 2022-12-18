<%@page import="org.eclipse.jdt.internal.compiler.apt.model.TypeParameterElementImpl"%>
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
       <a href="logout" class="logout" >LOGOUT</a>
       </div>
    </div>
   <div class="body">
    <h1>Cv: ${cv.idcv}</h1>
    <h1>name: ${cv.name}</h1>
    <h1>email: ${cv.email}</h1>
    <h1>phone: ${cv.phone}</h1>
    <h1>hobby: ${cv.hobby}</h1>
    <a href="GetKinhNghiemByIdServlet?idcv=${cv.idcv}" > Kinh nghiệm </a>
   </div>
   
   </div>
 </div>
 
 
 
</body>
</html>