<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
	<form action="login" method="post">
	<div>
		用户名：<input type="text" >
	</div>
	<div>
		密码:<input type="password">
	</div>
	<div>
		<input type="submit"  value="登陆">
	</div>
	<div>
		${result}
	</div>
	</form>
	
	<form action="freemarker" method="get">
	
		 <input type="submit" value="freemarker测试"  >	
	</form>
</body>
</html>