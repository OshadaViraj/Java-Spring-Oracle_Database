<%-- 
    Document   : page
    Created on : May 20, 2016, 11:39:03 PM
    Author     : Lakshitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>ITOS-Test</title>
  <script src="${pageContext.servletContext.contextPath}/external/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!--  <script src="${pageContext.request.contextPath}/external/jquery-3.1.1.min.js"></script>-->
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/dist/css/skins/_all-skins.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/plugins/iCheck/flat/blue.css">
  <!-- Morris chart -->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/plugins/morris/morris.css">
  <!-- jvectormap -->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
  <!-- Date Picker -->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/plugins/datepicker/datepicker3.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/plugins/daterangepicker/daterangepicker.css">
  <!-- bootstrap wysihtml5 - text editor -->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/external/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  
  
    
</head>
  
 <body class="hold-transition skin-blue sidebar-mini">


       
            <table border="0" width="100%" cellpadding="0" cellspacing="0" class="main">
            <tr style="height:20%">
                <td valign="top" style="height:6px">
                    <t:insertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td valign="top">
                     <div id="wrapper">
                    <table width="100%" border="0" >
                        <tr>
                            <td valign="top" style="width: 100px;">
                                <t:insertAttribute name="left" />
                            </td>
                            <td valign="top" style="width: 100%">
                                <div id="main-content" class="clearfix" style="margin-left: 0px;">
                                    <t:insertAttribute name="content" />
                                </div>
                            </td>
                        </tr>
                        
                    </table>
                 </div>
                </td>
            </tr>

             <tr style="height:20%">
                <td  style="height:6px">
                    <t:insertAttribute name="footer" />
                </td>
            </tr>
           
        </table>

                                
<!-- jQuery 2.2.3 -->


<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.6 -->
<script src="${pageContext.servletContext.contextPath}/external/bootstrap/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="${pageContext.servletContext.contextPath}/external/plugins/morris/morris.min.js"></script>
<!-- Sparkline -->
<script src="${pageContext.servletContext.contextPath}/external/plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="${pageContext.servletContext.contextPath}/external/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${pageContext.servletContext.contextPath}/external/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="${pageContext.servletContext.contextPath}/external/plugins/knob/jquery.knob.js"></script>
<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="${pageContext.servletContext.contextPath}/external/plugins/daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="${pageContext.servletContext.contextPath}/external/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="${pageContext.servletContext.contextPath}/external/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="${pageContext.servletContext.contextPath}/external/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${pageContext.servletContext.contextPath}/external/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.servletContext.contextPath}/external/dist/js/app.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="${pageContext.servletContext.contextPath}/external/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.servletContext.contextPath}/external/dist/js/demo.js"></script>
    </body>
</html>
