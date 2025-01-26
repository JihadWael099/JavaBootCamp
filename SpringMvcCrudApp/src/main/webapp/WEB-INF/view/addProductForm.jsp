<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">
</head>
<body class="container">
<h1>Add new Product</h1>
<form:form action="${pageContext.request.contextPath}/products/addProduct" method="POST" modelAttribute="productModel">
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="form-group">
                    <h3>Add Product</h3>
                </div>
                <div class="form-group">
                    <label for="productDetails.name">Product Name</label>
                    <form:input type="text" cssClass="form-control" path="productDetails.name" placeholder="Enter product name"/>
                    <form:errors path="productDetails.name" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label for="productDetails.expirationDate">Expiration Date</label>
                    <form:input type="text" cssClass="form-control" path="productDetails.expirationDate" placeholder="dd/mm/yyyy"/>
                    <form:errors path="productDetails.expirationDate" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label for="productDetails.manufacturer">Manufacturer</label>
                    <form:input type="text" cssClass="form-control" path="productDetails.manufacturer" placeholder="Manufacturer"/>
                    <form:errors path="productDetails.manufacturer" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label for="productDetails.price">Price</label>
                    <form:input type="text" cssClass="form-control" path="productDetails.price" placeholder="Price"/>
                    <form:errors path="productDetails.price" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label for="productDetails.available">Availability</label>
                    <form:input type="text" cssClass="form-control" path="productDetails.available" placeholder="0 or 1"/>
                    <form:errors path="productDetails.available" cssClass="text-danger"/>
                </div>
                <input type="submit" class="btn btn-primary" value="Submit"/>
            </div>
        </div>
    </div>
</form:form>
</body>
</html>