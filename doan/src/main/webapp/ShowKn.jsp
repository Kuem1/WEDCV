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
<% String name = (String)session.getAttribute("name"); 
   int idu = (Integer)request.getAttribute("id");
%>
 <div class="container">
   <div class="ui" >
    <div class="head" >
       <h1>Hello <%= name %></h1>
       <div class="heada" >
       <a href="logout" class="logout" >LOGOUT</a>
       </div>
    </div>
   <div class="body">
   <c:forEach items="${Listkn}" var="x" >
    <h1>Tên Dự Án Đã Làm: ${x.nameda}</h1>
    <h1>Kỹ Thuật Làm Dự Án: ${x.kythuat}</h1>
    <h1>Mô Tả Dự Án: ${x.mota}</h1>
    <a href="GetKinhNghiemByIdKn?idkn=${x.idkn}" >Update</a>
    <a href="DeleteCvServlet?idcv=${cv.idcv}&idu=${cv.idu}" >delete</a>
    </c:forEach>
   </div>
   
   </div>
 </div>
 
 
 
</body>
</html>