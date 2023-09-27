package com.example.labweek2.controller;

import com.example.labweek2.entities.Customer;
import com.example.labweek2.services.CustomerService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CustomerController", value = "/customer")
public class CustomerController extends HttpServlet {
    private CustomerService service = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = service.getAll();
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(customers);
        getServletContext().getRequestDispatcher("webapp/customer.jsp").forward(req, resp);
    }
}
