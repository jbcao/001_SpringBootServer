package com.src.practise.ooa_forward_and_redirect;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ForwardServlet extends HttpServlet {
	@RequestMapping("/forwardServlet")
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        System.out.println("forwardServlet's doGet");
        String path="testServlet";
        //1.调用HttpServletRequest的getRequestDispatcher()方法，调用时需要传入转发的地址;
        RequestDispatcher requestDispatcher=request.getRequestDispatcher(path);
        //2.调用HttpServletRequest的forward(request,response)方法进行请求的转发;
        requestDispatcher.forward(request,response);
    }
}
