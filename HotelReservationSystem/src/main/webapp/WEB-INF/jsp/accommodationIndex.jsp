<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accommodation Index Page</title>
<style>
        body {
            background-image: url('file:///D:/Anudipjava/Batch5904/SprintProject/Projectdb/src/main/webapp/WEB-INF/jsp/image.jpg')'; /* Replace with the path to your image */
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }
    </style>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container text-center mt-5 fade-in" >
            <div class="jumbotron">
            <h2>
<a href="/accommodation" class="btn btn-primary mr-3">New Accommodation Entry</a>
&nbsp; &nbsp;
<a href="/accommodations" class="btn btn-primary mr-3">Display All Accommodation</a>
<br><br>
<a href="/admin" class="btn btn-primary mr-3">Back</a>
</h2>
</div>
</div>
</body>
</html>