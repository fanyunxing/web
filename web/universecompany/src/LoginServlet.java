/**
 * @author: lyh
 * @date: 2018/3/7
 * @description:
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
//@webservlet
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String _userName = req.getParameter("username");
        String _passWord = req.getParameter("password");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter _printWriter = resp.getWriter();
        _printWriter.println("<html><body>");
        if ("admin".equals(_userName) && "admin".equals(_passWord)) {
            _printWriter.println("登录成功！欢迎您," + _userName);
        } else {
            _printWriter.println("对不起！您的用户名或者密码不正确！");
        }
        _printWriter.println("</body></html>");
    }

}