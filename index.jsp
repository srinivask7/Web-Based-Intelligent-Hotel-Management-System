<!DOCTYPE html>
<html>
<head>
<style>

ul.so {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #f1f1f1;
}
ul.se {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 200px;
    overflow: hidden;
    background-color: #f1f1f1;
}

li {
    float: left;
}

li form, .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li form:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

</style>
<style> 
input[type=button], input[type=submit], input[type=reset] {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 8px 16px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
}

</style>
<style> 
html { 
  background: url(deeksha.jpg) no-repeat center fixed; 
  background-size: cover;
}

</style>
<body>
<ul class=so>
  <li><form action="index.jsp">
   <input type="Submit" value="Home"/> 
</form></li>
  <li><form action="About_Us.jsp">
  <input type="Submit" value="About Us"/> 
</form></li>
  <li><form action="Check_Availability.jsp">
  <input type="Submit" value="Booking"/> 
</form></li>
<li><form action="Intelligent_Services.jsp">
  <input type="Submit" value="Intelligent Services"/> 
</form></li>
<li><form action="Restaurant.jsp">
  <input type="Submit" value="Food/Restaurants"/> 
</form></li>
<li><form action="Location.jsp">
  <input type="Submit" value="Location Services"/> 
</form></li>
<li><form action="Register.jsp">
  <input type="Submit" value="Login/SignUp"/> 
</form></li>
<li><form action="Contact_Us.jsp">
  <input type="Submit" value="Contact Us"/> 
</form></li>
</ul>
</body>
</head>
</html>
