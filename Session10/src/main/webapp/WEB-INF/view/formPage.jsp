<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="option" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Styled Form</title>

    <!-- Link to custom stylesheet -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

    <!-- Bootstrap CSS -->
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

</head>
<body class="bg-light container" >

<h1 >
    User Form .
</h1>
<form:form modelAttribute="userModel" action="${pageContext.request.contextPath}/processForm">
    <div class="form-group">
        <label for="exampleInputEmail1">UserName</label>
        <input:input path="userName" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"/>
        <form:errors path="userName" cssClass="alert-danger"/>
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input:input path="email" type="Email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"/>
        <form:errors path="email" cssClass="alert-danger"/>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input:input path="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword2">ConfirmPassword</label>
        <input:input path="confirmPassword" type="password" class="form-control" id="exampleInputPassword2" placeholder="Confirm Password"/>
        <form:errors path="confirmPassword" cssClass="alert-danger"/>
    </div>
    <div class="form-group">
        <input type="submit" class="btn btn-danger btn-danger " />
    </div>
</form:form>
</body>
</html>
