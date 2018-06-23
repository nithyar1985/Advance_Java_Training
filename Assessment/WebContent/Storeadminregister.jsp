<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>StoreAdmin</title>
</head>
<body>
<form name="Store_Admin" action="StoreServlet" method="post">
Emp_id: <input type="text" name="empid"/><br/><br/>
Emp_Name: <input type="text" name="empname"/><br/><br/>
Dept_Code: <input type="text" name="deptcode"/><br/><br/>
Date_of_Join: <input type="date" name="doj"/><br/><br/>
Password: <input type="text" name="password"/><br/><br/>

<input type="submit" value="GetAdminRegisterDetails">
</form>
</body>
</html>