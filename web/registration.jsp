<%@page import="java.sql.SQLIntegrityConstraintViolationException"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.IOException"%>  
<%@page import="java.util.HashMap"%>
<%@page import="javax.servlet.http.Part"%>
<%@page import="javax.servlet.annotation.MultipartConfig"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
   request.setCharacterEncoding("UTF-8");
String e=request.getParameter("email");
String n=request.getParameter("name");
String p=request.getParameter("phone");
String d=request.getParameter("dob");
String pass=request.getParameter("pass");
String cpass=request.getParameter("cpass");
/*Part f=request.getPart("photo");
InputStream fs=f.getInputStream();*/
if(pass.equals(cpass)){
try{
   
	java.sql.Statement st=(java.sql.Statement)application.getAttribute("stmt");
        
	st.executeUpdate("insert into user_info values('"+e+"','"+n+"','"+p+"','"+pass+"','"+d+"')");
       
	java.util.HashMap userDetails=new java.util.HashMap();
        
	userDetails.put("email", e);
	userDetails.put("name", n);
	userDetails.put("phone", p);
	userDetails.put("dob", d);
        userDetails.put("pass",pass);
        //userDetails.put("photo",f);
	
	session.setAttribute("userDetails",userDetails);
        
     
	response.sendRedirect("Profile.jsp");
        
}catch(java.sql.SQLIntegrityConstraintViolationException ex){
	response.sendRedirect("already.html");
}catch(Exception ex){
	ex.printStackTrace();
	response.sendRedirect("index.html");
}
}else{
	response.sendRedirect("notmatch.html");
}
%>