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

 <div class="container">
   <div class="ui" >
   <div class="body">
   <form action="SigninServlet" method="post">
    <div class="txt" >
      <input type="text"  name="username" required >
      <span></span>
       <label>username</label>
     </div>
     <div class="txt" >
      <input type="text"  name="password" required >
      <span></span>
       <label>password</label>
     </div><div class="txt" >
      <input type="text"  name="email" required >
      <span></span>
       <label>email</label>
     </div>


     <input type="submit" >
   
   </form>
   </div>
   
   </div>
 </div>
 
 
 
</body>
</html>