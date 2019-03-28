 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
    </head>
    <body>
        <% 
String m=(String)session.getAttribute("msg");
if(m!=null){
        %>
 <b><%=m%></b>
 <%session.setAttribute("msg",null);
 }
%>
<h1>Entered registered email -id to get password onto it</h1>
<form action="ForgotPassProcess.jsp" method="POST">
    EMAIL ID:<input type="email" name="email" required/><br><br>
    <input type="submit" value="send">
     <input type="reset" value="clear">
</form>
    </body>
</html>
