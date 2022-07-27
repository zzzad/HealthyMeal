<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.tuijian" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 24232
  Date: 2022/3/6
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>健康饮食推荐系统</title>
    <link rel="stylesheet" href="css/style2.css">
</head>
<%tuijian list = (tuijian) request.getAttribute("list");
%>
<body>
<div class="container w3">
    <form action="hcServlet" method="get" >
        <div class="login-w3">
            <input  type="submit" class="login" value="结果">
        </div>
        <div class="clear"></div>
        <div class="password-agileits">
            <div><span class="username"style="height:24px">建议或者推荐菜品:</span></div>
            <li class="tuijian"><%=list.getTj()%></li>
            <div class="clear"></div>
        </div>
    </form>
</div>
<div class="footer-w3l">
    <p> 第一小组</p>
</div>
</body>
</html>
