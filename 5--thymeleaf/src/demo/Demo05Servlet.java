package demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


//演示application保存作用域（demo05 和 demo06）
@WebServlet("/demo05")
public class Demo05Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向session保存作用域保存数据
        ServletContext application = req.getServletContext();
        application.setAttribute("uname","言魔");



        //1、服务器内部转发
        //req.getRequestDispatcher("demo06").forward(req,resp);

        //2、客户端重定向
        resp.sendRedirect("demo06");
    }
}
