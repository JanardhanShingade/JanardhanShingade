<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<style>
</style>
</head>
<body>
	<h2>Users login</h2>
	<h2>Enter your valid ID</h2>
	<form action="/users" method="post">
	
	<br><br>
		<label for="id">ID:</label> <input type="text" id="id" name="id"><br>
		<br>

		<input type="submit" value="Enter">
	</form>



</body>
</html>

