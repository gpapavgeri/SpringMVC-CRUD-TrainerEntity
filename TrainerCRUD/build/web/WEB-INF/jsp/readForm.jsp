<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Read Trainer Details</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    </head>
    <body>   
        <div class="container">
            <div id="logo"><h1 class="logo">Trainer</h1>
                <div class="box">
                    <a href="${pageContext.request.contextPath}/index.htm">Options</a>
                </div>
            </div>
            <div class="leftbox">
            </div>
            <div class="rightbox">
                <div class="trainer">
                    <h1>List of Trainers</h1>
                    <table class="table">
                        <thead>
                        <th class="firstRow">First Name</th>
                        <th class="firstRow">Last Name</th>
                        <th class="firstRow">Subject</th>
                        <th class="firstRow">Delete</th>
                        <th class="firstRow">Update</th>
                        </thead>
                        <c:forEach items="${mylist}" var="t"> 
                            <tbody>
                                <tr>
                                    <td>${t.firstName}</td>
                                    <td>${t.lastName}</td>
                                    <td>${t.subject}</td>           
                                    <td><a class="button" href="${pageContext.request.contextPath}/trainer/delete.htm?id=${t.idTrainer}">Delete</a></td>         
                                    <td><a class="button" href="${pageContext.request.contextPath}/trainer/update.htm?id=${t.idTrainer}">Update</a></td>                                       
                                </tr> 
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>

