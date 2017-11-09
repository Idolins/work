<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/11/5
  Time: 14:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${sessionScope.userInfo.nickname}的文件资料</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="dist/css/bootstrap.min.css">

    <script src="dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        $().ready(function () {
            $('#all').click(function () {
                if ($(this).attr("checked") === 'checked') {
                    $(":checkbox[name='attachmentPath']").attr('checked', false)
                } else {
                    $(":checkbox[name='attachmentPath']").attr('checked', true)
                }
                //$(":checkbox[name='attachmentPath']:checked").attr("checked", true)
            })
        })

    </script>
</head>
<body>
<jsp:include page="common/nav.jsp"/>
<div class="col-md-12">
    <div class="col-md-11">
        <h2>文档</h2>
    </div>
    <div class="col-md-1 right">
        <a class="btn  btn-link" href="uploadFile.jsp">上传文件</a>
    </div>
</div>
<form action="${pageContext.request.contextPath}/downloadMultiFile" method="post">

    <table class="table table-hover">
        <tr>
            <td>
                <input type="checkbox" name="attachmentPath" id="all" onchange="checkFile()">全选
            </td>
            <td>序号</td>
            <td>文件名</td>
            <td>操作</td>
        </tr>
        <c:forEach var="file" items="${requestScope.files}">
            <tr>
                <td>
                    <input type="checkbox" name="attachmentPath" value="${file.path}">
                </td>
                <td><c:out value="${file.fid}"/></td>
                <td><img src="${file.icon}" alt="无法加载" width="20px" height="20px">
                    <c:out value="${file.name}"/></td>
                <td>
                    <a href="downloadt.action?fileName=${file.path}">
                        下载</a>
                    <a href="deletefile?fileId=${file.fid}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <input type="submit" value="下载文件" id="submit">
</form>


<jsp:include page="common/copyright.jsp"/>
</body>
</html>
