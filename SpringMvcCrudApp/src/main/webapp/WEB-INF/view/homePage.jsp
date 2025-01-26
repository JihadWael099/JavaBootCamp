<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%-- Import Bootstrap --%>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">
</head>
<body class="container">
<h1>Products Data</h1>
<div class="tbl-div">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Show Details</th>
            <th scope="col">Add/Update</th>
            <th scope="col">Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="item">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>
                    <form:form action="${pageContext.request.contextPath}/products/showProductDetails" method="GET">
                        <input type="hidden" name="productId" value="${item.id}" />
                        <input type="submit" class="btn btn-primary" value="View Details"/>
                    </form:form>
                </td>
                <td>
                    <form:form action="${pageContext.request.contextPath}/products/updateProduct" method="GET">
                        <input type="hidden" name="productId" value="${item.id}" />
                        <input type="submit" class="btn btn-warning" value="Add/Update Details"/>
                    </form:form>
                </td>
                <td>
                    <form:form action="${pageContext.request.contextPath}/products/deleteProduct" method="POST">
                        <input type="hidden" name="productId" value="${item.id}" />
                        <input type="submit" class="btn btn-danger" value="Delete"/>
                    </form:form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="${pageContext.request.contextPath}/products/addForm" class="btn btn-success">
        Add new Product
    </a>
</div>
</body>
</html>