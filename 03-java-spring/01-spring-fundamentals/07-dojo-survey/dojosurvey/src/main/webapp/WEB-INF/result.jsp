<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p> Name: <c:out value="${name}"/> </p>
<p> Location: <c:out value="${location}"/> </p>
<p> Comments: <c:out value="${comments}"/> </p>


</body>
</html>