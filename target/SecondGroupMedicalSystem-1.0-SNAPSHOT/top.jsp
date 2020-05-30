<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			*{
				margin: 0;
				padding: 0;
			}
			.c1{
				color: white;
				font-size: 20px;
				font-weight: bold;
				padding-left: 20px;
				line-height: 50px;
				width: 100%;
				height: 50px;
				background-color:darkslateblue
			}
			.c1 span{
				color: white;
				font-size: 14px;
				font-weight: bold;
				float: right;
				padding-right: 50px;
			}
			.c1 span a{
				color: aliceblue;
				text-decoration: none;
			}
			.c2{
				width: 100%;
				height: 30px;
				background-color:#eaeaea;
			}
		</style>
	</head>
	<body>
		<div class="c1">
			优秀就业-在线医疗管理系统
			<span id="">
				欢迎您，${loginUser.name }！
				<a href="${pageContext.request.contextPath}/user/logout" target="_parent">【退出】</a>
			</span>
		</div>
		<div class="c2"></div>
	</body>
</html>
