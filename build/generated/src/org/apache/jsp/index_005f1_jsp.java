package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html  data-wf-page=\"595e3241f7d06e4c3e688452\" data-wf-site=\"595e3241f7d06e4c3e688453\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\"/>\n");
      out.write("\t<title>Farm-Assistant</title>\n");
      out.write("\t<meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"/>\n");
      out.write("\n");
      out.write("\t<link href=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/css/visualfarms.webflow.40c6955b1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t <link rel=\"stylesheet\" type= \"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/datepicker.css\">\n");
      out.write("\t <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"css/custom.css\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/webfont/1.4.7/webfont.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script type=\"text/javascript\">WebFont.load({  google: {    families: [\"Montserrat:100,100italic,200,200italic,300,300italic,400,400italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic\",\"Raleway:100,100italic,200,200italic,300,300italic,regular,italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic\",\"Federo:regular\"]  }});</script>\n");
      out.write("\t<script type=\"text/javascript\">!function(o,c){var n=c.documentElement,t=\" w-mod-\";n.className+=t+\"js\",(\"ontouchstart\"in o||o.DocumentTouch&&c instanceof DocumentTouch)&&(n.className+=t+\"touch\")}(window,document);</script>\n");
      out.write("\t<link href=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e401481db0547055c7afa_vfarms-Favicon-Small.jpg\" rel=\"shortcut icon\" type=\"image/x-icon\"/>\n");
      out.write("\t<link href=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e40186a453d04dbb32b9d_vfarms-Favicon.jpg\" rel=\"apple-touch-icon\"/><script type=\"text/javascript\">\n");
      out.write("\t\t(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)})(window,document,'script','https://www.google-analytics.com/analytics.js','ga');ga('create', 'UA-104862895-1', 'auto');ga('send', 'pageview');</script>\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("    input.input-box, textarea { background: white; color: black; }\n");
      out.write(".w-input::-webkit-input-placeholder { \n");
      out.write("    color:    #998675;\n");
      out.write("}\n");
      out.write(".w-input:-moz-placeholder { \n");
      out.write("    color:    #998675;\n");
      out.write("    opacity: 1;\n");
      out.write("}\n");
      out.write(".w-input::-moz-placeholder { \n");
      out.write("    color:    #998675;\n");
      out.write("    opacity: 1;\n");
      out.write("}\n");
      out.write(".w-input:-ms-input-placeholder {\n");
      out.write("    color:    #998675;\n");
      out.write("}\n");
      out.write("    input.black-text, textarea { color: black; }\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div data-collapse=\"medium\" data-animation=\"default\" data-duration=\"400\" class=\"navbar w-nav\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"navct\"><a href=\"/\" class=\"visual-brand w-nav-brand\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/595e3afd81db0547055c7839_vfarms-Icon.png\" class=\"plant-icon\"/>\n");
      out.write("\t\t\t<div class=\"logo-text-holder\">\n");
      out.write("\t\t\t\t<div class=\"visual-farms\">Farm-Assistant</div>\n");
      out.write("\t\t\t\t<div class=\"logo-kicker\">One stop solution for farmers</div>\n");
      out.write("\t\t\t</div></a>\n");
      out.write("\t\t\t<nav role=\"navigation\" class=\"nav-menu w-nav-menu\"> \n");
      out.write("\t\t\t\t<class=\"nav-link w-nav-link\"><b><a href=\"index.jsp\">Home |</a><a href=\"fertilizer.html\">Fertilizers |</a><a href=\"govtpolicy.html\">Govt. Policies |</a> <a href=\"marketprice.html\">Market-Price |</a><a href=\"contactus.html\"> Contact </a><a href=\"logindesign.jsp\"><button class=\"btn btn-danger\" style=\"width:auto;align:right;\">Login</button></a>\n");
      out.write("\t  <div id=\"id01\" class=\"modal\">\n");
      out.write("  \n");
      out.write("  <form class=\"modal-content animate\" action=\"/action_page.php\" >\n");
      out.write("    <div class=\"imgcontainer\">\n");
      out.write("      <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\";>&times;</span>\n");
      out.write("      <img src=\"img/login1.jpg\" style=\"width:100px;height:120px;margin-top:25px;\" alt=\"Avatar\" class=\"avatar\"><!--modal image-->\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write(" \n");
      out.write("\t\t\t\t<div class=\"menu-button w-nav-button\"><div class=\"w-icon-nav-menu\"></div></div></div></div>\n");
      out.write("\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t<div id=\"home\" class=\"home-hero\"><div data-delay=\"10000\" data-animation=\"cross\" data-autoplay=\"1\" data-duration=\"2000\" data-infinite=\"1\" class=\"hero-slider w-slider\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w-slider-mask\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w-slide\"><div data-poster-url=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-poster-00001.jpg\" data-video-urls=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-transcode.webm,https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-transcode.mp4\" data-autoplay=\"true\" data-loop=\"true\" data-wf-ignore=\"true\" class=\"background-video w-background-video w-background-video-atom\"><video autoplay=\"\" loop=\"\" style=\"background-image:url(&quot;https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-poster-00001.jpg&quot;)\" data-wf-ignore=\"true\"><source src=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-transcode.webm\" data-wf-ignore=\"true\"/><source src=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-transcode.mp4\" data-wf-ignore=\"true\"/></video>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"hh-ct w-container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 data-ix=\"text-build-in\" class=\"hh-title\">Our Audacious Goal: A Machine Learning system on every farm.</h1>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div data-ix=\"slidefade\" class=\"w-slide\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div data-poster-url=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-poster-00001.jpg\" data-video-urls=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-transcode.webm,https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-transcode.mp4\" data-autoplay=\"true\" data-loop=\"true\" data-wf-ignore=\"true\" class=\"background-video w-background-video w-background-video-atom\"><video autoplay=\"\" loop=\"\" style=\"background-image:url(&quot;https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-poster-00001.jpg&quot;)\" data-wf-ignore=\"true\"><source src=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-transcode.webm\" data-wf-ignore=\"true\"/><source src=\"https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-transcode.mp4\" data-wf-ignore=\"true\"/></video>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"hh-ct w-container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h1 data-ix=\"text-build-in\" class=\"hh-title\">Our systems know what a plant is doing every day of its life from planting to harvest.\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h1></div></div></div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"slider-arrows w-slider-arrow-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"w-icon-slider-left\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"slider-arrow w-slider-arrow-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"w-icon-slider-right\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"slide-nav-2 w-slider-nav w-round\"></div></div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"Machine-Learning\" class=\"section s-work\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"w-container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h1 class=\"section-heading white\">Latest technology to agriculture like ML, AI<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"div-block-2\"><div class=\"machine-item-div\"><div class=\"machine-icon-holder\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c3274ec09b00015626ed_Money.png\" class=\"machine-icon\"/></div><div class=\"machine-item-text\">Make<br/>Money</div></div><div class=\"machine-item-div\"><div class=\"machine-icon-holder\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c279b6ffd70001e478b7_Time.png\" class=\"machine-icon\"/></div><div class=\"machine-item-text\">Save<br/>Time</div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"machine-item-div\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"machine-icon-holder\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c36c456ddb0001a923c6_Reduce.png\" class=\"machine-icon\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"machine-item-text\">Reduce<br/>Risk</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"w-container\">\n");
      out.write("\t<div data-delay=\"6000\" data-animation=\"slide\" data-autoplay=\"1\" data-duration=\"700\" data-infinite=\"1\" class=\"work-slider w-slider\">\n");
      out.write("\t\t<div class=\"work-sliders-mask w-slider-mask\">\n");
      out.write("\t\t\t<div class=\"w-slide\">\n");
      out.write("\t\t\t\t<div class=\"work-slider-flex\">\n");
      out.write("\t\t\t\t\t<img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c1cd456ddb0001a922a7_Access.png\" class=\"scroller-icon\"/><div>1. Access the entire unbiased seed market<br>\n");
      out.write("<br>2. Monitor in-season real time crop stages<br><br>3. Capture timely alerts to potential pests or issues<br>\n");
      out.write("</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"w-slide\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-slider-flex\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c2370ac8ce0001199efe_Tools.png\" class=\"scroller-icon\"/><div>Use Farmer-designed tools</div></div></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"w-slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"work-slider-flex\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c259514b590001b93ec6_Monitor.png\" class=\"scroller-icon\"/><div>Monitor in-season real time crop stages</div></div></div><div class=\"w-slide\"><div class=\"work-slider-flex\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c2a2ba0b3e0001da0865_Production.png\" class=\"scroller-icon\"/><div>Simulate production options</div></div></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w-slide\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"work-slider-flex\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c2bf456ddb0001a92305_Alerts.png\" class=\"scroller-icon\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>Capture timely alerts to potential pests or issues</div></div></div><div class=\"w-slide\"><div class=\"work-slider-flex\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c2e10ac8ce0001199f36_Benchmark.png\" class=\"scroller-icon\"/><div>Benchmark production</div></div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"w-slide\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"work-slider-flex\"><img src=\"https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c38b4ec09b0001562718_Data.png\" class=\"scroller-icon\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>Harness Big Data &amp; IoT for actionable decisions</div></div></div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"work-slider-arrows w-slider-arrow-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"w-icon-slider-left\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"work-slider-arrows w-slider-arrow-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"w-icon-slider-right\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"slide-nav-3 w-slider-nav w-round\"></div></div></div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"Who-We-Are\" class=\"section\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h1 class=\"section-heading\">What is our main features?\n");
      out.write("                                                                                                                    \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"subheading\">We&#x27;re a one stop solution for your agricultural problem.<br>\n");
      out.write("\n");
      out.write("<section class=\"cities\">\n");
      out.write(" <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <img src=\"1.jpg\" >\n");
      out.write("                <h4>latest machines</h4>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <img src=\"C:\\Users\\RISHABH\\Desktop\\FINAL YEAR PROJECT\\project\\Gaurav Farming\\img\\2.jpg\">\n");
      out.write("                <h4>Fertilizers & seeds</h4>\n");
      out.write("                \n");
      out.write("         \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <img src=\"C:\\Users\\RISHABH\\Desktop\\FINAL YEAR PROJECT\\project\\Gaurav Farming\\img\\3.jpg\">\n");
      out.write("                <h4>Govt. Policies</h4>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("</section>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"Field-Trials\" class=\"section s-work\">\n");
      out.write("\t\t\t\t<div class=\"field-trials-ct w-container\">\n");
      out.write("\t\t\t\t\t<h1 class=\"section-heading white extra-space\"><u>Our Mission</u></h1>\n");
      out.write("\t\t\t\t\t<h2 class=\"ft-subheading\">Our motto is to maximize the productivity with minimum input & empower the farmers of Country.</h2>\n");
      out.write("\t\t\t\t\t<div class=\"field-trial-emphasis\"><u>Our Goals</u></div><div class=\"bullets-grid\"><div class=\"bullet-group\"><div class=\"bullet\"></div><div class=\"bullet-text\">Recommend the Best Seed Choice for fields from the entire seed market\n");
      out.write("to:</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"bullet-sub-group\"><div class=\"bullet sub-bullet\"></div>\n");
      out.write("<div class=\"bullet-text\">increase yields by up to 20%</div></div>\n");
      out.write("<div class=\"bullet-sub-group\">\n");
      out.write("\t<div class=\"bullet sub-bullet\"></div>\n");
      out.write("\t<div class=\"bullet-text\">improve net farm income by up to 25%</div></div>\n");
      out.write("\t<div class=\"bullet-group\">\n");
      out.write("\t\t<div class=\"bullet\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"bullet-text\">and to:</div></div>\n");
      out.write("\t\t<div class=\"bullet-sub-group\">\n");
      out.write("\t\t\t<div class=\"bullet sub-bullet\"></div>\n");
      out.write("\t\t\t<div class=\"bullet-text\">predict planting conditions, growth stages, harvest conditions and crop yields within 95% accuracy</div></div></div>\n");
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
