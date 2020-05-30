<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
    String path = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
    pageContext.setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=this.getServletContext().getContextPath() %>/register/">
    <title>门诊查询</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css"/>
    <link rel="stylesheet" type="text/css" href="../Css/style.css"/>
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }

        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
    <script type="text/javascript">
        $(function () {
                $("#ret").click(function () {
                    $("#rid").val(" ");
                    $("#name").val(" ");
                    $("#department").val("0");
                });
            $("#newNav").click(function () {
                window.location.href = "${pageContext.request.contextPath}/register/add.jsp"

            });
            $("#checkAll").click(function () {
                $("tbody input").prop("checked",$(this).prop("checked"));
            });
            $("#delAll").click(function () {
                const idArray = [];
                $("tbody input:checked").each(function (index,item) {
                    let id = $(item).val();
                    alert(id);
                    idArray.push(id);
                });
                if(idArray.length === 0){
                    alert("请选择要删除的数据");
                }else {
                    //发送ajax请求
                    $.ajax({
                        type:"POST",
                        url:"${pageContext.request.contextPath}/register/batchDelete",
                        data:{"idArray":idArray,"_method":"delete"},
                        success:function (msg) {
                            if (msg.statusCode===200){
                                window.location.href = "${pageContext.request.contextPath}/register/search";
                            }
                        }
                    });
                }
            });
            }
        )
    </script>
</head>
<body>

<form action="${pageContext.request.contextPath}/register/search" method="get" class="definewidth m20">
<%--    <input name="method" value="findRegisterByPage" type="hidden"/>--%>
    <table class="table table-bordered table-hover definewidth m10">
        <tr>
            <td width="10%" class="tableleft">病历号：</td>
            <td><input type="text" id="rid" name="rid" value="${r.rid }"/></td>

            <td width="10%" class="tableleft">姓名：</td>
            <td><input type="text" id="name" name="name" value="${r.name }"/></td>

            <td width="10%" class="tableleft">科室：</td>
            <td>
                <select name="department" id="department">
                    <option value="0">==请选择==</option>
                    <option value="1" <c:if test="${r.department ==1 }">selected='selected'</c:if>>急诊科</option>
                    <option value="2" <c:if test="${r.department ==2 }">selected='selected'</c:if>>儿科</option>
                    <option value="3" <c:if test="${r.department ==3 }">selected='selected'</c:if>>妇科</option>
                    <option value="4" <c:if test="${r.department ==4 }">selected='selected'</c:if>>皮肤科</option>
                    <option value="5" <c:if test="${r.department ==5 }">selected='selected'</c:if>>内分泌科</option>
                    <option value="6" <c:if test="${r.department ==6 }">selected='selected'</c:if>>牙科</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="6">
                <center>
                    <input id="find" name="find" type="submit" class="btn btn-primary" value="查询"/>
                    <input name="ret" id="ret" type="button" class="btn btn-primary" value="清空"/>
                </center>
            </td>
        </tr>
    </table>
</form>

<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th><input type="checkbox" id="checkAll" ></th>
        <th>病例号</th>
        <th>病人姓名</th>
        <th>主治医生</th>
        <th>挂号时间</th>
        <th>挂号科室</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${registerPage.list}" var="register">
        <!-- 1-急诊 2-儿科 3-妇科 4-皮肤科 5-内分泌科 6-牙科 -->
        <tr>
            <td><input type="checkbox" value="${register.rid}"></td>
            <td>${register.rid}</td>
            <td>${register.name}</td>
            <td>${register.doctor.name}</td>
            <td>
                <fmt:formatDate value="${register.registerdate}" pattern="yyyy-MM-dd"/>
            </td>
            <td>
                <c:if test="${register.department ==1}">急诊科</c:if>
                <c:if test="${register.department ==2}">儿科</c:if>
                <c:if test="${register.department ==3}">妇科</c:if>
                <c:if test="${register.department ==4}">皮肤科</c:if>
                <c:if test="${register.department ==5}">内分泌科</c:if>
                <c:if test="${register.department ==6}">牙科</c:if>
            </td>
            <td>
                <c:if test="${register.status ==1}">已挂号</c:if>
                <c:if test="${register.status ==2}">已住院</c:if>
                <c:if test="${register.status ==3}">已出院</c:if>
                <c:if test="${register.status ==4}">已结算</c:if>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/register/detail/${register.rid}">详情</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/register/edit/${register.rid}">编辑</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <th colspan="5">
            <div class="inline pull-right page">
                <a href="${pageContext.request.contextPath}/register/search?pageNum=1${queryString}">首页</a>
                <a href="${pageContext.request.contextPath}/register/search?pageNum=${registerPage.prePage}${queryString}">上一页</a>
                <a href="${pageContext.request.contextPath}/register/search?pageNum=${registerPage.nextPage}${queryString}">下一页</a>
                <a href="${pageContext.request.contextPath}/register/search?pageNum=${registerPage.pages}${queryString}">尾页</a>
                &nbsp;&nbsp;&nbsp;
                共<span class='current'>${registerPage.total} </span>条记录
                <span class='current'>${registerPage.pageNum} / ${registerPage.pages} </span>页
            </div>
            <div>
                <button type="button" class="btn btn-success" id="newNav">门诊挂号</button>&nbsp;&nbsp;&nbsp;
                <button type="button" class="btn btn-success" id="delAll" >批量删除</button>
            </div>
        </th>
    </tr>
</table>

</body>
</html>
