package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

    HashMap hm=(HashMap)session.getAttribute("userDetails");
    if(hm!=null){
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html  data-wf-page=\"595e3241f7d06e4c3e688452\" data-wf-site=\"595e3241f7d06e4c3e688453\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\"/>\r\n");
      out.write("\t<title>Farm-Assistant</title>\r\n");
      out.write("\t<meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"/>\r\n");
      out.write("\r\n");
      out.write("\t<link href=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/css/visualfarms.webflow.40c6955b1.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\t <link rel=\"stylesheet\" type= \"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\r\n");
      out.write("   <link rel=\"stylesheet\" type= \"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/datepicker.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"css/custom.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" type= \"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"css/datepicker.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"css/custom.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("         \r\n");
      out.write("     <style>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(".abc img {\r\n");
      out.write("  float: left;\r\n");
      out.write("  margin: 0 10px 0 -25px;\r\n");
      out.write("  height: 80px;\r\n");
      out.write("  width: 80px;\r\n");
      out.write("  border-radius: 10%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("  <style> ");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("body {\r\n");
      out.write("    font-family: \"Lato\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 0;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    background-color: #111;\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write("    transition: 0.5s;\r\n");
      out.write("    padding-top: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav a {\r\n");
      out.write("    padding: 8px 8px 8px 32px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 25px;\r\n");
      out.write("    color: #818181;\r\n");
      out.write("    display: block;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav a:hover {\r\n");
      out.write("    color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav .closebtn {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    right: 25px;\r\n");
      out.write("    font-size: 36px;\r\n");
      out.write("    margin-left: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#main {\r\n");
      out.write("    transition: margin-left .5s;\r\n");
      out.write("    padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-height: 450px) {\r\n");
      out.write("  .sidenav {padding-top: 15px;}\r\n");
      out.write("  .sidenav a {font-size: 18px;}\r\n");
      out.write("}\r\n");
      out.write("ul li{text-color:white;}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write(" <title>Farm-Assistant</title>\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" type= \"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"css/datepicker.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"css/custom.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  \t<div data-collapse=\"medium\" data-animation=\"default\" data-duration=\"400\" class=\"navbar w-nav\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"navct\"><a href=\"/\" class=\"visual-brand w-nav-brand\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/595e3afd81db0547055c7839_vfarms-Icon.png\" class=\"plant-icon\"/>\r\n");
      out.write("\t\t\t<div class=\"logo-text-holder\">\r\n");
      out.write("\t\t\t\t<div class=\"visual-farms\">Farm-Assistant</div>\r\n");
      out.write("\t\t\t\t<div class=\"logo-kicker\">One stop solution for farmers</div>\r\n");
      out.write("\t\t\t</div></a>\r\n");
      out.write("\t\t\t<nav role=\"navigation\" class=\"nav-menu w-nav-menu\"> \r\n");
      out.write("\t\t\t\t<class=\"nav-link w-nav-link\"><b><a href=\"index.jsp\">Home |</a><a href=\"fertilizer.html\">Fertilizers |</a><a href=\"govtpolicy.html\">Govt. Policies |</a> <a href=\"marketprice.html\">Market-Price |</a><a href=\"contactus.html\"> \r\n");
      out.write("                            Contact</a><div class=\"abc\" style=\"width:22%; margin-left:600px\">\r\n");
      out.write("                                <div class=\"dropdown\">\r\n");
      out.write("  <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"text-color:white;width:auto;\">");
      out.print(hm.get("name"));
      out.write("</button>\r\n");
      out.write("  <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("    <a href='logout.jsp'>Logout</a>\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("                                 \r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                                <img src=\"img/login.jpg\" alt=\"Person\" width=\"96\" height=\"96\" style=\"margin-left:-100px;margin-top: -40px\"></div>\r\n");
      out.write("\t  \r\n");
      out.write("</nav>\r\n");
      out.write(" \r\n");
      out.write("\t\t\t\t<div class=\"menu-button w-nav-button\"><div class=\"w-icon-nav-menu\"></div></div></div></div>\r\n");
      out.write("                  ");
      out.write("\r\n");
      out.write("                                <div id=\"mySidenav\" class=\"sidenav\" style=\"margin-top:10%;\">\r\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("                                       <!-----------------------modal container your rides------->\r\n");
      out.write("  <ul type=\"none\" >\r\n");
      out.write("      <li>\r\n");
      out.write("           <img src=\"img/login.jpg\" alt=\"Person\" width=\"96\" height=\"96\" style=\"margin-left:40px;margin-top: -40px\">\r\n");
      out.write("      </li><br><br>\r\n");
      out.write("  <li style=\"text-color:white;\">\r\n");
      out.write("  Email:<b>");
      out.print(hm.get("name"));
      out.write("</b><br>\r\n");
      out.write("\r\n");
      out.write("  </li><br>\r\n");
      out.write("  \r\n");
      out.write("  <li style=\"text-color:white;\">\r\n");
      out.write("   Phone:<b>");
      out.print(hm.get("phone"));
      out.write("</b><br>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  </li><br>\r\n");
      out.write("  \r\n");
      out.write("<li style=\"text-color:white;\">\r\n");
      out.write(" DOB:<b>");
      out.print(hm.get("dob"));
      out.write("</b>\t\r\n");
      out.write("   \r\n");
      out.write("</li>\r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write(" </ul>  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\" >&#9776; </span>  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("                                                       <!--------cab selection----->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t   \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function openNav() {\r\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"250px\";\r\n");
      out.write("    document.getElementById(\"main\").style.marginLeft = \"250px\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closeNav() {\r\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"0\";\r\n");
      out.write("    document.getElementById(\"main\").style.marginLeft= \"0\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("                                 <center>Hello Farmer !!!</center>\r\n");
      out.write(" <center> <h2 style=\"margin-left:30px;\">Welcome To Farm-Assistant</h2>\r\n");
      out.write("     \r\n");
      out.write("  No. Of Times You Visited: <b></b> <hr>\r\n");
      out.write(" </center> \r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write(" ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
