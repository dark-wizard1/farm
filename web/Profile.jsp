<%@page import="java.util.HashMap"%>
<%
    HashMap hm=(HashMap)session.getAttribute("UserDetails");
    if(hm!=null){
         
    %>
<!DOCTYPE html>
 
<html  data-wf-page="595e3241f7d06e4c3e688452" data-wf-site="595e3241f7d06e4c3e688453">
<head>
	<meta charset="utf-8"/>
	<title>Farm-Assistant</title>
	<meta content="width=device-width, initial-scale=1" name="viewport"/>

	<link href="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/css/visualfarms.webflow.40c6955b1.css" rel="stylesheet" type="text/css"/>
	 <link rel="stylesheet" type= "text/css" href="css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
   <link rel="stylesheet" type= "text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/datepicker.css">
 <link rel="stylesheet" type="text/css" href="css/custom.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
 <link rel="stylesheet" type= "text/css" href="css/bootstrap.min.css">
 <link rel="stylesheet" type="text/css" href="css/datepicker.css">
 <link rel="stylesheet" type="text/css" href="css/custom.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         
     <style>
 
 
.abc img {
  float: left;
  margin: 0 10px 0 -25px;
  height: 80px;
  width: 80px;
  border-radius: 10%;
}
</style>
  <style> <%----  forside nav----%>
      
body {
    font-family: "Lato", sans-serif;
}

.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: #111;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover {
    color: #f1f1f1;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

#main {
    transition: margin-left .5s;
    padding: 16px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
ul li{text-color:white;}
</style>
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 <title>Farm-Assistant</title>
 <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
 <link rel="stylesheet" type= "text/css" href="css/bootstrap.min.css">
 <link rel="stylesheet" type="text/css" href="css/datepicker.css">
 <link rel="stylesheet" type="text/css" href="css/custom.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 
 

</head>
<body>
  	<div data-collapse="medium" data-animation="default" data-duration="400" class="navbar w-nav">
	
		<div class="navct"><a href="/" class="visual-brand w-nav-brand"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/595e3afd81db0547055c7839_vfarms-Icon.png" class="plant-icon"/>
			<div class="logo-text-holder">
				<div class="visual-farms">Farm-Assistant</div>
				<div class="logo-kicker">One stop solution for farmers</div>
			</div></a>
			<nav role="navigation" class="nav-menu w-nav-menu"> 
				<class="nav-link w-nav-link"><b><a href="index.jsp">Home |</a><a href="fertilizer.html">Fertilizers |</a><a href="govtpolicy.html">Govt. Policies |</a> <a href="marketprice.html">Market-Price |</a><a href="contactus.html"> 
                            Contact</a><div class="abc" style="width:22%; margin-left:600px">
                                <div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="text-color:white;width:auto;"><%=hm.get("name")%></button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a href='logout.jsp'>Logout</a><br>
     <a href='changepassword.jsp'>Change Password</a>
    
  </div>
</div>
 </div>
	  
</nav>
 
				<div class="menu-button w-nav-button"><div class="w-icon-nav-menu"></div></div></div></div>
                  <%--- Sidenave ---%>
                                <div id="mySidenav" class="sidenav" style="margin-top:10%;">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
   
  
                                       
  <ul type="none" >
      <li>
           <img src="GetPhoto?email=<%=hm.get("email")%>" alt="Person" width="96" height="96" style="margin-left:40px;margin-top: -40px">
      </li><br><br>
  <li style="text-color:white;">
  Email:<b><%=hm.get("email")%></b><br>

  </li><br>
  
  <li style="text-color:white;">
   Phone:<b><%=hm.get("phone")%></b><br>

 
  </li><br>
  
<li style="text-color:white;">
 DOB:<b><%=hm.get("dob")%></b>	
   
</li>
 
   
 </ul>  
</div>
 <%
     String m=(String)session.getAttribute("msg");
     if(m!=null){
             %>
             <hr>
             <b><%=m%></b>
             <hr>
             <%
             session.setAttribute("msg",null);   
}
             %>

<div id="main">
<span style="font-size:30px;cursor:pointer" onclick="openNav()" >&#9776; </span>  

  
  
</div>
                                                    
													   
 

<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft= "0"; 
}
</script>
                                 <center>Hello Farmer !!!</center>
 <center> <h2 style="margin-left:30px;">Welcome To Farm-Assistant</h2>
     
 
 </center> 
                                 <script>
      window.location.hash="no-back-button";
      window.location.hash="Again-No-back-button";//again because chrome don't insert first hash into history
      window.onhashchange=function(){window.location.hash="no-back-button";}
                                 </script>
 
</body>
</html>
 <%
     }else{
session.setAttribute("msg","plz login first");
response.sendRedirect("index.jsp");
}
 %>