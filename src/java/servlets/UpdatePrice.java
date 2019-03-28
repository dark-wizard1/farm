 
package servlets;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;

@MultipartConfig
public class UpdatePrice extends HttpServlet {

   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
    String w=request.getParameter("wheat");
    String r=request.getParameter("rice");
    String p=request.getParameter("potato");
    String t=request.getParameter("tomato");
    String a=request.getParameter("wheat");   
    ServletContext application=getServletContext();
    db.DbConnect db=(db.DbConnect)application.getAttribute("DBCon");
    if(db==null){
        db=new db.DbConnect(); 
        application.setAttribute("DBCon", db);
    }
    
    String s=db.UpdatePrice(w,r,p,t,a);
    HttpSession session=request.getSession();
    
    if(s.equalsIgnoreCase("Done")){
        HashMap h=new HashMap();
        h.put("wheat",w);
        h.put("rice",r);
        h.put("potato",p);
        h.put("tomato",t);
        
        session.setAttribute("UpdateDetails",h);
        response.sendRedirect("AdminProfile.jsp");
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
    
     }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
