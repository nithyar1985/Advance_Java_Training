<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Registration</title>
</head>
<body>
<form name="Book Flight" method="post"action="RegisterServlet">

Flight Name : <input type="text" name="flightname">
<br>
Source : <input type="text" name="source">
<br>
Destination: <input type="text" name="destination">
<br>
Fare : <input type="text" name="fare">
<br>
No of Seats : <input type="text" name="noofseats">
<br>
Aircraft Name : <input type="text" name="aircraftname">
<br>
<input type="submit" value="Add Flight Button">

</form>
</body>
</html>