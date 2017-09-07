<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/7
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <!-- Bootstrap styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- Font-Awesome -->
    <link rel="stylesheet" href="css/font-awesome/css/font-awesome.min.css">

    <!-- Google Webfonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600|PT+Serif:400,400italic' rel='stylesheet'
          type='text/css'>

    <!-- Styles -->
    <link rel="stylesheet" href="css/style.css" id="theme-styles">

    <!--[if lt IE 9]>
    <!--<script src="js/vendor/google/html5-3.6-respond-1.1.0.min.js"></script>-->
    <%--<![endif]-->--%>


</head>
<body>

<div class="widewrapper main">
    <div class="container">
        <div class="row">
            <div class="col-md-8 blog-main">
                <article class="blog-post">
                    <header>
                        <div class="lead-image">
                            <img src="img/single-post.jpg" alt="" class="img-responsive">

                        </div>
                    </header>
                </article>
            </div>
            <aside class="col-md-4 blog-aside">

                <div class="aside-widget">
                    <header>
                        <h3>请登录</h3>
                    </header>
                    <div class="body">
                        <form action="login.do" method="post">
                            <div class="form-group">
                                <label for="exampleInputEmail1">账号</label>
                                <input name="username" type="text" class="form-control" id="exampleInputEmail1"
                                       placeholder="账号">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">密码</label>
                                <input name="password" type="password" class="form-control" id="exampleInputPassword1"
                                       placeholder="密码">
                            </div>
                            <button type="submit" class="btn btn-default">登陆</button>
                        </form>
                        ${requestScope.text}
                        <a href="register.jsp">
                            <button type="button" class="btn btn-link">注册</button>
                        </a>
                    </div>
                </div>
            </aside>
        </div>
    </div>
</div>


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/modernizr.js"></script>

</body>
</html>
