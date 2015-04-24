<%@ page language="java" import="Java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<title>add user</title>
	</head>
	<body>
		<center>
			add user: </br>
			<s:form action="userinfo!addUser.action" namespace="/" method="post">
				<s:textfield name="user.username" label="userName"></s:textfield>
				<s:password name="user.password"  label="password"></s:password>
				<s:submit value="submit"/>
			</s:form>
		</center>
	</body>
</html>