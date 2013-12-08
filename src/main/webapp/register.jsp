<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>demo</title>
</head>
<body>
	<s:actionmessage/>
	<s:form action="register" namespace="/" method="post">
		<s:label value="昵称:" for="register_user_nickname"></s:label>
		<s:textfield name="user.nickname"></s:textfield>
		<s:label value="帐号:" for="register_user_username"></s:label>
		<s:textfield name="user.username"></s:textfield>
		<s:label value="密码:" for="register_user_password"></s:label>
		<s:password name="user.password"></s:password>
		<s:label value="确认密码:" for="register_password"></s:label>
		<s:password id="password"></s:password>
		<s:submit value="注册"></s:submit>
	</s:form>
	<a href="index.jsp">登录</a>
</body>
</html>
