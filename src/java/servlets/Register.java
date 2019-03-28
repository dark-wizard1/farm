 
package servlets;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;

@MultipartConfig
public class Register extends HttpServlet {

   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
    String email=request.getParameter("email");
    String name=request.getParameter("name");
    String phone=request.getParameter("phone");
    String gender=request.getParameter("gender");
    String d=request.getParameter("dob");
    java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
    java.util.Date dt=sdf.parse(d);
    java.sql.Date dob=new java.sql.Date(dt.getTime());
    String state=request.getParameter("state");
    String city=request.getParameter("city");
    String area=request.getParameter("area");
    String pass=request.getParameter("password");
     
String cpass=request.getParameter("cpass");
    Part p=request.getPart("photo");
    java.io.InputStream is;
    if(p!=null){
        is = p.getInputStream();
    }else{
        is=null;
    }
   if(pass.equals(cpass)){
       
    ServletContext application=getServletContext();
    db.DbConnect db=(db.DbConnect)application.getAttribute("DBCon");
    if(db==null){
        db=new db.DbConnect(); 
        application.setAttribute("DBCon", db);
    }
    
    String s=db.insertUser(email,pass,name,phone,gender,dob,state,city,area,is);
    HttpSession session=request.getSession();
    
    if(s.equalsIgnoreCase("Done")){
        HashMap h=new HashMap();
        h.put("name",name);
        h.put("email",email);
        h.put("phone",phone);
        h.put("dob",d);
        h.put("gender",gender);
        h.put("state",state);
        h.put("city",city);
        h.put("area",area);
        session.setAttribute("UserDetails",h);
        response.sendRedirect("Profile.jsp");
    }else if(s.equalsIgnoreCase("Error")){
        session.setAttribute("msg","Registration Failed.");
        response.sendRedirect("index.jsp");
    }else if(s.equalsIgnoreCase("Already")){
        session.setAttribute("msg","EmailID Already Registered.");
        response.sendRedirect("index.jsp");
    }else if(s.equalsIgnoreCase("Exception")){
        session.setAttribute("msg","Registration Failed.(Exception Occured)");
        response.sendRedirect("index.jsp");
    }
    
   }else{
	 
        response.sendRedirect("notmatch.html");
}    
   }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
