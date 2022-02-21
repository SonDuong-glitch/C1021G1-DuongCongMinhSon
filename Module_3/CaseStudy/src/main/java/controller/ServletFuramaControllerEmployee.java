package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletFuramaControllerEmployee", value = "/employee")
public class ServletFuramaControllerEmployee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = " ";
        }
        switch (action){
            case "AddNewEmployee":
                showFormAddEmployee();
                break;
            case "EditEmployee":
                showFormEditEmployee();
                break;
            case "DeleteEmployee":
                showFormDeleteEmployee();
                break;
            default:
                listAllEmployee();
                break;
        }
    }

    private void listAllEmployee() {
    }

    private void showFormDeleteEmployee() {
    }

    private void showFormEditEmployee() {
    }

    private void showFormAddEmployee() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "addNewEmployee":
                createEmployee();
                break;
            case "EditEmployee":
                editEmpoyee();
                break;
            case "DeleteEmployee":
                deleteEmployee();
                break;
            default:
                listAllEmployee();
                break;
        }
    }

    private void deleteEmployee() {
    }

    private void editEmpoyee() {
    }

    private void createEmployee() {
    }
}
