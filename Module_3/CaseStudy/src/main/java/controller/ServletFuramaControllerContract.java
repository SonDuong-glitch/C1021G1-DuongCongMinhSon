package controller;

import service.CustomerImpl.CustomerImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletFuramaControllerContract", value = "/contract")
public class ServletFuramaControllerContract extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "addNewContract":
                showCreateFormContract();
                break;
            case "EditContract":
                showFormEditContract();
                break;
            default:
                showAllListContract();
                break;
        }
    }

    private void showAllListContract() {
    }
    private void showFormEditContract() {
    }

    private void showCreateFormContract() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "addNewContract":
                createContract();
                break;
            case "EditContract":
                editContract();
                break;
            case "DeleteContract":
                deleteContract();
                break;
            default:
                showAllListContract();
                break;
        }
    }

    private void deleteContract() {
    }

    private void editContract() {
    }

    private void createContract() {
    }
}
