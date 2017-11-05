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
    <title>${sessionScope.user.nickname}的文件资料</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="dist/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
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

<table class="table table-hover">
    <tr>
        <td>序号</td>

        <td>文件名</td>
        <td>操作</td>
    </tr>
    <c:forEach var="file" items="${requestScope.files}">
        <tr>
            <td><c:out value="${file.fid}"/></td>
            <td><img src="${file.icon}" alt="无法加载" width="20px" height="20px">
                <c:out value="${file.name}"/></td>
            <td>下载</td>
        </tr>
        <script type="text/javascript">

        </script>
    </c:forEach>


</table>


<jsp:include page="common/coryright.jsp"/>
</body>
</html>
