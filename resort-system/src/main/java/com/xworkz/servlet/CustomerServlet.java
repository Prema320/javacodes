package com.xworkz.servlet;

import com.xworkz.servlet.dto.CustomerDto;
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
import java.util.Date;

@WebServlet(urlPatterns = "/home")
public class CustomerServlet extends HttpServlet {
    public CustomerServlet(){
        System.out.println("invoke");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(" ");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("name");
        String lastName = req.getParameter("lname");
        String email = req.getParameter("email");
        String mobileNo = req.getParameter("mobileNo");
        String payment = req.getParameter("payment");
        String checkIn = req.getParameter("checkIn");
        String checkOut = req.getParameter("checkOut");
        String adults = req.getParameter("adult");
        String child = req.getParameter("children");
        String room = req.getParameter("room");

       CustomerDto dto=new CustomerDto();
       dto.setFirstName(firstName);
       dto.setLastName(lastName);
       dto.setEmail(email);
       dto.setMobileNo(mobileNo);
       dto.setPaymentMode(payment);
       dto.setCheckInDate((new Date(checkIn)));
       dto.setCheckOutDate((new Date(checkOut)));
       dto.setAdults(adults);
       dto.setChildren(child);
       dto.setRooms(room);
       UserService userService=new UserServiceImpl();
       userService.save(dto);
       RequestDispatcher dispatcher=req.getRequestDispatcher("index2.jsp");
       dispatcher.forward(req,resp);
    }

    public HttpServletRequest generic(HttpServletRequest request){
        return request;
    }
}
