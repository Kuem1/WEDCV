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
   <div class="head" >
       <h1>Hello ${sessionScope.forgot.username}</h1>
       <div class="heada" >
       <a href="logout" class="logout" >LOGOUT</a>
       </div>
    </div>
   <div class="body">
   <form action="ForgotChange" method="post">
   <div class="txt" >
      <input type="text"  name="idu"  value="${sessionScope.forgot.idu}" readonly="readonly" >
      <span></span>
       <label>idu</label>
     </div>
     <div class="txt" >
      <input type="text"  name="newpassword" required >
      <span></span>
       <label>New Password</label>
     </div>


     <input type="submit" >
   
   </form>
   </div>
   
   </div>
 </div>
 
 
 
</body>
</html>