<%@ page import="com.ssh.model.User" %>
<%@ page import="com.ssh.service.UesrService" %>
<%@ page import="com.ssh.service.impl.UesrServiceImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/16
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String password2 = request.getParameter("passwords");

    User user = new User();
    user.setUsername(username);
    user.setPassword(password);

    UesrService uesrService = new UesrServiceImpl();

    boolean exists = uesrService.exists(user);

    if(exists)
        response.sendRedirect("registerFail.jsp");
    else {
        uesrService.save(user);
        response.sendRedirect("registerSuccess.jsp");
    }

%>

