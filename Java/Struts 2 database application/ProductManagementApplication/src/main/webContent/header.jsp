<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> --%>
<html>
<head>
<meta>
<title>Insert title here</title>
</head>
<body>
<%
if (session.getAttribute("loggedinUser") == null) {
	response.sendRedirect("login.jsp");
}
%>

	<div class="topnav">
	  <a href="welcomeAction">Home</a>
	  <a href="addProduct.jsp">Add Product</a>
	  <a href="logoutAction" style="float:right">Logout</a>
	</div>

</body>
</html>
