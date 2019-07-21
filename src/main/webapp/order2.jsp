<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ajax提交登录页面</title>
<script src="${pageContext.request.contextPath}/jquery-3.3.1.js"></script>
</head>
<body style="text-algin:center">
	
	<h1 style="color:red">订单界面</h1>

	
		<form id="form1">
	   订单号 <input type="text" id="orderno" name="orderno" value="${orderno}" >
		被保险人 <input type="text" name="userName" >
		</br>
		保费 <input type="text" name="premium" >
		</br>
		<button type="button" onclick="login()" >提交</button>
	</form>
	
</body>
<script type="text/javascript">
function login(){
$.ajax({
    type: "post",
    url: "${pageContext.request.contextPath}"+"/LoginServlet",
    data: $('#form1').serialize(),
    success: function (data, status) {
        if (status == "success") {
            alert('提交数据成功');
        }
       $('#orderno').val(data);
    },
    error: function () {
        alert('编辑失败');
    },
    complete: function () {

    }

});
}

</script>
</html>