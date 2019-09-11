<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	function load(){
		//$("#div1").load("DemoServlet02");
		$('#put1').load("DemoServlet02",function(responseTxt,statusTxt,xhr){
			$('#put1').val(responseTxt);
		});
	}
</script>
</head>
<body>
	<a href="javascript:void(0)" onclick="load()">加载数据</a>
	<div id="div1">
	
	</div>
	<input type="text" id="put1">
</body>
</html>