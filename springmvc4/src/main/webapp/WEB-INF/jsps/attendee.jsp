<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Form</title>
<style type="text/css">
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 1px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
	<a href="?lang=en">English</a>|
	<a href="?lang=es">Spanish</a>
	<form:form commandName="attendee">
		<form:errors cssClass="errorblock" element="div" path="*"></form:errors>
		<form:label path="name">
			<spring:message code="attendee.name" />
		</form:label>
		<form:input path="name" title="Name of The Event"
			cssErrorClass="error" />
		<form:errors path="name" cssClass="error"></form:errors>
		<br />
		<form:label path="emailAddress">
			<spring:message code="attendee.email.address" />
		</form:label>
		<form:input path="emailAddress" title="Attendee Email Address"
			cssErrorClass="error" />
		<form:errors path="emailAddress" cssClass="error"></form:errors>
		<br />
		<form:label path="phone">
			<spring:message code="attendee.phone" />
		</form:label>
		<form:input path="phone" title="Attendee phone"
			cssErrorClass="error" />
		<form:errors path="phone" cssClass="error"></form:errors>
		<br />
		<form:button name="btn" value="Enter Event" id="btn">Enter Attendee Details</form:button>
	</form:form>
</body>
</html>