<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="S" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/23
  Time: 14:52
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<s:fielderror/>
<s:form action="upload" method="POST" enctype="multipart/form-data">
    <s:file name="file" label="文件"/>
    <S:submit value="上传" type="submit"/>
</s:form>
</body>
</html>
