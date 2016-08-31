<%--
  Created by IntelliJ IDEA.
  User: ehsy_it
  Date: 2016/8/26
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>OPC | Login</title>
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="static/css/animate.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen animated fadeInDown">
    <div>
        <div>
            <h1 class="logo-name">OPC</h1>
        </div>
        <h3>Welcome to OPC</h3>
        <form class="m-t" role="form" action="doLogin" method=post>
            <div class="form-group">
                <input type="text" name="userName" class="form-control" placeholder="Username" required="">
            </div>
            <div class="form-group">
                <input type="password" name="password" class="form-control" placeholder="Password" required="">
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">Login</button>
        </form>

      ${msg}
    </div>
</div>

<!-- Mainly scripts -->
<script src="static/js/jquery-2.1.1.js"></script>
<script src="static/js/bootstrap.min.js"></script>

</body>
</html>
