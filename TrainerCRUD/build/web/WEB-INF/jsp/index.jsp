<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainer Options</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

    </head>

    <body>   
        <div class="container">
            <div id="logo"><h1 class="logo">Trainer</h1>
            </div>
            <div class="leftbox">
                <nav>
                    <a id="create"><i class="fa fa-user-plus"></i></a>
                    <a id="read"><i class="fa fa-window-restore"></i></a>
                    <a id="delete"><i class="fa fa-user-times"></i></a>
                    <a id="update"><i class="fa fa-cog"></i></a>
                </nav>
            </div>
            <div class="rightbox">
                <div class="trainer">
                    <h1>Options</h1>

                    <div class="options">
                        <a href="${pageContext.request.contextPath}/trainer/insert.htm">Create Trainer</a>
                    </div>

                    <div class="options">
                        <a href="${pageContext.request.contextPath}/trainer/getall.htm">Read Trainer Details</a>
                    </div>

                    <div class="options">
                        <a href="${pageContext.request.contextPath}/trainer/getall.htm">Delete Trainer</a>
                    </div>

                    <div class="options">
                        <a href="${pageContext.request.contextPath}/trainer/getall.htm">Update Trainer</a>
                    </div>

                </div>

            </div>
        </div>

    </body>
</html>
