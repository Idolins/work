<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="dist/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.jsp">People</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="#">主页<span class="sr-only">(current)</span></a></li>
                <li><a href="#">Link</a></li>
            </ul>
            <form class="navbar-form navbar-left">

                <div class="input-group">
                    <input type="search" class="form-control" placeholder="查询 人名，电话，地址 ……">
                    <span class="input-group-btn">
        <button class="btn btn-default" type="button">搜索</button>
      </span>
                </div>
            </form>

            <%--开始计时 2017年11月5日 11点05分 11点29分 我好像知道了错误--%>

            <c:set var="user" value="${sessionScope.user}"/>


            <c:if test="${user==null}">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="login.jsp">登陆</a></li>
                    <li><a href="register.jsp">注册</a></li>
                </ul>
            </c:if>

            <c:if test="${user!=null}">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="userInfo.jsp"> ${user.nickname}</a></li>
                    <li class="center-block ">
                        <img class="img-circle" src="pic/testpic.jpeg" width="50px" height="50px">
                    </li>
                </ul>
            </c:if>
            <%--<s:property value="user.nickname"/>--%>
            <%--<s:set var="session" value="${sessionScope.user}"/>--%>
            <%--<s:property value="#session"/>--%>

            <%--<s:if test="user.email==null">--%>
            <%----%>
            <%--</s:if>--%>
            <%--<s:else>--%>
            <%----%>
            <%--</s:else>--%>


        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>


</body>
</html>