<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Trainer</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    </head>
    <body>   
        <div class="container">
            <div id="logo"><h1 class="logo">Trainer</h1>
                <div class="box">
                </div>
            </div>
            <div class="leftbox">
            </div>
            <div class="rightbox">
                <div class="trainer">
                    <h1>Update Trainer</h1>
                    <spring:form modelAttribute="trainer" action="submitUpdate.htm" method="post">
                        <table>
                            <tr>
                                <td><spring:hidden path="idTrainer"></spring:hidden></td>
                                </tr>
                                <tr>
                                    <td><spring:label path="firstName" class="label">First Name:</spring:label></td>
                                <td><spring:input path="firstName"></spring:input></td>
                                </tr>
                                <tr>
                                    <td><spring:label path="lastName" class="label">Last Name:</spring:label></td>
                                <td><spring:input path="lastName"></spring:input></td>
                                </tr>
                                <tr>
                                    <td><spring:label path="subject" class="label">Subject:</spring:label></td>
                                <td><spring:input path="subject"></spring:input></td>
                                </tr>
                            </table>
                            <input type="submit" value="Update" class="btn">
                    </spring:form>
                </div>
            </div>
        </div>
    </body>
</html>

