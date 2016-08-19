<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/16
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>用户注册</title>
        <link rel="stylesheet" href="code/css/bootstrap.min.css">
        <script src="code/js/bootstrap.min.js"></script>
        <script src="code/js/jquery-3.0.0.min.js"></script>
    </head>
    <body>
        <div class='container'>
            <form method="post" action="userAction.action">
                <table class="table">
                    <tr>
                        <td>用户名： </td>
                        <td><input type="text" name="username"/> </td>
                    </tr>
                    <tr>
                        <td>密码: </td>
                        <td><input type="password" name="password"/> </td>
                    </tr>
                    <tr>
                        <td>确认密码： </td>
                        <td><input type="password" name="passwords"/> </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="注册"/>
                        </td>
                    </tr>
                </table>
            </form>
         </div>
     </body>
</html>
