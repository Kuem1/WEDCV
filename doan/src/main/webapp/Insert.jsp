<%@page import="org.eclipse.jdt.internal.compiler.apt.model.TypeParameterElementImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Insert.css" >
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String name = (String)session.getAttribute("name"); 
   int idu = (Integer)request.getAttribute("id");
   String id = (String)request.getParameter("idu");
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
   <form action="InsertCvServlet" method="get">
    <div class="txt" >
      <input type="text"  name="name" required >
      <span></span>
       <label>name</label>
     </div>
     <div class="txt" >
      <input type="text"  name="email" required >
      <span></span>
       <label>email</label>
     </div>
     <div class="txt" >
      <input type="text"  name="phone" required >
      <span></span>
       <label>phone</label>
     </div>
     <div class="txt" >
      <input type="text"  name="hobby" required >
      <span></span>
       <label>hobby</label>
     </div>
     <div class="txt" >
      <input type="text"  name="idu" required value="<%= id%>" readonly="readonly" >
      <span></span>
       <label>idu</label>
     </div>
     <input type="submit" >
   
   </form>
   </div>
   
   </div>
 </div>
 
 
 
</body>
</html>