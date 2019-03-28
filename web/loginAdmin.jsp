<%@page import="java.util.HashMap"%>
<%@page import="java.sql.ResultSet"%>
 
<%
    try{
    String e=request.getParameter("email");  
    String p=request.getParameter("pass"); 
    db.DbConnect db=(db.DbConnect)application.getAttribute("DBCon");
    if(db==null){
        db=new db.DbConnect(); 
        application.setAttribute("DBCon", db);
    }
   
    ResultSet rs=db.AdminLogin(e,p);
    if(rs!=null){
        
        HashMap h=new HashMap();
        h.put("name",rs.getString(3));
        h.put("email",rs.getString(1));
        h.put("dob",rs.getString(6));
        h.put("phone",rs.getString(4));
        //h.put("phone",rs.getString(3));
      //  h.put("gender",rs.getString(4));
      //  h.put("state",rs.getString(6));
       // h.put("city",rs.getString(7));
       // h.put("area",rs.getString(8));
        session.setAttribute("UserDetails",h);
        response.sendRedirect("AdminProfile.jsp"); 
    }else{
        session.setAttribute("msg","Invalid Login!");
        response.sendRedirect("index.jsp");
    }
    } catch(Exception ex)
            {
                ex.printStackTrace();
            }
%>