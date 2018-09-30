<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Room</title>
</head>
<body>
<%@page import="homePage.Music" %>
<%@page import="homePage.Fuzzy_Logic" %>

<br>
<br>

<%String weather= Fuzzy_Logic.weather(); %>
The outside weather is <%= weather%>
<br><br>
The room temperature is set to 15°


<br><br>
Your Favourite music track is being played 
<%Music.main(null);%>

<body style="background-color:powderblue;">

</body>

</html>