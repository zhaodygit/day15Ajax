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

	function post() {
		var request = ajaxFunction();
		request.open("post", "DemoServlet01", true);
		request.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");
		request.send("name=aobama&age=19");
	}
</script>
</head>
<body>
	<h3>
		<a href="javascript:void(0)" onclick="post();">ajax发生POST请求</a>
	</h3>
</body>
</html>