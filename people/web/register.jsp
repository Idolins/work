<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/24
  Time: 21:25
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
        .myjumbotron {
            color: #1b6d85;
        }
    </style>
</head>
<body>
<jsp:include page="common/nav.jsp"/>


<div class="container">
    <div class="jumbotron">
        <div>
            <h3>注册信息</h3>
            <form>
                <table class="table ">

                    <tr class="form-group">
                        <td><label for="nickname">昵称</label></td>
                        <td><input id="nickname" class="form-group" type="text" placeholder="长度为3~8字符"></td>
                    </tr>

                    <tr class="form-group">
                        <td><label for="sex">性别</label></td>
                        <td><select id="sex" class="form-group">
                            <option value="男">男</option>
                            <option value="女">女</option>
                        </select>
                        </td>
                    </tr>
                    <tr class="form-group">
                        <td><label for="firstName">姓</label></td>
                        <td><input id="firstName" class="form-group" type="text" placeholder="1-2个字符"></td>
                        <td><label for="lastName">名</label></td>
                        <td><input id="lastName" class="form-group" type="text" placeholder="1-5个字符"></td>
                    </tr>
                    <tr class="form-group">
                        <td><label for="age">年龄</label></td>
                        <td><input class="form-group" type="number" min="15" max="70" id="age"></td>
                    </tr>
                    <tr class="form-group">
                        <td><label for="birthday">生日</label> </td>
                        <td><div class="input-append date form_datetime">
                            <input size="16" type="text" value="" readonly>
                            <span class="add-on"><i class="icon-th"></i></span>
                        </div>

                            <script type="text/javascript">
                                $(".form_datetime").datetimepicker({
                                    format: "dd MM yyyy - hh:ii"
                                });
                            </script>   </td>
                    </tr>
                    <tr class="form-group"></tr>


                </table>


                <div class="checkbox">
                    <label>
                        <input type="checkbox"> Check me out
                    </label>
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
