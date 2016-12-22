<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript" src="<c:url value='scripts/hotel.js' />"></script>

<!--<script src="../../scripts/hotel.js" type="text/javascript"></script>-->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Hotel
            <small>add Hotel</small>
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
        <div class="box box-primary">


            <form role="form" id="addHotel" method="POST" action="edit" data-toggle="validator" >
                <div class="box-body">
                    <div class="form-group  col-lg-3">
                        <label for="Code">Code</label>
                        <input type="text" class="form-control"  id="code" name="code"  value="${hotel.code}" readonly >
                    </div>
                    <div class="form-group col-lg-6">
                        <label>Short Name</label>
                        <input type="text" class="form-control"  name="shortName" value="${hotel.shortName}">
                    </div>

                    <div class="form-group checkbox">
                        <label>
                            <input type="checkbox">Active
                        </label>
                    </div>
                </div>
                <!-- /.box-body -->
            
        </div>





        </di>
        <ul class="nav nav-tabs">
            <li class="active"><a data-toggle="tab" href="#Hotel">Hotel</a></li>
            <li><a data-toggle="tab" href="#menu1">Hotel Details</a></li>
            <li><a data-toggle="tab" href="#menu1">Room Category / Buying Rates</a></li>
            <li><a data-toggle="tab" href="#menu1">Guide Accommodation</a></li>
            <li><a data-toggle="tab" href="#menu1">Contracted Rates</a></li>
            <li><a data-toggle="tab" href="#menu1">Activities</a></li>
            <li><a data-toggle="tab" href="#menu1">Allotments</a></li>
            <li><a data-toggle="tab" href="#menu1">Images</a></li>
        </ul>

        <div class="tab-content">
            <div id="Hotel" class="tab-pane fade in active">
                <div class="box box-primary">


                   
                        <div class="box-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="form-group">
                                        <label for="Property Code">Property Code</label>
                                    <input type="text" class="form-control" id="ProperyCode" name="propertyCode" value="${hotel.propertyCode}">
                                    </div>
                                    <div class="form-group ">
                                        <label for="LongName">Long Name</label>
                                        <input type="text" class="form-control" id="LongName" name="longName"  value="${hotel.longName}">
                                    </div>
                                     <div class="form-group ">
                                        <label for="Loacation">Location</label>
                                        <input type="text" class="form-control" id="location"  name="location" value="${hotel.location}">
                                    </div>
                                     <div class="form-group">
                                        <label for="Hotel Telephone">Hotel Telephone</label>
                                        <div class="form-group">
                                            <input type="tel" class="form-control" id="hotelPhone1" name="hotelPhone1" value="${hotel.hotelPhone1}">
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="Hotel Telephone">E - Mail</label>
                                         <div class="form-group">
                                            <input type="email" class="form-control" id="email" name="email" value="${hotel.email}">
                                        </div>
                                        
                                    </div>
                                    

                                    
                                </div>
                                 <div class="col-lg-6">
                                    <div class="form-group ">
                                        <label for="Property Code">Managing Company</label>
                                        <input type="text" class="form-control" id="ProperyCode" placeholder="Managing Company">
                                    </div>
                                    <div class="form-group ">
                                        <label for="Address">Address</label>
                                       <textarea class="form-control" rows="5" id="comment" placeholder="Address"></textarea>
                                    </div>
                                       <div class="form-group">
                                        <label for="Hotel Telephone">Hotel Telephone</label>
                                        <div class="form-group">
                                            <input type="tel" class="form-control" id="LongName" placeholder="Hotel Telephone">
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="Hotel Telephone">E - Mail</label>
                                         <div class="form-group">
                                            <input type="email" class="form-control" id="LongName" placeholder="E Mail">
                                        </div>
                                        
                                    </div>

                                    
                                </div>

                            
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                 <div class="form-group ">
                                        <label for="Address">Cancellation Policy</label>
                                       <textarea class="form-control" rows="5" id="comment" placeholder="Cancellation Policy"></textarea>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                            <div class="col-lg-12">
                                <button class="btn btn-warning" type="submit">Edit</button>
                               
                                <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal">Delete</button>
                            </div>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
            <div id="menu1" class="tab-pane fade">

            </div>









        </div>

    </section>
</div>
                                        
                                        <div class="modal fade" id="myModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
<!--          <i class="fa fa-remove"> </i> <h4 class="modal-title">Delete Hotel</h4>-->
 <div class="callout callout-danger" id="codeError">
          <h4>Are You Sure</h4>

          <p>Your going to delete hotel information</p> <i class="fa fa-trash-o fa-4"></i>
        </div>
      </div>
      <div class="modal-body">
          <center>
        <p>Are you sure you want to delete this item? 
            <strong> Hotel Code : "${hotel.code}"</strong></p></center>
      </div>
      <div class="modal-footer">
        
        <form action="delete" method="POST">
            <input type="hidden" name="code" value="${hotel.code}">
           <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
           <button type="submit" class="btn btn-warning">Confirm</button>
        </form>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div>

<script>
    $(document).ready(function() {
   

 
   
  
});
</script>