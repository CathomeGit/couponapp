package ru.avtonomenergo.coupon;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/coupon")
public class CouponServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print("SUPERSALE");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("coupon", request.getParameter("coupon"));
        request.setAttribute("discount", 50);
        request.getRequestDispatcher("response.jsp").forward(request, response);
    }
}