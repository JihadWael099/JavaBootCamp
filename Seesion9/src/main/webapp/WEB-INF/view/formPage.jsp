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
        <label for="exampleInputEmail1">Email address</label>
        <input:input path="userName" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"/>
        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input:input path="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
    </div>
    <div class="form-group">
        <label for="inputState">Country</label>
        <form:select path="country" id="inputState" class="form-control">
            <option:option value="Egypt">Egypt</option:option>
            <option:option value="USA">USA</option:option>
            <option:option value="Brazile">Brazile</option:option>
        </form:select>
    </div
                     <div class="form-group mb-3">
                     <label>Preferred Programming Language</label><br>
                          Java <form:radiobutton path="programmingLanguage" value="Java" />
                            C# <form:radiobutton path="programmingLanguage" value="C#" />
                            PHP <form:radiobutton path="programmingLanguage" value="PHP" />
                            Ruby <form:radiobutton path="programmingLanguage" value="Ruby" />
                        </div>


                        <div class="form-group mb-3">
                            <label>Preferred Operating System</label><br>
                            Linux <form:checkbox path="operatingSystem" value="Linux" />
                            Mac OS <form:checkbox path="operatingSystem" value="Mac OS" />
                            MS Windows <form:checkbox path="operatingSystem" value="MS Windows" />
                        </div>

                   <div class="form-group">
                     <input type="submit" class="btn btn-danger btn-danger " />
                   </div>



</form:form>
</body>
</html>
