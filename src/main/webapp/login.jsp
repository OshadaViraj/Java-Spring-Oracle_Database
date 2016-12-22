

   <style>
    #java{
        height: 64px;
        width: 64px;
        position:fixed;
        bottom:10px;
        right:188px;
    }
    #springLogo{
        height: 64px;
        width: 64px;
        position:fixed;
        bottom:10px;
        right:104px;
    }
    #hibernateLogo{
        height: 64px;
        width: 64px;
        position:fixed;
        bottom:10px;
        right:20px;
    }
     #oracle{
        height: 40px;
        width: 230px;
        position:fixed;
        bottom:10px;
        right:260px;
        

    }
    #div1{
        
       
        background-color: #2c3e50;
    }
    
   
    
   
</style>
  <meta charset="UTF-8">
  <title>ITOS Login</title>
  
<!--  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">-->

<!--  <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>-->
<!--<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>-->

      <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/loginMenu/css/style.css">

  

      <body id="div1"> 
<!-- Form Mixin-->
<!-- Input Mixin-->
<!-- Button Mixin-->
<!-- Pen Title-->
<div class="pen-title">
  <h1>ITOS</h1><span><a href=''>Inbound Tour Operating Systems</a></span>
</div>
<!-- Form Module-->
<div id="mainform" class="module form-module" style="display: none;">
  <div class="toggle"><i class="fa fa-times fa-pencil"></i>
    <div class="tooltip">Click Me</div>
  </div>
  <div class="form">
    <h2>Login to your account</h2>
    <form action="login" method="POST">
      <input type="text" placeholder="Username"/>
      <input type="password" placeholder="Password"/>
      <button>Login</button>
    </form>
  </div>
  <div class="form">
    <h2>Create an account</h2>
    <form>
      <input type="text" placeholder="Username"/>
      <input type="password" placeholder="Password"/>
      <input type="email" placeholder="Email Address"/>
      <input type="tel" placeholder="Phone Number"/>
      <button>Register</button>
    </form>
  </div>
  <div class="cta"><a href="">Forgot your password?</a></div>
  
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  

    <script src="${pageContext.servletContext.contextPath}/external/loginMenu/js/index.js"></script>
    
</div> 
      <div >
         
    <img class="imageModal-content" src="external/img/springLogo.png" id="springLogo">
    <img class="imageModal-content" src="external/img/hibernateLogo.png" id="hibernateLogo">
    <img class="imageModal-content" src="external/img/java8.png" id="java">
    <img class="imageModal-content" src="external/img/oracle1.png" id="oracle">
</div>

  <body>


<script>
    $( document ).ready(function() {
           $('#mainform').fadeIn(3000).focusin();
          
});
</script>

