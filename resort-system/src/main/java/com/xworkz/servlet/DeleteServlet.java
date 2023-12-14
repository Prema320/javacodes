package com.xworkz.servlet;

import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.service.UserService;
import com.xworkz.servlet.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        int userId = Integer.parseInt(req.getParameter("userId"));

        String id = req.getParameter("userId");
//        int userId = Integer.parseInt(userIdParam);

UserService service=new UserServiceImpl();

        boolean deletedUser = service.deleteById(Integer.parseInt(id));

        if (deletedUser){
            req.setAttribute("deleteMessage","deleted successfully");
            resp.sendRedirect("getAll");
        }
        else {
            req.setAttribute("deleteMessage","delete unsuccessfully");
            resp.sendRedirect("getAll");
        }



    }
}
