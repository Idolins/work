<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/15
  Time: 10:55
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="dist/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        window.onload = function () {
            var show = document.getElementById("show");
            setInterval(function () {
                var time = new Date();
                // 程序计时的月从0开始取值后+1
                var m = time.getMonth() + 1;
                show.innerHTML = time.getFullYear() + "-" + m + "-"
                    + time.getDate() + " " + time.getHours() + ":"
                    + time.getMinutes();
            }, 1000);
        };
    </script>

    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script type="text/javascript"
            src="http://webapi.amap.com/maps?v=1.4.0&key=58106c1c54be5f020791bfa63fc05b3e&plugin=AMap.CitySearch"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
    <script type="text/javascript" src="common/lbs.js"></script>

</head>
<body>
<%--导航栏--%>
<jsp:include page="common/nav.jsp"/>

<%--巨幕--%>
<div class="container">
    <div class="jumbotron">
        <div>
            <img src="pic/testpic.jpeg" width="180px" height="180px" class="img-responsive img-circle  center-block">
            <h1>xxx,晚上好

            </h1>
            <h3 id="show">21:48</h3>
            <p>你已经加入实验室 xxx 天 xxx 小时</p>
            <p>
            <form  onclick="submitLocal()" id="form">
                <input type="submit" value="签到" class="btn btn-primary btn-lg">
            </form>
            </p>
        </div>
    </div>
</div>


</body>
</html>
