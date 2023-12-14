package com.xworkz.servlet;

import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.service.UserService;
import com.xworkz.servlet.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(urlPatterns = "/getAll")
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService=new UserServiceImpl();
        List<UserDto> dtos=userService.find();
        req.setAttribute("users",dtos);
        RequestDispatcher dispatcher=req.getRequestDispatcher("user.jsp");
        dispatcher.forward(req,resp);
    }
}
