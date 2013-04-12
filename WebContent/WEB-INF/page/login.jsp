<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登录</title>
</head>
	<script language="javascript"> 
		function loadimage(){ 
		document.getElementById("randImage").src = "../util/rand.jsp?rd="+Math.random(); 
		} 
	</script> 
</head> 
<body> 

		
	<s:form action="manage_login" method="post" namespace="/user">
		请输入用户名<s:textfield type="text" name="user.account"/>
		请输入密码<s:textfield type="password" name="user.password"/>
		<img src="../util/rand.jsp" id="randImage" name="randImage" width="60" height="20" border="1"/>
		请输入验证码：<s:textfield type="text" name="code"/>
		<s:submit value="登录"/>
	</s:form>



  
</body> 
</html>