<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="style/oa.css" rel="stylesheet" type="text/css">

<title>所有用户</title>
</head>
<body>
<center>
	
<table border="1">

	<tr>
	<td width="206"><div align="center">编    号</div></td>
	<td width="102"><div align="center">姓     名</div></td>
	<td width="90"><div align="center">密      码</div></td>	
	<td width="136"><div align="center">操     作</div></td>	
	</tr>
	<s:iterator value="users" id="u">
		<tr>
		<td><s:property value="#u.id"/></td>
		<td><s:property value="#u.username"/></td>
		<td><s:property value="#u.password"/></td>
		<td><div align="center">
				<s:a href="userinfo!findUserForUpdate.action?id=%{#u.id}">修改用户</s:a>
				<s:a href="userinfo/addUser.jsp">增加用户</s:a>  
				<s:a href="userinfo!deleteUser.action?id=%{#u.id}">删除用户</s:a>
			</div>
		</td>
		</tr>
	</s:iterator>	
</table>

<br>

</center>
</body>
</html>