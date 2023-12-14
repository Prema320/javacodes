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
import java.util.List;
@WebServlet(urlPatterns = "/updateUser")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));


//        int userId = Integer.parseInt(id);

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
        UserService service = new UserServiceImpl();
        if (service.updateInfoById(id, dto)) {
            req.setAttribute("updateMessage", "Update Successfully");
            RequestDispatcher dispatcher = req.getRequestDispatcher("user.jsp");
            dispatcher.forward(req, resp);
        } else {
            req.setAttribute("updateMessage", "Update Unsuccessfully");
            RequestDispatcher dispatcher = req.getRequestDispatcher("user.jsp");
            dispatcher.forward(req, resp);


        }

    }
}