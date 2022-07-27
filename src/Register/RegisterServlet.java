package Register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import app.JDBC;
@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置文字编码
        response.setContentType("text/html");
        request.setCharacterEncoding("GB2312");
        response.setCharacterEncoding("GB2312");
        // 获取表单中属性值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordagain = request.getParameter("password-again");
        System.out.println(username);
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "密码长度须大于8位");
            response.sendRedirect("register.jsp");
            return;
        }
        if (password.equals(passwordagain)){
            try{
                // 插入注册信息的SQL语句(使用?占位符)
                String sql = "insert into login(username,password) "
                        + "values(?,?)";
                PreparedStatement ps = JDBC.ps(sql);
                // 对SQL语句中的参数动态赋值
                ps.setString(1, username);
                ps.setString(2, password);
                // 执行更新操作
                ps.executeUpdate();
                // 获取PrintWriter对象
                PrintWriter out = response.getWriter();
                // 输出注册结果信息
                request.getRequestDispatcher("/index.jsp").forward(request,response);
                out.flush();
                out.close();
                Cookie cookie = new Cookie("name", username);
                response.addCookie(cookie);
                response.sendRedirect("index.jsp");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else{
            Frame frame=new Frame();
            frame.setAlwaysOnTop(true);//将弹窗放在最前面
            JOptionPane.showMessageDialog((Component)frame, "两次密码输入不一致！");
            response.sendRedirect("http://localhost:8080/fenli_war_exploded/register.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
