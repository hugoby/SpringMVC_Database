<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/8/5
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>SpringMVC Demo 首页</title>

  <!-- 新 Bootstrap 核心 CSS 文件
  <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"> -->
    <c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>

  <link href="${path}/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
  <!--[if lt IE 9]-->
  <script type="text/javascript" src="${path}/bootstrap/js/html5shiv.min.js"></script>
  <script type="text/javascript" src="${path}/bootstrap/js/respond.min.js"></script>
  <!--[endif]-->

</head>
<body>
<h1>这里是SpringMVC Demo首页</h1>

<h3>出现此页面，说明配置成功。</h3>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
-->

<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<script src="${path}/bootstrap/js/jquery-3.1.0.min.js"></script>
<script src="${path}/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>