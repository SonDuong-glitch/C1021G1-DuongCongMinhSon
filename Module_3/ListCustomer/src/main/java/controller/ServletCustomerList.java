package controller;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomerList", value = "/ServletCustomerList")
public class ServletCustomerList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Van Hoan", "1983-08-20", "Ha Noi", "https://we25.vn/media/images/tuyen-vk%20(2).jpg"));
        customerList.add(new Customer("Nguyen Van Nam", "1983-08-20", "Bac Ninh", "https://dotobjyajpegd.cloudfront.net/photo/5cb82527a449d212f33b4e1b"));
        customerList.add(new Customer("Nguyen Thai Hoa", "1983-08-20", "nam Dinh", "https://danviet.mediacdn.vn/upload/1-2019/images/2019-03-09/Chuyen-tim-lai-hinh-hai-la-con-trai-cua-co-be-13-tuoi-nguoi-Kho-kanhist-2-1552136710-width720height960.jpg"));
        customerList.add(new Customer("Tran Dang Khoa", "1983-08-20", "Ha Noi", "https://kenh14cdn.com/2018/10/5/1-1-15387152401371595322985.jpg"));
        request.setAttribute("customer", customerList);
        request.getRequestDispatcher("DisplayListCustomer.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}