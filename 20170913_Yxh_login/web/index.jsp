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
        function submitForm() {
            var form = document.getElementById("form");
            var userType = document.getElementById("userType");
            var index = userType.selectedIndex;
            var typeValue = userType.options[index].value;
            if (typeValue === "管理员") {
                form.action = "adminLogin.action"
            } else if (typeValue === "普通用户") {
                form.action = "userLogin.action"
            } else {
                alert("未知错误")
            }
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
            <td>验证码</td>
            <td><input type="text" name="checkCode"></td>
            <td><img src="checkCode.action" onclick="this.src='checkCode.action'"></td>
            <td class="errorLabel"><s:fielderror><s:param>code</s:param> </s:fielderror></td>
        </tr>
        <tr>
            <td>用户类型</td>
            <td>
                <label for="userType"></label><select name="type" id="userType">
                <option value="管理员">管理员</option>
                <option value="普通用户">普通用户</option>
            </select>

            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="button" value="登陆" onclick="submitForm()"></td>
        </tr>
    </table>
</form>
</body>
</html>