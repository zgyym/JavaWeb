package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//演示从HttpServlet保存作用域中获取数据
public class Demo05Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = (String) req.getSession().getAttribute("uname");
        System.out.println(uname);

        /*
            服务器启动后
            这里从HttpServlet保存作用域中获取数据，在同一个浏览器中分别访问denmo04和demo05，会
            在demo05中获取到数据，因为在同一个浏览器中意味着同一个会话，如果换了浏览器取访问demo05
            的话是获取不到数据的，因为换了浏览器就相当于换了一个会话


        */
    }
}
