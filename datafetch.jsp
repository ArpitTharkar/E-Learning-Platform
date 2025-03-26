<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border ="2">
<tr>
<th>Srno</th>
<th>subject</th>
<th>subdescrit</th>
<th>uploaddate</th>
<th>duedate</th>
<th>classstu</th>
<th>div</th>
<th>uploadby</th>
</tr>
<c:forEach var="cor" items="${data}">
<tr>
<td>${cor.srno}</td>
<td>${cor.sub}</td>
<td>${cor.subdescrit}</td>
<td>${cor.uploaddate}</td>
<td>${cor.duedate}</td>
<td>${cor.classstu}</td>
<td>${cor.dive}</td>
<td>${cor.uploadby}</td>
<td> <a href="<c:url value='/${cor.srno}'/>">Edit</a></td>
<td> <a href="<c:url value='delete/${cor.srno}'/>">Delete</a></td>

</tr>
</c:forEach>

</table>



<!-- private  int srno;
	private String sub;
	private String subdescrit;
	private String uploaddate;
	private String duedate;
	private String classstu;
	private String div;
	private String uploadby; -->
</body>
</html>