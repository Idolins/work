package servlet;

import enitiy.RequestData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by young on 2017/8/31.
 */
@WebServlet(name = "ReqServlet", urlPatterns = "/req")
public class ReqServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String authType = request.getAuthType();
        String contextPath = request.getContextPath();
        Cookie[] cookies = request.getCookies();
        Enumeration<String> headerNames = request.getHeaderNames();
        String localAddr = request.getLocalAddr();
        String method = request.getMethod();
//        Collection<Part> parts = request.getParts();
        String remoteAddr = request.getRemoteAddr();
        int remotePort = request.getRemotePort();

        request.setAttribute("req", new RequestData(authType, contextPath, localAddr, method, remoteAddr, remotePort));

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
