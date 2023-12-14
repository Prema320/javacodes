package com.xworkz.servlet;

import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.service.UserService;
import com.xworkz.servlet.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/user", loadOnStartup = +1)
public class UserServlet extends HttpServlet {
    public UserServlet(){
        System.out.println("invoke");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println(name);

        String email = req.getParameter("email");
        System.out.println(email);
        String mobileNo = req.getParameter("mobileNo");
        System.out.println(mobileNo);
        String comments = req.getParameter("comments");
        System.out.println(comments);

        UserDto dto = new UserDto();
        dto.setName(name);
        dto.setEmail(email);
        dto.setMobileNo(mobileNo);
        dto.setComments(comments);
        UserService userService = new UserServiceImpl();
        userService.saved(dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("index1.jsp");
        dispatcher.forward(req, resp);

    }
    public HttpServletRequest generic(HttpServletRequest request){
        return request;
    }


}


