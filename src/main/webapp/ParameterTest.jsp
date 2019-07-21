<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  //request.setCharacterEncoding("utf-8");
%>
<form action="/MyWebStudy/ParameterTest" method="post">
请输入一个值：<input type="text" name="name"><br>
请输入一个值：<input type="text" name="name2"><br>
请输入一个值：<input type="text" name="name3"><br> <input type="submit" value="提交">
</form>
<h2>顺便写上jsp跳转的方法，跳转到index.jsp,内容在源码里，注释掉了。。。</h2>

<%
//response.sendRedirect("/MyWebStudy/index.jsp");

//response.setHeader("Location","/MyWebStudy/index.jsp");
//<jsp:forward page="/MyWebStudy/index.jsp" />
%>

</body>
</html>