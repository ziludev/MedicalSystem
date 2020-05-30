<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
    pageContext.setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>
    <title>优就业-在线医疗管理系统</title>
    <meta charset="UTF-8">
    <link rel="icon" href="Images/logo_favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href="Css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="Css/bootstrap-responsive.css"/>
    <link rel="stylesheet" type="text/css" href="Css/style.css"/>
    <script type="text/javascript" src="Js/jquery.js"></script>
    <script type="text/javascript" src="Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="Js/bootstrap.js"></script>
    <script type="text/javascript" src="Js/ckform.js"></script>
    <script type="text/javascript" src="Js/common.js"></script>
    <script type="text/javascript" src="Js/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="Js/jquery.validate.js"></script>
    <script type="text/javascript" src="Js/messages_zh.js"></script>

    <style type="text/css">
        body {
            padding-top: 140px;
            padding-bottom: 40px;
            background-color: #f5f5f5;
            font-family: "微软雅黑";
            background-color: buttonhighlight;
        }

        .form-signin {
            max-width: 600px;
            padding: 19px 29px 29px;
            margin: 0 auto 20px;
            background-color: #fff;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            background: rgba(255, 255, 255, 0.5);
        }

        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
            font-size: 24px;
            margin-left: 90px;
        }

        .form-signin .form-signin-heading {
            margin-bottom: 10px;
            font-size: 24px;
            margin-left: 200px;
        }

        .form-signin input[type="text"],
        .form-signin input[type="password"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
        }


        #message {
            font-size: 14px;
            color: red;
            margin-left: 40px;
        }

        .input-block-level {
            width: 300px;
            margin-left: 40px;
        }

        .input-medium {
            margin-left: 40px;
        }

        .code_images {
            width: 115px;
            height: 35px;
            margin-top: -15px;
            margin-left: 10px;
        }

        .error {
            color: red;
            font-size: 12px;
        }

        /*让错误标签在一行*/
        label {
            display: inline;
            margin-left: 14px;
        }

    </style>
</head>
<body>
<div class="container">
    <form id="form1" class="form-signin" method="post" action="${pageContext.request.contextPath}/user/regist">
        <input type="hidden" name="method" value="regist">
        <h2 class="form-signin-heading">管理员注册</h2>
        姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：
        <input type="text" name="name" class="input-block-level" placeholder="账号">
        <br/>
        密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：
        <input id="password" type="password" name="password" class="input-block-level" placeholder="密码">
        <br/>
        确认密码：<input type="password" name="password2" class="input-block-level" placeholder="确认密码">
        <br/>
        用&nbsp;&nbsp;户&nbsp;&nbsp;名：<input type="text" id="username" name="username" class="input-block-level"
                                           placeholder="用户名">
        <span id="username_msg"></span><br/>
        邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：<input type="text" id="email" name="email" class="input-block-level" placeholder="邮箱">
        <span id="email_msg"></span><br/>
        <p style="text-align: center;">
            <input id="login" type="button" value="注册" name="login" class="btn btn-large btn-info"
                   style="width: 100px;"/>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="reset" type="reset" value="清空" name="login" class="btn btn-large btn-info"
                   style="width: 100px;"/>
        </p>
    </form>
</div>

<script type="text/javascript">
    $("#login").click(function () {
        $("#form1").submit();
    });

    //验证姓名和密码
    $("#form1").validate({
        // 验证规则
        rules: {
            name: {
                required: true
            },
            password: {
                required: true,
                rangelength: [8, 16]
            },
            password2: {
                required: true,
                rangelength: [8, 16],
                equalTo: "#password"
            }
        },
        // 验证规则不符合时候的提示信息
        messages: {
            name: {
                required: "姓名不能为空"
            },
            password: {
                required: "密码不能为空",
                rangelength: "密码必须为8-16个字符"
            },
            password2: {
                required: "确认密码不能为空",
                // rangelength: "密码必须为8-16个字符",
                equalTo: "两次输入密码不一致"
            }
        }
    });

    // 验证用户名
    $("#username").blur(function () {
        var username = $(this).val();
        if (username == null || username == "") {
            $("#username_msg").text("用户名不能为空").css({
                "color": "red",
                "font-size": "12px",
                "margin-left": "14px"
            });
            return;
        }
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/user/info",
            data: {"username": username},
            success: function (message) {
                if (message.statusCode == 200) {
                    $("#username_msg").text(message.message).css({
                        "color": "green",
                        "font-size": "12px",
                        "margin-left": "14px"
                    });
                } else {
                    $("#username_msg").text(message.message).css({
                        "color": "red",
                        "font-size": "12px",
                        "margin-left": "14px"
                    });
                }
            }
        });
    });

    // 验证邮箱
    $("#email").blur(function () {
        var email = $(this).val();
        if (email == null || email == "") {
            $("#email_msg").text("邮箱不能为空").css({
                "color": "red",
                "font-size": "12px",
                "margin-left": "14px"
            });
            return;
        }
        // 正则表达式
        var emailRegex = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
        if (!emailRegex.test(email)) {
            $("#email_msg").text("邮箱格式不正确").css({
                "color": "red",
                "font-size": "12px",
                "margin-left": "14px"
            });
            return;
        }
        // 向后端发送Ajax请求，验证邮箱唯一
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/user/checkEmail",
            data: {"email":email},
            success:function (message) {
                if (message.statusCode == 200) {
                    $("#email_msg").text(message.message).css({
                        "color": "green",
                        "font-size": "12px",
                        "margin-left": "14px"
                    });
                } else {
                    $("#email_msg").text(message.message).css({
                        "color": "red",
                        "font-size": "12px",
                        "margin-left": "14px"
                    });
                }
            }
        })
    });

</script>

</body>
</html>