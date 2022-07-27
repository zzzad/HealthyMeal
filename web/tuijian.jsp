<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>健康饮食推荐系统</title>
    <link rel="icon" href="image/123.png" >
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container w3">
    <form action="hcServlet" method="get" >
        <div class="username" style="height: 90px;">
            <span class="username" style="height: 24.5px;">性别:</span>
            <input type="text" name="username" class="name" placeholder="" required>
            <div class="clear"></div>
        </div>
        <div class="password-agileits">
            <span class="username"style="height:24px">症状:</span>
            <input type="text" name="password" class="password" placeholder="" required>
            <div class="clear"></div>
        </div>
        <div class="login-w3">
            <input type="submit" class="login" value="查看结果">
        </div>
        <div class="clear"></div>
    </form>
</div>
<div class="footer-w3l">
    <p> 第一小组</p>
</div>
</body>
</html>
