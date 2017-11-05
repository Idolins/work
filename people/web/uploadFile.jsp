<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  ~ Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
  ~ Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
  ~ Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
  ~ Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
  ~ Vestibulum commodo. Ut rhoncus gravida arcu.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/11/5
  Time: 15:37
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="dist/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="common/nav.jsp"/>
<div class="col-md-12">
    <ol class="breadcrumb">
        <li><a href="document.jsp">文档</a></li>
        <li class="active"><a href="#">上传</a></li>
    </ol>
</div>

<div class="col-md-12">
    <s:fielderror/>
    <div class="center-block">
        <s:form action="uploadfiles" enctype="multipart/form-data">
            <s:file type="file" name="upload"/>
            <s:file type="file" name="upload"/>
            <s:file type="file" name="upload"/>
            <s:file type="file" name="upload"/>
            <s:submit value="上传"/>
        </s:form>
    </div>
</div>

</body>
</html>
