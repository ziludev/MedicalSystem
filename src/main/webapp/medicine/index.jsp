<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
    pageContext.setAttribute("path", path);

    String imgPath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + "/Hospital-pic/";
    pageContext.setAttribute("imgPath", imgPath);
%>
<!DOCTYPE html>
<html>
<base href="<%=this.getServletContext().getContextPath() %>/medicine/">
<head>
    <title>药品查询</title>
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
            $("#newNav").click(function () {
                window.location.href = "${pageContext.request.contextPath}/medicine/add.jsp"
            });
            // 清空查询条件
            $("#ret").click(function () {
                $("#name").val("");
                $("#type").val("0");
            });
            // 全选、全不选
            $("#checkall").click(function () {
                $("tbody input").prop("checked", $(this).prop("checked"));
            })
            // 批量删除
            $("#delAll").click(function () {
                var ids = [];
                $("tbody input:checked").each(function (index, item) {
                    var id = $(item).val();
                    ids.push(id);
                });
                if (ids.length == 0) {
                    alert("请选择要删除的行");
                }else {
                    // 给后台发送ajax
                    $.ajax({
                        type:"POST",
                        url:"${pageContext.request.contextPath}/medicine/batchDelete",
                        data:{"ids":ids,"_method":"delete"},
                        success:function (message) {
                            if (message.statusCode == 200) {
                                window.location.href="${pageContext.request.contextPath}/medicine/search";
                            }
                        }
                    })
                }
            });
        });
    </script>
</head>
<body>

<form action="${pageContext.request.contextPath}/medicine/search" method="get" class="definewidth m20">
    <table class="table table-bordered table-hover definewidth m10">
        <tr>
            <td width="10%" class="tableleft">药品名称：</td>
            <td><input type="text" id="name" name="name" value="${name }"/></td>

            <td width="10%" class="tableleft">药品类型：</td>
            <td>
                <select name="type" id="type">
<%--                    <c:if test="${medicine.type == 1 }">selected='selected'</c:if>--%>
                    <option value="0">==请选择==</option>
                    <option value="1" <c:if test="${type == 1 }">selected='selected'</c:if>>处方药</option>
                    <option value="2" <c:if test="${type == 2 }">selected='selected'</c:if>>中药</option>
                    <option value="3" <c:if test="${type == 3 }">selected='selected'</c:if>>西药</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <center>
                    <input id="find" name="find" type="submit" class="btn btn-primary" value="查询"/>
                    <input id="ret" name="ret" type="button" class="btn btn-primary" value="清空"/>
                </center>
            </td>
        </tr>
    </table>
</form>

<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th><input type="checkbox" id="checkall"></th>
        <th>药品编号</th>
        <th>药品名称</th>
        <th>图片</th>
        <th>药品类型</th>
        <th>简单描述</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.list}" var="medicine">
        <tr>
            <th><input type="checkbox" value="${medicine.mid}"></th>
            <td>${medicine.mid}</td>
            <td>${medicine.name}</td>
            <td>
                <img src="${pageContext.request.contextPath}/img/${medicine.picture}" width="50px" height="20px"/>
            </td>
            <td>
                <c:if test="${medicine.type == 1}">处方药</c:if>
                <c:if test="${medicine.type == 2}">中药</c:if>
                <c:if test="${medicine.type == 3}">西药</c:if>
            </td>
            <td>${medicine.descs}</td>
            <td>
                <a href="${pageContext.request.contextPath}/medicine/detail/${medicine.mid}">详情</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a
                    href="${pageContext.request.contextPath}/medicine/edit/${medicine.mid}">编辑</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <th colspan="5">
            <div class="inline pull-right page">
                <a href="${pageContext.request.contextPath}/medicine/search?pageNum=1${queryString}">首页</a>
                <a href="${pageContext.request.contextPath}/medicine/search?pageNum=${page.prePage}${queryString}">上一页</a>
                <a href="${pageContext.request.contextPath}/medicine/search?pageNum=${page.nextPage}${queryString}">下一页</a>
                <a href="${pageContext.request.contextPath}/medicine/search?pageNum=${page.pages}${queryString}">尾页</a>
                &nbsp;&nbsp;&nbsp;
                共<span class='current'>${page.total}</span>条记录
                <span class='current'>${page.pageNum}/${page.pages}</span>页
            </div>
            <div>
                <button type="button" class="btn btn-success" id="newNav">添加新药</button>
                <button type="button" class="btn btn-success" id="delAll">批量删除</button>
            </div>

        </th>
    </tr>
</table>

</body>
</html>
