package login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import bean.student;
import dao.studentdao;
@WebServlet(name = "lgServlet", value = "/lgServlet")
public class lgServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   try{
       request.setCharacterEncoding("utf-8");
       response.setCharacterEncoding("utf-8");
       response.setContentType("text/html;charset=utf-8");
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       System.out.println(username);
       studentdao Studentdao = new studentdao();
       int count = Studentdao.getcheck(username,password);
       if (count > 0) {
           request.getRequestDispatcher("tuijian.jsp").forward(request, response);
       }else {
           Frame frame=new Frame();
           frame.setAlwaysOnTop(true);//将弹窗放在最前面
           JOptionPane.showMessageDialog((Component)frame, "密码错误！");
           response.sendRedirect("http://localhost:8080/fenli_war_exploded/index.jsp");
       }
   } catch (ServletException e) {
       e.printStackTrace();
   } catch (IOException e) {
       e.printStackTrace();
   }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
