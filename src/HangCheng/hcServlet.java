package HangCheng;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import bean.tuijian;
import dao.tuijiandao;

@WebServlet(name = "hcServlet", value = "/hcServlet")
public class hcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            String zz = request.getParameter("tuijian");
            tuijiandao Tuijiandao =new tuijiandao();
            tuijian list = Tuijiandao.getresult(zz);
            request.setAttribute("list",list);
            request.getRequestDispatcher("/result.jsp").forward(request,response);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
