<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post">
<label>set userName</label><input type="text" name="uname1"/>
<label>enter password</label><input type="password" name="pword1" required/>
<label>Re-enter password</label><input type="password" name="pword2" required/>
${message}
<input type="submit" value="signUP"/> 
</form>

</body>
</html>