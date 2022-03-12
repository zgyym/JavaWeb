package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


//演示session保存作用域（demo03 和 demo04）
@WebServlet("/demo03")
public class Demo03Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向session保存作用域保存数据
        HttpSession session = req.getSession();
        session.setAttribute("uname","言魔");



        //1、服务器内部转发
        //req.getRequestDispatcher("demo04").forward(req,resp);

        //2、客户端重定向
        resp.sendRedirect("demo04");
    }
}
