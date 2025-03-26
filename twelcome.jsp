<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login successfully of teacher</h1>

<!-- private  int srno;
	private String sub;
	private String subdescrit;
	private String uploaddate;
	private String duedate;
	private String classstu;
	private String div;
	private String uploadby; -->
	<form action="addcou"method="post">
		Subject :<input type="text" name="sub"><br><br>
		Sub-Decsription :<input type="text"name="subdescrit"><br><br>
		Upload Date :<input type="text"name="uploaddate"> <br> <br>
		Due-Date : <input type="text"name="duedate"><br> <br>
		class of student : <input type="text"name="classstu"><br> <br>
		div : <input type="text"name="dive"><br> <br>
		Upload-by : <input type="text"name="uploadby"><br> <br>
		<input type="submit" value="detail"><br><br>
	</form>
	<form action="datafetch" method="get">
	<input type="submit" value="show">
	</form>
</body>
</html>