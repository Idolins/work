<%@page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>index</title>
</head>
<body>

<form action="calculator">
    num1: <label>
    <input type="number" name="num1" value="${requestScope.calculator.num1}">
</label><br>
    op: <label>
    <input type="radio" name="op" value="+"  ${requestScope.calculator.op=="+"?"checked":""}>
</label> +
    <label>
        <input type="radio" name="op" value="-" ${requestScope.calculator.op=="-"?"checked":""}>
    </label> -
    <label>
        <input type="radio" name="op" value="*" ${requestScope.calculator.op=="*"?"checked":""}>
    </label> *
    <label>
        <input type="radio" name="op" value="/" ${requestScope.calculator.op=="/"?"checked":""}>
    </label> /<br>
    num2: <label>
    <input type="number" name="num2" value="${requestScope.calculator.num2}">
</label><br>
    <input type="submit" value="提交">

</form>

result: <label>
    <input type="number" value="${requestScope.result}">el
</label>

</body>
</html>
