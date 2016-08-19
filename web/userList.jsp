<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/18
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="cc" uri="/struts-tags" %>
<html>
<head>
    <title>userList</title>
</head>
<body>
    <cc:iterator value = "users">
        <cc:property value="username"/>
    </cc:iterator>
</body>
</html>
