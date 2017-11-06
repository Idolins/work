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


    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script type="text/javascript"
            src="http://webapi.amap.com/maps?v=1.4.0&key=58106c1c54be5f020791bfa63fc05b3e&plugin=AMap.CitySearch"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
    <script type="text/javascript" src="common/lbs.js"></script>
    <style>
        .nav-self {
            margin-top: 200px;
        }

        body {
            min-height: 100%;
            margin: 0;
            padding: 0;
            position: relative;
        }
    </style>
</head>
<body>
<%--导航栏--%>
<jsp:include page="common/nav.jsp"/>

<%--巨幕--%>
<div class="container">
    <div class="jumbotron">
        <div>
            <img src="pic/testpic.jpeg" width="180px" height="180px" class="img-responsive img-circle  center-block">
            <h1>${sessionScope.user.nickname}</h1>
            <h2>
                <div id="Greeting">
                </div>
                <script type="text/javascript">
                    var time = new Date()
                    var hours = time.getHours();
                    var greet;
                    if (0 <= hours && hours < 6) {
                        greet = "现在是凌晨了，快休息吧。😊"
                    }
                    if (6 <= hours && hours < 9) {
                        greet = "早上好，又是美好的一天🌝"
                    }
                    if (9 <= hours && hours < 11) {
                        greet = "上午要努力工作哦👍"
                    }
                    if (11 <= hours && hours < 14) {
                        greet = "现在应该睡午觉😴"
                    }
                    if (14 <= hours && hours < 17) {
                        greet = "下午好，努力工作✨"
                    }
                    if (17 <= hours && hours < 20) {
                        greet = "吃晚餐了吗？🍔"
                    }
                    if (20 <= hours && hours <= 24) {
                        greet = "美好的夜生活🥂"
                    }
                    document.getElementById("Greeting").innerHTML = greet
                </script>
            </h2>
            <div id="show"></div>
            <script type="text/javascript">
                window.onload = function () {
                    var show = document.getElementById("show");
                    setInterval(function () {
                        var time = new Date();
                        // 程序计时的月从0开始取值后+1
                        var m = time.getMonth() + 1;
                        var hours = time.getHours();
                        if (hours < 10) {
                            hours = "0" + hours
                        }
                        var seconds = time.getSeconds();
                        if (seconds < 10) {
                            seconds = "0" + seconds;
                        }
                        var minutes = time.getMinutes();
                        if (minutes < 10) {
                            minutes = "0" + minutes
                        }
                        var t = time.getFullYear() + "-" + m + "-"
                            + time.getDate() + " " + hours + ":"
                            + minutes + ":" + seconds;
                        show.innerHTML = t;
                    }, 1000);
                };
            </script>
            <p>你已经加入实验室 xxx 天 xxx 小时</p>
            <form onclick="submitLocal()" id="form">
                <input type="submit" value="签到" class="btn btn-primary btn-lg">
            </form>
        </div>
    </div>
</div>


<%--版权--%>
<jsp:include page="common/copyright.jsp"/>
</body>
</html>
