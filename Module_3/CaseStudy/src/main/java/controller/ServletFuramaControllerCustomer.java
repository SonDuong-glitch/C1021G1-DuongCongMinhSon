package controller;

import model.Customer;
import model.Customer_Type;
import service.CustomerImpl.CustomerImpl;
import service.CustomerImpl.CustomerTypeImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServletFuramaController", value = "/customer")
public class ServletFuramaControllerCustomer extends HttpServlet {
    private static CustomerImpl customerImpl = new CustomerImpl();
    private static CustomerTypeImpl customerType = new CustomerTypeImpl();
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
        request.setAttribute("customerList",customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer_Type> customerTypeList = customerType.findAll();
        request.setAttribute("customerTypeList", customerTypeList);
        int id = Integer.parseInt(request.getParameter("customer_id"));
        Customer customer = customerImpl.selectCustomer(id);
        request.setAttribute("customer", customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit.jsp");
        dispatcher.forward(request, response);
    }

    private void showFormCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer_Type> customerTypeList = customerType.findAll();
        request.setAttribute("customerTypeList", customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "AddCustomer":
                try {
                    createCustomer(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "EditCustomer":
                try {
                    editCustomer(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
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

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        customerImpl.deleteCustomer(id);
        List<Customer> customerList = customerImpl.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        dispatcher.forward(request, response);
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String customerCode = request.getParameter("code_customer");
        int customerTypeId = Integer.parseInt(request.getParameter("idCustomerType"));
        String customerName = request.getParameter("name_customer");
        String customerBirthday = request.getParameter("birthday");
        boolean gender = Boolean.valueOf(request.getParameter("gender"));
        String customerIdCard = request.getParameter("id_card");
        String customerPhone = request.getParameter("phoneNumber");
        String customerEmail = request.getParameter("email");
        String customerAddress = request.getParameter("address");

        Customer customer = new Customer(id, customerCode, customerTypeId, customerName,customerBirthday,gender,
                customerIdCard,customerPhone,customerEmail,customerAddress);
        customerImpl.updateCustomer(customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer");
        dispatcher.forward(request, response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String customerCode = request.getParameter("code_customer");
        int customerTypeId = Integer.parseInt(request.getParameter("idCustomerType"));
        String customerName = request.getParameter("name_customer");
        String customerBirthday = request.getParameter("birthday");
        boolean gender = Boolean.valueOf(request.getParameter("gender"));
        String customerIdCard = request.getParameter("id_card");
        String customerPhone = request.getParameter("phoneNumber");
        String customerEmail = request.getParameter("email");
        String customerAddress = request.getParameter("address");
        customerImpl.insertUser(new Customer(0,customerCode,customerTypeId,customerName,customerBirthday,
                gender,customerIdCard,customerPhone,customerEmail,customerAddress));
        this.listAllCustomer(request,response);
    }
}
