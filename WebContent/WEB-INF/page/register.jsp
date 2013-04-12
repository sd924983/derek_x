<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>注册页面</title>
</head>
<body>
	<s:form action="manage_addUser" namespace="/user" method="post">
		用户名：<s:textfield type="text" name="user.account"/></br>
		密码：<s:textfield type="password" name="user.password"/>	</br>
		性别:<s:radio list="#{'WOMAN':'女','MAN':'男'}" listKey="key" listValue="value" name="user.gender"></s:radio>
		<s:submit value="提交"/>
	</s:form>
</body>
</html>
