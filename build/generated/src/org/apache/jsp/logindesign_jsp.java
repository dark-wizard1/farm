package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logindesign_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<style>\r\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write("input[type=text], input[type=password] {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 12px 20px;\r\n");
      out.write("    margin: 8px 0;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Set a style for all buttons */\r\n");
      out.write("button {\r\n");
      out.write("    background-color: #4CAF50;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 14px 20px;\r\n");
      out.write("    margin: 8px 0;\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    width: 20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Extra styles for the cancel button */\r\n");
      out.write(".cancelbtn, .signupbtn {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 15%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("    padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span.psw {\r\n");
      out.write("    float: right;\r\n");
      out.write("    padding-top: 16px;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The Modal (background) */\r\n");
      out.write(".modal {\r\n");
      out.write("    display: none; /* Hidden by default */\r\n");
      out.write("    position: fixed; /* Stay in place */\r\n");
      out.write("    z-index: 1; /* Sit on top */\r\n");
      out.write("    left: 0;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    width: 100%; /* Full width */\r\n");
      out.write("    height: 100%; /* Full height */\r\n");
      out.write("    overflow: auto; /* Enable scroll if needed */\r\n");
      out.write("    background-color: rgb(0,0,0); /* Fallback color */\r\n");
      out.write("    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\r\n");
      out.write("    padding-top: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Modal Content/Box */\r\n");
      out.write(".modal-content {\r\n");
      out.write("    background-color: #fefefe;\r\n");
      out.write("    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */\r\n");
      out.write("    border: 1px solid #888;\r\n");
      out.write("    width: 40%; /* Could be more or less, depending on screen size */\r\n");
      out.write("    height:80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The Close Button (x) */\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("/* Add Zoom Animation */\r\n");
      out.write(".animate {\r\n");
      out.write("    -webkit-animation: animatezoom 0.6s;\r\n");
      out.write("    animation: animatezoom 0.6s\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes animatezoom {\r\n");
      out.write("    from {-webkit-transform: scale(0)} \r\n");
      out.write("    to {-webkit-transform: scale(1)}\r\n");
      out.write("}\r\n");
      out.write("    \r\n");
      out.write("@keyframes animatezoom {\r\n");
      out.write("    from {transform: scale(0)} \r\n");
      out.write("    to {transform: scale(1)}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\r\n");
      out.write("@media screen and (max-width: 300px) {\r\n");
      out.write("    span.psw {\r\n");
      out.write("       display: block;\r\n");
      out.write("       float: none;\r\n");
      out.write("    }\r\n");
      out.write("    .cancelbtn {\r\n");
      out.write("       width: 40%;\r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<center><h2>Login Form</h2></center>\r\n");
      out.write("    <form class=\"modal-content animate\" action=\"login.jsp\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <label for=\"uname\"><b>Username</b></label>\r\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Email-Id\" name=\"email\" required>\r\n");
      out.write("\r\n");
      out.write("      <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("      <input type=\"password\" placeholder=\"Enter Password\" name=\"pass\" required>\r\n");
      out.write("        \r\n");
      out.write("      <center><button type=\"submit\" class=\"signupbtn\">Login</button>  <button type=\"reset\" class=\"cancelbtn\">Reset</button></center>\r\n");
      out.write("        <pre>Forgot <a href=\"forgotpassworddesign.jsp\">password?</a>                                 New User <a href=\"registerdesign.jsp\">Register Here</a></pre>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\" style=\"background-color:#f1f1f1\">\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("  </form>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
