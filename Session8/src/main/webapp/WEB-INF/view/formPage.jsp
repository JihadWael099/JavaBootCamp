<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Styled Form</title>

    <!-- Link to custom stylesheet -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

</head>
<%--<body class="bg-light">--%>
<%--<div class="container mt-5">--%>
<%--    <div class="row justify-content-center">--%>
<%--        <div class="col-md-6">--%>
<%--            <h2 class="text-center mb-4">User Form</h2>--%>
<%--            <form:form action="processForm" modelAttribute="userModel" class="p-4 border rounded bg-white shadow-sm">--%>

<%--                <!-- Username Input -->--%>
<%--                <div class="form-group mb-3">--%>
<%--                    <form:input type="text" placeholder="Username" path="userName" class="form-control" />--%>
<%--                </div>--%>

<%--                <!-- Password Input -->--%>
<%--                <div class="form-group mb-3">--%>
<%--                    <form:input type="password" placeholder="Password" path="password" class="form-control" />--%>
<%--                </div>--%>

<%--                <!-- Country Dropdown -->--%>
<%--                <div class="form-group mb-3">--%>
<%--                    <form:select path="country" class="form-control">--%>
<%--                        <form:option value="Egypt" label="Egypt" />--%>
<%--                        <form:option value="Brazil" label="Brazil" />--%>
<%--                        <form:option value="Saudia Arabia" label="KSA" />--%>
<%--                    </form:select>--%>
<%--                </div>--%>

<%--                <!-- Programming Language Radio Buttons -->--%>
<%--                <div class="form-group mb-3">--%>
<%--                    <label>Preferred Programming Language</label><br>--%>
<%--                    Java <form:radiobutton path="programmingLanguage" value="Java" />--%>
<%--                    C# <form:radiobutton path="programmingLanguage" value="C#" />--%>
<%--                    PHP <form:radiobutton path="programmingLanguage" value="PHP" />--%>
<%--                    Ruby <form:radiobutton path="programmingLanguage" value="Ruby" />--%>
<%--                </div>--%>

<%--                <!-- Operating System Checkboxes -->--%>
<%--                <div class="form-group mb-3">--%>
<%--                    <label>Preferred Operating System</label><br>--%>
<%--                    Linux <form:checkbox path="operatingSystem" value="Linux" />--%>
<%--                    Mac OS <form:checkbox path="operatingSystem" value="Mac OS" />--%>
<%--                    MS Windows <form:checkbox path="operatingSystem" value="MS Windows" />--%>
<%--                </div>--%>

<%--                <!-- Submit Button -->--%>
<%--                <div class="form-group">--%>
<%--                    <input type="submit" class="btn btn-danger btn-block" />--%>
<%--                </div>--%>
<%--            </form:form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<%--</body>--%>
<div class="container mt-3">
    <h2>Stacked form</h2>
    <form:form action="processForm" modelAttribute="userModel">
        <div class="mb-3 mt-3">
            <label for="year">Year</label>
            <input:input type="text" class="form-control" id="year" placeholder="Enter year" name="year" path="year">
        </div>
        <div class="mb-3">
            <label for="month">month</label>
            <input:input type="text" class="form-control" id="month" placeholder="Enter month" name="month" path="month">
        </div>
        <div class="mb-3">
            <label for="day">Day</label>
            <input:input type="text" class="form-control" id="day" placeholder="Enter day" name="day" path="day">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>
</html>
