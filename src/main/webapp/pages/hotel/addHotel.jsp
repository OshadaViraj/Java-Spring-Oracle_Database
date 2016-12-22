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


            <form role="form" id="addHotel" method="POST" data-toggle="validator" >
                <div class="box-body">
                    <div class="form-group  col-lg-3">
                        <label for="Code">Code</label>
                        <input type="text" class="form-control"  id="code" name="code" placeholder="Code" >
                    </div>
                    <div class="form-group col-lg-6">
                        <label>Short Name</label>
                        <input type="text" class="form-control"  name="shortName" placeholder="Short Name">
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
            <li class="active">
                <a data-toggle="tab" href="#Hotel">Hotel</a></li>
            <li><a data-toggle="tab" href="#menu1">Hotel Details</a></li>
            <li><a data-toggle="tab" href="#menu2">Room Category / Buying Rates</a></li>
            <li><a data-toggle="tab" href="#menu3">Guide Accommodation</a></li>
            <li><a data-toggle="tab" href="#menu4">Contracted Rates</a></li>
            <li><a data-toggle="tab" href="#menu5">Activities</a></li>
            <li><a data-toggle="tab" href="#menu6">Allotments</a></li>
            <li><a data-toggle="tab" href="#menu7">Images</a></li>
        </ul>

        <div class="tab-content">
            <div id="Hotel" class="tab-pane fade in active">
                <div class="box box-primary">


                   
                        <div class="box-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="form-group">
                                        <label for="Property Code">Property Code</label>
                                        <input type="text" class="form-control" id="ProperyCode" name="propertyCode" placeholder="Propery Code">
                                    </div>
                                    <div class="form-group ">
                                        <label for="LongName">Long Name</label>
                                        <input type="text" class="form-control" id="LongName" name="longName" placeholder="Long Name">
                                    </div>
                                     <div class="form-group ">
                                        <label for="Loacation">Location</label>
                                        <input type="text" class="form-control" id="LongName"  name="location" placeholder="Location">
                                    </div>
                                     <div class="form-group">
                                        <label for="Hotel Telephone">Hotel Telephone</label>
                                        <div class="form-group">
                                            <input type="tel" class="form-control" id="LongName" name="hotelPhone1" placeholder="Hotel Telephone">
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="Hotel Telephone">E - Mail</label>
                                         <div class="form-group">
                                            <input type="email" class="form-control" id="LongName" name="email" placeholder="E Mail">
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
                                <button class="btn btn-primary" type="submit">Submit</button>
                            </div>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
            <div id="menu1" class="tab-pane fade">
                <h1>HHHH</h1>
            </div>









        </div>

    </section>
</div>

<script>
    $(document).ready(function() {

//    var objInfo = $('#code');
//    objInfo.keyup(function(){
//        var id = objInfo.val();
//        $.ajax({
//            type: "GET",
//            url: "check",
//            contentType: "application/json",
//            data: {
//                "id": id
//            },
//            success: function  (data) {
//                console.log(data);
//                
//            }
//        });
//    });

$( "#addHotel" ).submit(function( event ) {
   if($('#code').val()=="")
   {
     $('#codeError').fadeIn(800).delay(3000);
     $('#code').css('border-color', 'red');
    event.preventDefault();
   }
   
});
 
   
  
});
</script>