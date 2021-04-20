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
<h3>Welcome</h3>

	<form method="POST" action="/submitinfo">
	<div>
		<label>Your Name</label>
		<input type="text" name="name">
	</div>
	<div>
	
		<label>Dojo Location:</label>
		<select name="location">
			<option value="Austin">Austin</option>
			<option value="Chicago">Chicago</option>
			<option value="Denver">Denver</option>
			<option value="Houston">Houston</option>
			<option value="New York">New York</option>
			<option value="San Francisco">San Francisco</option>
			<option value="Seattle">Seattle</option>
			<option value="Washington DC">Washington DC</option>
		</select>
	</div>
	
	<div>
	<label>Favorite Language:</label>
		<select name="language">
			<option value="Java">Java</option>
			<option value="C#">C#</option>
			<option value="C++">C++</option>
			<option value="Python">Python</option>
			<option value="MERN">MERN</option>
			
		</select>
	</div>
	<div>
			<p>Comments (optional)</p>
			<textarea name="comments"></textarea>
	</div>
	<button>Submit</button>
	
	</form>
</body>
</html>