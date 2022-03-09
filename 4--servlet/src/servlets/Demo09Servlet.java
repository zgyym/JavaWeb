package servlets;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//演示客户端重定向
public class Demo09Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo09...");


        HttpSession session = req.getSession();
        System.out.println(session.getId());
    }
}
