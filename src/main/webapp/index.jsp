<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<s:form namespace="/index" action="login">
		<s:textfield name="imei"></s:textfield>
		<s:submit value="登录"></s:submit>
	</s:form>

</body>
</html>
