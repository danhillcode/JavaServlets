package servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "Register",
        urlPatterns = {"/register1"}
)
public class Register extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Register(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("userName");

        //String passwd = request.getParameter("passwd");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if(username != ""){
            out.println("enter");
            out.println(username);
        }else{
            response.sendRedirect("http://localhost:8080/register.html");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }




}
