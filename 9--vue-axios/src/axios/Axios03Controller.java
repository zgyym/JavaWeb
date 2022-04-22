package axios;


import com.google.gson.Gson;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/axios03.do")
public class Axios03Controller extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuffer stringBuffer = new StringBuffer("");
        BufferedReader reader = request.getReader();
        String str = null;
        while ((str = reader.readLine()) != null){
            stringBuffer.append(str);
        }
        str = stringBuffer.toString();

        //已知 String
        //需要转化成 Java Object

        Gson gson = new Gson();
        //Gson有两个API
        //1.fromJson(string,T) 将字符串转化成java object
        //2.toJson(java Object) 将java object转化成json字符串，这样才能响应给客户端
        User user = gson.fromJson(str, User.class);

        user.setUname("言魔");
        user.setPwd("123456");

        //假设user是从数据库查询出来的，现在需要将其转化成json格式的字符串，然后响应给客户端
        String userJsonStr = gson.toJson(user);
        response.setCharacterEncoding("UTF-8");
        //设置MIME-TYPE
        response.setContentType("application/json;charset=utf-8");
        //服务器响应客户端
        response.getWriter().write(userJsonStr);


    }
}