<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Form</title>
<style type="text/css">
.error{
	color:#ff0000;
}
.errorblock{
	color:#000;
	background-color: #ffEEEE;
	border: 1px solid #ff0000;
	padding: 8px;
	margin: 16px;
</style>
</head>
<body>
	<form:form commandName="event">
		<form:errors cssClass="errorblock" element="div" path="*"></form:errors>
		<form:label path="name" >Enter Name of The Event</form:label>
		<form:input path="name" title="Name of The Event"  cssErrorClass="error"/>
		<form:errors path="name" cssClass="error"></form:errors> <br/>
		<form:button name="btn" value="Enter Event" id="btn">Enter Event</form:button>
	</form:form>
</body>
</html>