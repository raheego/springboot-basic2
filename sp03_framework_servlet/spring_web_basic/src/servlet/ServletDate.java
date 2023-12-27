package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        response.setCharacterEncoding("utf-8");

        Calendar c = Calendar.getInstance();
        int hour = c.get(Calender.HOUR_OF_DAY);
        int min = c.get(Calender.MINUTE);
        int sec = c.get(Calender.SECOND);

        PrintWriter out = response.getWriter();
        out.write("<body><h1><font color='blue'> 교수컴 Hello Servlet </font></h1>");
        out.write("<h2>교수컴 현재 시간은 ");
        out.write(Integer.toString(hour) + "  시");
        out.write(Integer.toString(min) + " 분");
        out.write(Integer.toString(sec) + "  초 입니다.");

        out.write("</h2></body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
