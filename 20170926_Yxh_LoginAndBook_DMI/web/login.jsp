<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/13
  Time: 20:07
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
    <style>
        .errorLabel {
            font-weight: bold;
            color: red;
        }
    </style>
    <script>

        function login() {
            var form = document.getElementById("form");
            form.action = "userlogin!login";
            form.submit()
        }

        function register() {
            var form = document.getElementById("form");
            form.action = "userregister!register";
            form.submit()
        }

    </script>
</head>
<body>
<form method="post" id="form">

    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
            <td></td>
            <td class="errorLabel"><s:fielderror> <s:param>username</s:param></s:fielderror></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
            <td></td>

            <td class="errorLabel"><s:fielderror><s:param>password</s:param></s:fielderror></td>
        </tr>
        <tr>

            <td><input type="button" value="登陆" onclick="login()"></td>
            <td><input type="button" value="注册" onclick="register()"></td>
        </tr>
    </table>
</form>
</body>
</html>