<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
<script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
 
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'>
<link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/css/bootstrapValidator.min.css'>
<link rel="stylesheet" href="/resources/css/style.css">

</head>
<body>
  <div class="container">

    <form class="well form-horizontal" action=" " method="post"  id="contact_form">
		<fieldset>
			<!-- Form Name -->
			<legend>Contact Us Today!</legend>
			
			<!-- Text input-->
			
			<div class="form-group">
			  <label class="col-md-4 control-label">First Name</label>  
			  <div class="col-md-4 inputGroupContainer">
			  <div class="input-group">
			  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
			  <input  name="first_name" placeholder="First Name" class="form-control"  type="text">
			    </div>
			  </div>
			</div>
			
			<!-- Text input-->
		
		<div class="form-group">
		  <label class="col-md-4 control-label" >Last Name</label> 
		    <div class="col-md-4 inputGroupContainer">
		    <div class="input-group">
		  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
		  <input name="last_name" placeholder="Last Name" class="form-control"  type="text">
		    </div>
		  </div>
		</div>
		
		<!-- Text input-->
		       <div class="form-group">
		  <label class="col-md-4 control-label">E-Mail</label>  
		    <div class="col-md-4 inputGroupContainer">
		    <div class="input-group">
		        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
		  <input name="email" placeholder="E-Mail Address" class="form-control"  type="text">
		    </div>
		  </div>
		</div>
		
		
		<!-- Text input-->
		       
		<div class="form-group">
		  <label class="col-md-4 control-label">Phone #</label>  
		    <div class="col-md-4 inputGroupContainer">
		    <div class="input-group">
		        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
		  <input name="phone" placeholder="(845)555-1212" class="form-control" type="text">
		    </div>
		  </div>
		</div>
		
		<!-- Text input-->
		      
		<div class="form-group">
		  <label class="col-md-4 control-label">Address</label>  
		    <div class="col-md-4 inputGroupContainer">
		    <div class="input-group">
		        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
		  <input name="address" placeholder="Address" class="form-control" type="text">
		    </div>
		  </div>
		</div>
		
		<!-- Text input-->
		 
		<div class="form-group">
		  <label class="col-md-4 control-label">City</label>  
		    <div class="col-md-4 inputGroupContainer">
		    <div class="input-group">
		        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
		  <input name="city" placeholder="city" class="form-control"  type="text">
		    </div>
		  </div>
		</div>
		
		<!-- Select Basic -->
		   
		<div class="form-group"> 
		  <label class="col-md-4 control-label">State</label>
		    <div class="col-md-4 selectContainer">
		    <div class="input-group">
		        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
		    <select name="state" class="form-control selectpicker" >
		      <option value=" " >Please select your state</option>
		      <option>Alabama</option>
		     
		    </select>
		  </div>
		</div>
		</div>
		
		<!-- Text input-->
		
		<div class="form-group">
		  <label class="col-md-4 control-label">Zip Code</label>  
		    <div class="col-md-4 inputGroupContainer">
		    <div class="input-group">
		        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
		  <input name="zip" placeholder="Zip Code" class="form-control"  type="text">
		    </div>
		</div>
		</div>
		
		<!-- Text input-->
		<div class="form-group">
		  <label class="col-md-4 control-label">Website or domain name</label>  
		   <div class="col-md-4 inputGroupContainer">
		    <div class="input-group">
		        <span class="input-group-addon"><i class="glyphicon glyphicon-globe"></i></span>
		  <input name="website" placeholder="Website or domain name" class="form-control" type="text">
		    </div>
		  </div>
		</div>
		
		<!-- radio checks -->
		 <div class="form-group">
		                        <label class="col-md-4 control-label">Do you have hosting?</label>
		                        <div class="col-md-4">
		                            <div class="radio">
		                                <label>
		                                    <input type="radio" name="hosting" value="yes" /> Yes
		                                </label>
		                            </div>
		                            <div class="radio">
		                                <label>
		                                    <input type="radio" name="hosting" value="no" /> No
		                                </label>
		                            </div>
		                        </div>
		                    </div>
		
		<!-- Text area -->
		  
		<div class="form-group">
		  <label class="col-md-4 control-label">Project Description</label>
		    <div class="col-md-4 inputGroupContainer">
		    <div class="input-group">
		        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
		        	<textarea class="form-control" name="comment" placeholder="Project Description"></textarea>
		  </div>
		  </div>
		</div>
		
		<!-- Success message -->
		<div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i> Thanks for contacting us, we will get back to you shortly.</div>
		
		<!-- Button -->
		<div class="form-group">
		  <label class="col-md-4 control-label"></label>
		  <div class="col-md-4">
		    <button type="submit" class="btn btn-warning" >Send <span class="glyphicon glyphicon-send"></span></button>
		  </div>
		</div>
		
		</fieldset>
		</form>
	</div>
  </div><!-- /.container -->
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>

    <script src="/resources/js/index.js"></script>

</body>
</html>