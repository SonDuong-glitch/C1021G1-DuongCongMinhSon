package controller;

import model.Customer;
import service.CustomerImpl.CustomerImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServletFuramaController", value = "/customer")
public class ServletFuramaControllerCustomer extends HttpServlet {
    private static CustomerImpl customerImpl = new CustomerImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "AddCustomer":
                showFormCreateCustomer(request,response);
                break;
            case "EditCustomer":
                showFormEditCustomer(request,response);
                break;
            default:
                listAllCustomer(request,response);
                break;
        }
    }

    private void listAllCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerImpl.selectAllCustomer();
        request.setAttribute("CustomerList",customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormEditCustomer(HttpServletRequest request, HttpServletResponse response) {

    }

    private void showFormCreateCustomer(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "AddCustomer":
                createCustomer(request,response);
                break;
            case "EditCustomer":
                editCustomer(request,response);
                break;
            case "DeleteCustomer":
                try {
                    deleteCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                listAllCustomer(request,response);
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        customerImpl.deleteCustomer(id);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
    }
}
