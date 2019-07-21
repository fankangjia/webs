<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>submit提交订单页面</title>
</head>
<body style="text-algin:center">
	
	<h1 style="color:red">订单</h1>
	<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
	    <input type="text" name="orderno" value="${orderno}" >订单号
	    </br>
		<input type="text" name="userName" value="${userName}" >保险人
		</br>
		<input type="text" name="premium" value="${premium}" >保费
		
		</br>
		<input type="text" name="type"  >提交方式
		</br>
		<button type="submit" >提交</button>
	</form>
	
</body>
</html>