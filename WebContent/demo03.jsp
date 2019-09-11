<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function ajaxFunction() {
		var xmlHttp;
		try { // Firefox, Opera 8.0+, Safari
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			try {// Internet Explorer
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
				}
			}
		}
	
		return xmlHttp;
	}
	
	function checkUserName(obj){
		var request = ajaxFunction();
		request.open("post","CheckUserNameServlet", true);
		request.setRequestHeader("Content-type",
		"application/x-www-form-urlencoded");
		request.send("name="+ obj.value);
		
		request.onreadystatechange=function(){
			if (request.readyState==4 && request.status==200) {
		    	var data = request.responseText;
				if(data==1){
					document.getElementById("span01").innerHTML = "<font color='red'>用户名已存在!</font>";
				}else{
					document.getElementById("span01").innerHTML = "<font color='green'>用户名可用!</font>";
				}
		    }

		}
	}
</script>
</head>
<body>
	<table border="1" width="500">
		<tr>
			<td>用户名:</td>
			<td>
				<input type="text" name="name" id="name" onblur="checkUserName(this)"> 
				<span id="span01"></span>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="提交">
			</td>
		</tr>
	</table>
</body>
</html>