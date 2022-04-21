package axios;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/axios01.do")
public class axios01Controller extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");

        System.out.println("uname = " + uname);
        System.out.println("pwd = " + pwd);

    }
}
