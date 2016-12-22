<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript" src="<c:url value='scripts/hotel.js' />"></script>
<!--<script src="../../scripts/hotel.js" type="text/javascript"></script>-->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Hotel
            <small>View All Hotels</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Dashboard</li>
        </ol>
        <div class="callout callout-danger" id="codeError" style="display:none">
          <h4>Error !</h4>

          <p>Hotel code should not be empty</p>
        </div>
    </section>


    <section class="content">

        <!-- general form elements -->
        <div class="row">
             <div class="box">
            <div class="box-header">
              <h3 class="box-title">Basics Hotel Information</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-striped table-responsive">
                <thead>
                <tr>
                  <th>More Info</th>
                  <th>Hotel Code</th>
                  <th>Short Name</th>
                  <th>Long Name</th>
                  <th>Location</th>
                  <th>Address</th>
                  <th>Telephone</th>
                  <th>Web Site</th>
                 
                </tr>
                </thead>
                <tbody>
              <c:forEach items="${hotels}" var="hotel" >   
                <tr id="${hotel.code}">
              
                  
<!--                  <td><button type="submit" class="btn btn-info">Info</button></td>-->
<td><button class="btn btn-info"><a href="<c:url value="/Hotel/find?code=${hotel.code}" />">Info</a></button></td>
              </form>
                  <td>${hotel.code}</td>
                  <td>${hotel.shortName}</td>
                  <td>${hotel.longName}</td>
                  <td>${hotel.location}</td>
                  <td>${hotel.address1} ${model.address2}${model.address3}</td>
                  <td>${hotel.hotelPhone1}</td>
                  <td><a ref="${hotel.webSite}">${hotel.webSite}</a></td>
                  
                </tr>
              </c:forEach> 
                </tbody>
<!--                <tfoot>
                <tr>
                  <th>Rendering engine</th>
                  <th>Browser</th>
                  <th>Platform(s)</th>
                  <th>Engine version</th>
                  <th>CSS grade</th>
                </tr>
                </tfoot>-->
              </table>
            </div>
            <!-- /.box-body -->
          </div>  
        </div>
       

    </section>
</div>

