<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<script type="text/javascript" src="/script/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$("#index").ajaxForm(function(){
			alert(12);
		});
	});
</script>
</head>
<body>
	<s:form id="index" namespace="/index" action="login">
		<s:textfield label="IMEI" name="imei"></s:textfield>
		<s:submit value="登录"></s:submit>
		<input type="button" value="Ajax" />
	</s:form>

</body>
</html>
