<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function show(){
	var name=document.getElementById("name").value;   
	var passwd=document.getElementById("passwd").value;
	var url ="/MyWebStudy/login?" + "name="+name+"&passwd="+passwd
	if(name.length==0||passwd.length==0){
		alert("请输入用户名密码！");
		return null;
	}
	document.getElementById("tip").hidden=false
	var xmlhttp = window.XMLHttpRequest ? new XMLHttpRequest() : new ActiveXObject('Microsoft.XMLHTTP');
	xmlhttp.open("POST", url, true);
	xmlhttp.onreadystatechange = function ()
	{
	 if (xmlhttp.readyState == 4)
	 {
	   if (xmlhttp.status == 200)
	   {
		 document.getElementById("tip").hidden=true
	     alert(xmlhttp.responseText);
	     
	   }
	   else
	   {
		   document.getElementById("tip").hidden=true
	     alert("AJAX服务器返回错误！");
	   }
	 }
	}
	xmlhttp.send();
	}


function show2(){
	
	var url ="/MyWebStudy/logout";
	var xmlhttp = window.XMLHttpRequest ? new XMLHttpRequest() : new ActiveXObject('Microsoft.XMLHTTP');
	xmlhttp.open("POST", url, true);
	xmlhttp.onreadystatechange = function ()
	{
	 if (xmlhttp.readyState == 4)
	 {
	   if (xmlhttp.status == 200)
	   {
	     alert(xmlhttp.responseText);
	     
	   }
	   else
	   {
	     alert("AJAX服务器返回错误！");
	   }
	 }
	}
	xmlhttp.send();
	}
</script>
</head>
<body>
<form action="" method="post">
请输入用户名：<input type="text" name="name" id="name"> <br>
请输入密码：<input type="text" name="passwd" id="passwd"> <br>
<input type="button" onclick="show();" value="登录"><br>
<span class="tip" id="tip" hidden="true">正在登陆中，请稍等。。。</span>
<input type="button" onclick="show2();" value="退出登陆">
<h3>用户名：⎛⎝fkj⎠⎞  密码：⎛⎝password⎠⎞</h3>
</form>
</body>
</html>