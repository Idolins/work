<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/24
  Time: 21:18
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <style>
        .form-center {
            width: 500px;
            height: auto;
        }
    </style>
</head>
<body>
<jsp:include page="common/nav.jsp"/>

<div class="container">

    <div class="form-center center-block">
        <h3 class="text-center">登陆</h3>
        <form action="userLogin.action" method="post" class="form-group center-block">
            <table class="table ">
                <tr class="form-group">
                    <td>
                        <div class="input-group">
                            <span class="input-group-addon" id="emailSpan">E-Mail</span>
                            <input id="email" class="form-control" type="email"
                                   aria-describedby="emailSpan" name="email">
                        </div>
                    </td>
                </tr>
                <tr class="form-group">
                    <td>
                        <div class="input-group">
                            <span class="input-group-addon" id="passwordSpan">密码</span>
                            <input id="password" class="form-control" type="password" placeholder="长度为3~8字符"
                                   aria-describedby="passwordSpan" name="password">
                        </div>
                    </td>

                </tr>
                <tr class="form-group">
                    <td class="text-center">
                        <div>
                            ${requestScope.loginError}
                        </div>
                    </td>
                </tr>
                <tr class="form-group">
                    <td >
                        <div>
                            <button type="submit" class="btn btn-success btn-block">登陆</button>
                        </div>
                    </td>

                </tr>
            </table>
        </form>
    </div>
</div>

</body>
</html>
