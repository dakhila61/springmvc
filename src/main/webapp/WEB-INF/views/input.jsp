<%--
  Created by IntelliJ IDEA.
  User: sowmy
  Date: 2/14/2024
  Time: 12:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page session="false"%>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>BMI Calculator</h1>

<P>Enter height(inches) and weight(lbs)</p>

<form action="bmi" method="post">
    <label>Height(in):</label>
    <input type="text" name="height"><br>
    <label>Weight(lb):</label>
    <input type="text" name="weight"><br>
    <input type="submit" value="Calculate">
</form>
</body>
</html>