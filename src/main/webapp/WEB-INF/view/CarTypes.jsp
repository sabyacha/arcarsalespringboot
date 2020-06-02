<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
  <style>
.vertical-menu {
  width: 200px;
}

.vertical-menu a {
  background-color: #eee;
  color: black;
  display: block;
  padding: 12px;
  text-decoration: none;
}

.vertical-menu a:hover {
  background-color: #ccc;
}

.vertical-menu a.active {
  background-color: #4CAF50;
  color: white;
}
</style>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    body {
 background-image: url("image1.png");
 background-color: #cccccc;
}
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
          <li><a href="/CarHome">Home</a></li>
        <li><a href="/about">About</a></li>
        <li class="active"><a href="/products">Products</a></li>
        <li><a href="/Contact">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <p><a href="/image1">Dashboard Styling Standard</a></p>
      <p><a href="/image2">Dashboard Styling Premium</a></p>
      <p><a href="/image3">Seat Fabric Standard</a></p>
       <p><a href="/image4">Seat Fabric Premium</a></p>
    </div>
    <c:choose>
    
    <c:when test="${mode=='image1' }">
     <input type="hidden" name="id" value="1" />
     <div class="col-sm-8 text-left"> 
      <h1>Dashboard Styling Standard</h1>
      <img src="static/image/Picture1.png" style="margin:auto; width:200px;display:block" />
      <hr>
      <h3>Description</h3>
      <p>${jsonImage1}</p>
    </div>
    </c:when>
    <c:when test="${mode=='image2' }">
    <input type="hidden" name="id" value="2" />
     <div class="col-sm-8 text-left"> 
      <h1>Dashboard Styling Premium</h1>
     <img src="static/image/Picture2.png" style="margin:auto; width:200px;display:block" />
      <hr>
      <h3>Description</h3>
      <p>${jsonImage1}</p>
    </div>
    </c:when>
    
    <c:when test="${mode=='image3' }">
      <input type="hidden" name="id" value="3" />
     <div class="col-sm-8 text-left"> 
      <h1>Seat Fabric Standard</h1>
      <img src="static/image/Picture3.png" style="margin:auto; width:200px;display:block" />
      <hr>
      <h3>Description</h3>
      <p>${jsonImage1}</p>
    </div>
    </c:when>
    
    <c:when test="${mode=='image4' }">
      <input type="hidden" name="id" value="4" />
     <div class="col-sm-8 text-left"> 
      <h1>Seat Fabric Premium</h1>
      <img src="static/image/Picture5.png" style="margin:auto; width:200px;display:block" />
      <hr>
      <h3>Description</h3>
      <p>${jsonImage1}</p>
    </div>
    </c:when>
    <c:when test="${mode=='MODE_REGISTER_IMAGE' }">
			<div class="container text-center">
				<h3>New Registration</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-car">
					<input type="hidden" name="id" value="${car.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Car imagepath</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="imagepath"
								value="${car.imagepath }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Itemnumber</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="Itemnumber"
								value="${car.Itemnumber }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Itemdis</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="Itemdis"
								value="${car.Itemdis }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Register" />
					</div>
				</form>
			</div>
		</c:when>
    </c:choose>
  </div>
</div>

<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</body>
</html>
