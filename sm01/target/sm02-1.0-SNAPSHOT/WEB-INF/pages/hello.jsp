<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/27
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false"  language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

hello,${requestScope.user.username}
你今年${requestScope.user.age}岁，
密码是${requestScope.user.pwd}<br>
<%--${requestScope.username}!!今年${requestScope.age}岁了！--%>
<%--${sessionScope.username}!!今年${sessionScope.age}岁了！--%>
</body>
</html>
