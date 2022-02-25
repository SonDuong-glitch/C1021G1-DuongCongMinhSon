package controller;

import model.Product;
import service.IProduct;
import service.ITypeProduct;
import service.ProductServiceImpl;
import service.ProductTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PhoneServlet", value = "/product")
public class PhoneServlet extends HttpServlet {
    private IProduct productService = new ProductServiceImpl();
    private ITypeProduct typeProduct = new ProductTypeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            case "search":
                searchPhone(request,response);
            default:
                showListPhone(request,response);
        }
    }

    private void showListPhone(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.findAll();
        request.setAttribute("productList", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchPhone(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createNewPhone(request,response);
                break;
            case "edit":
                editPhone(request,response);
                break;
            case "delete":
                deletePhone(request,response);
            default:
                showListPhone(request,response);
        }
    }

    private void deletePhone(HttpServletRequest request, HttpServletResponse response) {
    }

    private void editPhone(HttpServletRequest request, HttpServletResponse response) {
    }

    private void createNewPhone(HttpServletRequest request, HttpServletResponse response) {
    }
}
