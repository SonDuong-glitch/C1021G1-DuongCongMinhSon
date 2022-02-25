<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/22/2022
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Customer</title>
    <link rel="stylesheet" href="/static/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-6">
            <form action="/customer?action=EditCustomer" method="post">
                <div class="form-group">
                    <label for="id-customer"></label>
                    <input type="hidden" id="id-customer" name="id-customer" value="${customer.customerId}">
                </div>
                <div class="form-group">
                    <label for="name-customer">Name</label>
                    <input type="text" class="form-control" id="name-customer" name="name_customer" value="${customer.customerName}">
                </div>
                <div class="form-group">
                    <label for="id-card">
                        Customer Id card
                    </label>
                    <input type="text" class="form-control" id="id-card" name="id_card" value="${customer.customerIdCard}">
                </div>
                <div class="form-group">
                    <label for="code-customer">Code</label>
                    <input type="text" class="form-control" id="code-customer" name="code_customer" value="${customer.customerCode}">
                </div>
                <div class="form-group">
                    <label for="birthday">Birthday</label>
                    <input type="date" class="form-control" id="birthday" name="birthday" value="${customer.customerBirthday}">
                </div>
                <div class="form-group">
                    <label for="address">Address</label>
                    <input type="text" class="form-control" id="address" name="address" value="${cusotmer.customerAddress}">
                </div>
                <div class="form-group">
                    <label for="phoneNumber">Phone Number</label>
                    <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" value="${customer.customerPhone}">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="text" class="form-control" id="email" name="email" value="${customer.customerEmail}">
                </div>

                <div class="form-group">
                    <label for="gender">Gender</label>
                    <select class="form-control" id="gender" name="gender" required>
                        <option  value="">Chọn...</option>
                        <option value="true" >Nam</option>
                        <option value="false" >Nữ</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="category">CustomerType</label>
                    <select class="form-control" id="category" name="idCustomerType">
                        <c:forEach var="type" items="${customerTypeList}">
                            <option value="${type.customerTypeId}">${type.customerTypeName}</option>
                        </c:forEach>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>

<script src="/static/jquery/jquery-3.5.1.min.js"></script>
<script src="/static/bootstrap413/js/popper.min.js"></script>
<script src="/static/datatables/js/jquery.dataTables.min.js"></script>
<script src="/static/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.bundle.js"></script>

</body>
</html>
