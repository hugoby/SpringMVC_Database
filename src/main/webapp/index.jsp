<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/8/6
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Log in</title>
</head>
<body>
<s:form action="login" validate="true" method="post" >
  <s:textfield label="User Name" name="user.name" required="true"/>
  <s:password label="Password" name="user.password" required="true"/>
  <s:iterator value="errors">
    <s:property/>
  </s:iterator>
  <s:submit value="login"/>
</s:form>
</body>
</html>