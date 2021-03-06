<%@page import="db.DbConnect"%>
<!DOCTYPE html>
<html  data-wf-page="595e3241f7d06e4c3e688452" data-wf-site="595e3241f7d06e4c3e688453">
<head>
	<meta charset="utf-8"/>
	<title>Farm-Assistant</title>
	<meta content="width=device-width, initial-scale=1" name="viewport"/>

	<link href="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/css/visualfarms.webflow.40c6955b1.css" rel="stylesheet" type="text/css"/>
	 <link rel="stylesheet" type= "text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/datepicker.css">
	 <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
 <link rel="stylesheet" type="text/css" href="css/custom.css">
	<script src="https://ajax.googleapis.com/ajax/libs/webfont/1.4.7/webfont.js" type="text/javascript"></script>
	<script type="text/javascript">WebFont.load({  google: {    families: ["Montserrat:100,100italic,200,200italic,300,300italic,400,400italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic","Raleway:100,100italic,200,200italic,300,300italic,regular,italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic","Federo:regular"]  }});</script>
	<script type="text/javascript">!function(o,c){var n=c.documentElement,t=" w-mod-";n.className+=t+"js",("ontouchstart"in o||o.DocumentTouch&&c instanceof DocumentTouch)&&(n.className+=t+"touch")}(window,document);</script>
	<link href="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e401481db0547055c7afa_vfarms-Favicon-Small.jpg" rel="shortcut icon" type="image/x-icon"/>
	<link href="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e40186a453d04dbb32b9d_vfarms-Favicon.jpg" rel="apple-touch-icon"/><script type="text/javascript">
		(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)})(window,document,'script','https://www.google-analytics.com/analytics.js','ga');ga('create', 'UA-104862895-1', 'auto');ga('send', 'pageview');</script>
		<style type="text/css">
    input.input-box, textarea { background: white; color: black; }
.w-input::-webkit-input-placeholder { 
    color:    #998675;
}
.w-input:-moz-placeholder { 
    color:    #998675;
    opacity: 1;
}
.w-input::-moz-placeholder { 
    color:    #998675;
    opacity: 1;
}
.w-input:-ms-input-placeholder {
    color:    #998675;
}
    input.black-text, textarea { color: black; }
    
</style>
</head>
<body>
	<div data-collapse="medium" data-animation="default" data-duration="400" class="navbar w-nav">
	
		<div class="navct"><a href="/" class="visual-brand w-nav-brand"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/595e3afd81db0547055c7839_vfarms-Icon.png" class="plant-icon"/>
			<div class="logo-text-holder">
				<div class="visual-farms">Farm-Assistant</div>
				<div class="logo-kicker">One stop solution for farmers</div>
			</div></a>
			<nav role="navigation" class="nav-menu w-nav-menu"> 
				<class="nav-link w-nav-link"><b><a href="index.jsp">Home |</a><a href="fertilizer.html">Fertilizers |</a><a href="govtpolicy.html">Govt. Policies |</a> <a href="marketprice.html">Market-Price |</a><a href="contactus.html"> Contact </a><a href="registerdesign.jsp"><button class="btn btn-danger" style="width:auto;align:right;">Login</button></a> <a href="Adminlogin.html"><button class="btn btn-danger" style="width:auto;align:right;">AdminLogin</button></a>
                                        <%
   db.DbConnect db=(db.DbConnect)application.getAttribute("DBCon");
    if(db==null){
        db=new db.DbConnect(); 
        application.setAttribute("DBCon", db);
    }
    Integer ct=(Integer)application.getAttribute("count");
    if(ct==null)
    ct=0;
    ct++;
    application.setAttribute("count",ct);
    %>
    Visited:<b><%=ct%>times
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
	  <div id="id01" class="modal"> 
  
  <form class="modal-content animate" action="/action_page.php" >
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="img/login1.jpg" style="width:100px;height:120px;margin-top:25px;" alt="Avatar" class="avatar"><!--modal image-->
    </div>
  </form>
</div>
</nav>
 
				<div class="menu-button w-nav-button"><div class="w-icon-nav-menu"></div></div></div></div>
				<div class="wrapper">
					<div id="home" class="home-hero"><div data-delay="10000" data-animation="cross" data-autoplay="1" data-duration="2000" data-infinite="1" class="hero-slider w-slider">
						<div class="w-slider-mask">
							<div class="w-slide"><div data-poster-url="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-poster-00001.jpg" data-video-urls="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-transcode.webm,https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-transcode.mp4" data-autoplay="true" data-loop="true" data-wf-ignore="true" class="background-video w-background-video w-background-video-atom"><video autoplay="" loop="" style="background-image:url(&quot;https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-poster-00001.jpg&quot;)" data-wf-ignore="true"><source src="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-transcode.webm" data-wf-ignore="true"/><source src="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595f3d5b5d8a8859f645a090_Corn-transcode.mp4" data-wf-ignore="true"/></video>
								<div class="hh-ct w-container">
									<h1 data-ix="text-build-in" class="hh-title">Our Audacious Goal: A Machine Learning system on every farm.</h1>
								</div>
							</div>
						</div>
								<div data-ix="slidefade" class="w-slide">
									<div data-poster-url="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-poster-00001.jpg" data-video-urls="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-transcode.webm,https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-transcode.mp4" data-autoplay="true" data-loop="true" data-wf-ignore="true" class="background-video w-background-video w-background-video-atom"><video autoplay="" loop="" style="background-image:url(&quot;https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-poster-00001.jpg&quot;)" data-wf-ignore="true"><source src="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-transcode.webm" data-wf-ignore="true"/><source src="https://daks2k3a4ib2z.cloudfront.net/595e3241f7d06e4c3e688453/595e453933ba421472a35429_Soybeans-transcode.mp4" data-wf-ignore="true"/></video>
										<div class="hh-ct w-container">
											<h1 data-ix="text-build-in" class="hh-title">Our systems know what a plant is doing every day of its life from planting to harvest.
											</h1></div></div></div></div>
											<div class="slider-arrows w-slider-arrow-left">
												<div class="w-icon-slider-left"></div></div>
												<div class="slider-arrow w-slider-arrow-right">
													<div class="w-icon-slider-right"></div></div>
													<div class="slide-nav-2 w-slider-nav w-round"></div></div></div>
													<div id="Machine-Learning" class="section s-work">
														<div class="w-container">
															<h1 class="section-heading white">Latest technology to agriculture like ML, AI<br>
															<div class="div-block-2"><div class="machine-item-div"><div class="machine-icon-holder"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c3274ec09b00015626ed_Money.png" class="machine-icon"/></div><div class="machine-item-text">Make<br/>Money</div></div><div class="machine-item-div"><div class="machine-icon-holder"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c279b6ffd70001e478b7_Time.png" class="machine-icon"/></div><div class="machine-item-text">Save<br/>Time</div></div>
															<div class="machine-item-div">
																<div class="machine-icon-holder"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c36c456ddb0001a923c6_Reduce.png" class="machine-icon"/>
			</div>
			<div class="machine-item-text">Reduce<br/>Risk</div>
		</div>
	</div>
</div>
<div class="w-container">
	<div data-delay="6000" data-animation="slide" data-autoplay="1" data-duration="700" data-infinite="1" class="work-slider w-slider">
		<div class="work-sliders-mask w-slider-mask">
			<div class="w-slide">
				<div class="work-slider-flex">
					<img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c1cd456ddb0001a922a7_Access.png" class="scroller-icon"/><div>1. Access the entire unbiased seed market<br>
<br>2. Monitor in-season real time crop stages<br><br>3. Capture timely alerts to potential pests or issues<br>
</div>
				</div>
			</div>
					<div class="w-slide">
						<div class="work-slider-flex"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c2370ac8ce0001199efe_Tools.png" class="scroller-icon"/><div>Use Farmer-designed tools</div></div></div>
						<div class="w-slide">
							<div class="work-slider-flex"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c259514b590001b93ec6_Monitor.png" class="scroller-icon"/><div>Monitor in-season real time crop stages</div></div></div><div class="w-slide"><div class="work-slider-flex"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c2a2ba0b3e0001da0865_Production.png" class="scroller-icon"/><div>Simulate production options</div></div></div>
							<div class="w-slide">
								<div class="work-slider-flex"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c2bf456ddb0001a92305_Alerts.png" class="scroller-icon"/>
									<div>Capture timely alerts to potential pests or issues</div></div></div><div class="w-slide"><div class="work-slider-flex"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c2e10ac8ce0001199f36_Benchmark.png" class="scroller-icon"/><div>Benchmark production</div></div></div>
									<div class="w-slide">
										<div class="work-slider-flex"><img src="https://uploads-ssl.webflow.com/595e3241f7d06e4c3e688453/5995c38b4ec09b0001562718_Data.png" class="scroller-icon"/>
											<div>Harness Big Data &amp; IoT for actionable decisions</div></div></div></div>
											<div class="work-slider-arrows w-slider-arrow-left">
												<div class="w-icon-slider-left"></div></div>
												<div class="work-slider-arrows w-slider-arrow-right">
													<div class="w-icon-slider-right"></div></div>
													<div class="slide-nav-3 w-slider-nav w-round"></div></div></div></div>
													<div id="Who-We-Are" class="section">
														<h1 class="section-heading">What is our main features?</h1>
                                                                                                                    
														<h2 class="subheading">We&#x27;re a one stop solution for your agricultural problem.<br></h2>

<section class="cities">
 <div class="container">
        <div class="row">
            <div class="col-md-3">
                <img src="1.jpg" >
                <h4>latest machines</h4>
                
               
            </div>
            <div class="col-md-3">
                <img src="C:\Users\RISHABH\Desktop\FINAL YEAR PROJECT\project\Gaurav Farming\img\2.jpg">
                <h4>Fertilizers & seeds</h4>
                
         
            </div>
            <div class="col-md-3">
                <img src="C:\Users\RISHABH\Desktop\FINAL YEAR PROJECT\project\Gaurav Farming\img\3.jpg">
                <h4>Govt. Policies</h4>
                
               
            </div>
            
</section>
													</div>
												</div>
											</div>

			<div id="Field-Trials" class="section s-work">
				<div class="field-trials-ct w-container">
					<h1 class="section-heading white extra-space"><u>Our Mission</u></h1>
					<h2 class="ft-subheading">Our motto is to maximize the productivity with minimum input & empower the farmers of Country.</h2>
					<div class="field-trial-emphasis"><u>Our Goals</u></div><div class="bullets-grid"><div class="bullet-group"><div class="bullet"></div><div class="bullet-text">Recommend the Best Seed Choice for fields from the entire seed market
to:</div>
</div>
<div class="bullet-sub-group"><div class="bullet sub-bullet"></div>
<div class="bullet-text">increase yields by up to 20%</div></div>
<div class="bullet-sub-group">
	<div class="bullet sub-bullet"></div>
	<div class="bullet-text">improve net farm income by up to 25%</div></div>
	<div class="bullet-group">
		<div class="bullet">
		</div>
		<div class="bullet-text">and to:</div></div>
		<div class="bullet-sub-group">
			<div class="bullet sub-bullet"></div>
			<div class="bullet-text">predict planting conditions, growth stages, harvest conditions and crop yields within 95% accuracy</div></div></div>
 <script>
      window.location.hash="no-back-button";
      window.location.hash="Again-No-back-button";//again because chrome don't insert first hash into history
      window.onhashchange=function(){window.location.hash="no-back-button";} 
 
</script>
</body>
</html>