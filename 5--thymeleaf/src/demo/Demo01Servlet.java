package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//演示request保存作用域（demo01 和 demo02）
@WebServlet("/demo01")
public class Demo01Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //向request保存作用域保存数据
        req.setAttribute("uname","言魔");

        //1、服务器内部转发
        //req.getRequestDispatcher("demo02").forward(req,resp);

        //2、客户端重定向
        resp.sendRedirect("demo02");
    }
}
