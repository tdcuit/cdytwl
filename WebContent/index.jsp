<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  	<a href="http://localhost:8081/cdytwl/userinfo/addUser.jsp">�����û�</a>
    <form action="userinfo!login.action" namespace="/">
    	������<input type="text" name="user.username"><br/>
    	���룺<input type="password" name="user.password"><br/>
    	<input type="submit" value="�ύ">  <input type="reset" value="����">
    </form>
    
    
    <div>
    	<h1>���Է���������� ������Ӧ�û�����ռ�</h1></BR>
create user cdytwl identified by cdytwl;</BR>
grant connect,resource,dba to cdytwl; </BR>

create tablespace cdytwl  </BR>
logging  
datafile 'H:\orcl\oradata\cdytwl\cdytwl.dbf' </BR>
size 200m  </BR>
autoextend on  </BR>
next 50m maxsize 20480m  </BR>
extent management local;</BR>

alter user cdytwl default tablespace cdytwl;</BR>


create sequence HIBERNATE_SEQUENCE</BR>
minvalue 1</BR>
maxvalue 9999999999999999999999999999</BR>
start with 21</BR>
increment by 1</BR>
cache 20;</BR>

    </div>
  </body>
</html>
