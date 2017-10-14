package servlet;

import entity.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by young on 2017/8/28.
 * @author young
 */
@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        float result = 0;
        Calculator calculator = new Calculator(
                Float.valueOf(request.getParameter("num1")),
                Float.valueOf(request.getParameter("num2")),
                request.getParameter("op"));
        switch (calculator.getOp()) {
            case "+":
                result = calculator.getNum1() + calculator.getNum2();
                break;
            case "-":
                result = calculator.getNum1() - calculator.getNum2();
                break;
            case "*":
                result = calculator.getNum1() * calculator.getNum2();
                break;
            case "/":
                result = calculator.getNum1() / calculator.getNum2();
                break;
            default:
                break;
        }
        request.setAttribute("calculator", calculator);
        request.setAttribute("result", result);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
