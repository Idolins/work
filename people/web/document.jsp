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
</head>
<body>
<jsp:include page="common/nav.jsp"/>
<div class="col-md-12">
    <div class="col-md-2">
        <p>文档</p>
    </div>
    <div class="col-md-10">
        <button class="btn btn-info">上传文件</button>
    </div>
</div>


<jsp:include page="common/coryright.jsp"/>
</body>
</html>
