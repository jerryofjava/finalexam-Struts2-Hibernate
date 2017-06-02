<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri ="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	Truck ${truckNo} is ready to roll- weight limit passed.
	
	<s:form action ="truckform.jsp" method ="post">
		<s:submit type="submit" value="<<Go Back>>"/>
	</s:form>
</body>
</html>