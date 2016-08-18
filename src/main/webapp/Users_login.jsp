<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/8/5
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>系统登录</title>
  <script type="text/javascript" src="bootstrap/js/jquery-3.1.0.min.js"></script>
  <link type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
  <link type="text/css" rel="stylesheet" href="bootstrap/css/style.css" />
</head>
<body>
<div class="header">
  <div class="header_content">
    <a href="#" id="logo"><img src="bootstrap/images/logo.png" width="220" height="100"/></a>
    <ul class="title">
      <li><a href="#">关于我们</a></li>
      <li><a href="#">常见问题</a></li>
      <li><a href="#">注册</a></li>
      <li><a href="#">登录</a></li>
    </ul>
  </div>
  <h1>登录</h1>
</div>
<div class="content">
  <form action="login" method="post" class="form-horizontal" role="form" >
    <div class="form-group">
      <label for="name" class="col-sm-3 control-label">用户名</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="name" name="user.name" placeholder="请输入用户名">
        <%--<s:textfield class="form-control" label="用户名" id="name" name="user.name" required="true"/>--%>
      </div>
    </div>
    <div class="form-group">
      <label for="password" class="col-sm-3 control-label">密码</label>
      <div class="col-sm-8">
        <input type="password" class="form-control" id="password" name="user.password" placeholder="请输入密码">
          <%--<s:password class="form-control" label="密码" id="password" name="user.password" required="true"/>--%>
      </div>
    </div>
    <div class="form-group has-feedback">
      <label for="registerWord" class="col-sm-3 control-label">验证码</label>
      <div class="col-sm-8">
        <input type="password" class="form-control" id="registerWord" placeholder="请填写图中的字符，不区分大小写" >
      </div>
    </div>


    <div class="form-group" >
      <div align="center" class="col-sm-offset-3 col-sm-7">
        <button style="margin-right: 55px" type="submit" class="btn btn-success" >&nbsp;&nbsp;&nbsp;&nbsp;登录&nbsp;&nbsp;&nbsp;&nbsp;</button>
        <button type="reset" class="btn">&nbsp;&nbsp;&nbsp;&nbsp;注册&nbsp;&nbsp;&nbsp;&nbsp;</button>
      </div>
    </div>

  </form>
</div>


<div class="footer">
  <p>&copy;2016华南理工大学软件学院张炳寅</p>
</div>
</body>

</html>