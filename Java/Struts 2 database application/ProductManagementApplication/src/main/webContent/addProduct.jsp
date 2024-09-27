<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Product</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

    <%@ include file="header.jsp" %>

    <div align="center">
        <h2>Add New Product</h2>
        <s:form action="addAction">
            <s:textfield key="global.id" name="id" />
            <s:textfield key="global.name" name="name" />
            <s:textfield key="global.category" name="category" />
            <s:textfield key="global.price" name="price" />
            <s:submit key="global.add" />
        </s:form>
    </div>
    <s:a action="changeLocaleAction">
        <s:param name="request_locale" value="'en'" />
        English
    </s:a>
    <s:a action="changeLocaleAction">
        <s:param name="request_locale" value="'ja'" />
        Japanese
    </s:a>
</body>
</html>
