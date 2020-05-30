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
<head>
    <title>修改药品</title>
    <base href="<%=this.getServletContext().getContextPath() %>/medicine/">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css"/>
    <link rel="stylesheet" type="text/css" href="../Css/style.css"/>
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>
    <script type="text/javascript" src="../Js/ckeditor/ckeditor.js"></script>


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

    <script>
        $(function () {
            $('#backid').click(function () {
                window.location.href = "${pageContext.request.contextPath}/medicine/search";
            });

        });

    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/medicine/edit" method="post" class="definewidth m20" enctype="multipart/form-data">
    <input type="hidden" name="mid" value="${medicine.mid}"/>
<%--    <input type="hidden" name="_method" value="PUT"/>--%>
    <table class="table table-bordered table-hover definewidth m10">
            <tr>
                <td width="10%" class="tableleft">药品编号</td>
                <td><input type="text" name="mid"  readonly="readonly" value="${medicine.mid}"/></td>
            </tr>
        <tr>
            <td width="10%" class="tableleft">图片</td>
            <td>
                <input type="hidden" name="oldpicture"/>
                <input type="file" name="photo"/>
                <img src="${pageContext.request.contextPath}/img/${medicine.picture}" width="80px" height="50px">
            </td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">进价</td>
            <td><input type="text" name="inprice" value="${medicine.inprice}"/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">售价</td>
            <td><input type="text" name="salprice" value="${medicine.salprice}"/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">药品名称</td>
            <td><input type="text" name="name" value="${medicine.name}"/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">药品类型</td>
            <td>
                <input type="radio" name="type" value="1" <c:if test="${medicine.type == 1}">checked='checked'</c:if>/>处方药&nbsp;&nbsp;&nbsp;
                <input type="radio" name="type" value="2" <c:if test="${medicine.type == 2}">checked='checked'</c:if>/>中药&nbsp;&nbsp;&nbsp;
                <input type="radio" name="type" value="3" <c:if test="${medicine.type == 3}">checked='checked'</c:if>/>西药
            </td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">简单描述</td>
            <td><input type="text" name="descs" value="${medicine.descs}"/></td>
        </tr>

        <tr>
            <td width="10%" class="tableleft">保质期</td>
            <td><input type="text" name="qualitydate" value="${medicine.qualitydate}"/>月</td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">详细描述</td>
            <td><textarea name="description">${medicine.description}</textarea></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">生产厂商</td>
            <td><textarea name="producefirm">${medicine.producefirm}</textarea></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">服用说明</td>
            <td><input type="text" name="readme" value="${medicine.readme}"/></td>
        </tr>

        <tr>
            <td width="10%" class="tableleft">备注</td>
            <td><textarea name="remark">${medicine.remark}</textarea></td>
        </tr>
        <tr>
            <td colspan="2">
                <center>
                    <%--				<button type="submit" class="btn btn-primary" type="button">保存</button> &nbsp;&nbsp;--%>
                    <input name="save" id="save" type="submit" class="btn btn-primary" value="保存"/>
                    <button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
                </center>
            </td>
        </tr>
    </table>
</form>
</body>
</html>