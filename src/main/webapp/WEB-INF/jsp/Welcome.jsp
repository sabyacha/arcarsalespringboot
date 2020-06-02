<!DOCTYPE html>
<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}
</style>
</head>
<body>

<ul>
  <li><a href="#home">HOME</a></li>
  <li><a href="#support">SUPPORT</a></li>
  <li><a href="#contact">CONTACT</a></li>
  <li style="float:right"><a class="active" href="Signin.jsp">SIGN IN</a></li>
</ul>

</body>
</html>
