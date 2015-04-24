<%@ page language="java" import="Java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<title>eidt user</title>
	</head>
	<body>
		<center>
			eidt user:<br>
			<s:form action="userinfo!updateUser.action" namespace="/">			
				<s:hidden name="user.id" value="%{user.id}"></s:hidden>
				<s:textfield name="user.username" label="username" value="%{user.username}" ></s:textfield>						
				<s:password name="user.password" label="password" value="%{user.password}" ></s:password>
				<s:submit value="submit"></s:submit>
			</s:form>
		</center>
	</body>
</html>