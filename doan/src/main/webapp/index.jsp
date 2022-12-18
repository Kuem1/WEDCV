<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/index.css" >
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  

   <div class="container" >
   <div class="login" >
   <h1>Login</h1>
    <form action="LoginServlet" method="post">
     <% String err = "";
 if(request.getAttribute("err") != null)
 {
	 err = (String)request.getAttribute("err");
	 
 }
 if(err.equals("1"))
	 { %>
		 <p> Không thành công </p>
	<%  }%>
    <div class="txt" >
      <input type="text"  name="username" required >
      <span></span>
       <label>Username</label>
     </div>
     <div class="txt" >
     <input type="password"  name="password" required>
     <span></span>
      <label>Password</label>
     </div>
     <input type="submit" value="Login" >
     <div class="signup_link" >
     <a href="signup.jsp" >Signup</a>
     </div>
     <div class="forgot" >
     <p>Quên Mật Khẩu ?</p>
     <a href="ForgotPassword.jsp" >Forgot password </a>
     </div>
     
    </form>
    </div>
   </div>
</body>
</html>