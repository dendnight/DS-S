<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<script type="text/javascript" src="script/jquery.js"></script>
<script type="text/javascript" src="script/jquery.form.js"></script>
<script type="text/javascript">
	$(function() {
		// 提交表单
		$("#login").click(function() {
			$("#index").ajaxSubmit(function(data) {
				alert(data.msg);
			});
		});

	});
</script>
<style type="text/css">
	body{background:#f2f2f2;}
	.actionMessage{
		color:#ff0000;
	}
</style>
</head>
<body>
	<s:actionmessage/>
	<s:form id="index" namespace="/" action="login">
		<s:label value="帐号:" for="register_user_username"></s:label>
		<s:textfield name="user.username"></s:textfield>
		<s:label value="密码:" for="register_user_password"></s:label>
		<s:password name="user.password"></s:password>
		<s:submit value="登录"></s:submit>
	</s:form>
	<a href="register.jsp">注册</a>
</body>
</html>
