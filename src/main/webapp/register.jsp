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
	<s:form action="register" namespace="/index" method="post">
		<s:label value="IMEI:" for="register_imei"></s:label>
		<s:textfield name="imei"></s:textfield>
		<s:label value="昵称:" for="register_nickname"></s:label>
		<s:textfield name="nickname"></s:textfield>
		<s:submit value="注册"></s:submit>
	</s:form>

</body>
</html>
