<%--
  Created by IntelliJ IDEA.
  User: lyh
  Date: 2018/3/7
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Millet</title>
</head>
    <body>
    <form action="LoginServlet.action" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="登录">
                </td>
                <td>
                    <input type="reset" value="取消">
                </td>
            </tr>
        </table>
    </form>
    </body>
</html>