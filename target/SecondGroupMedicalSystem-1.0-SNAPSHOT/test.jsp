<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
   <script type="text/javascript" src="Js/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="Js/jquery.validate.js"></script>
    <style type="text/css">
      .error {
         color: red;
         font-size: 14px;
      }
    </style>
</head>
<body>
  
  <form id="da" action="sd" method="get">
	    用户名：<input type="text" name="username"/>
	     密码：<input type="password" id="pwd1" name="password"/>
	     确认密码：<input type="password" name="pwd">
	    邮箱：<input type="text" name="email"/>
     <input type="submit" value="提交">
  </form>
  
  <script type="text/javascript">
   $("#da").validate({
	   rules:{
		   username: {
			 required: true,
			 minlength: 3
		   },
		   email: {
			   required: true,
			   email: true
		   },
		   pwd: {
			   required: true,
			   equalTo: "#pwd1"
		   }
	   },
	   messages:{
		   username:{
			   required: "该字段不可为空",
			   minlength: "最少3个字符"
		   }, 
		   email: {
			   required: "邮箱不能为空",
			   email: "请输入合法邮箱"
		   }, 
		   pwd: {
			   required: "请输入确认密码",
			   equalTo: "密码和确认密码要保持一致"
		   }
	   },
	   errorElement:"error"
   });
    
  </script>
  
  
</body>
</html>