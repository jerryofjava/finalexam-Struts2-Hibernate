<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri ="/struts-tags" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Truck Evaluation</title>
</head>
<body>
	<h2>Truck Evaluation</h2>
	<s:form action ="compute.action" method ="post">
		<s:textfield label="Please enter the truck number" key="truckNo"/>
		<s:textfield label="Please enter its weight for truck" key="weight"/>
		<s:submit type="submit" value="Submit"/>
	</s:form>
</body>
</html>