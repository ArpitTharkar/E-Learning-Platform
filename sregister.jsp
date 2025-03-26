<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        text-align: center;
        background-color: #f4f4f4;
    }
    .navbar {
        background-color: #004080;
        overflow: hidden;
        padding: 15px 0;
        position: fixed;
        width: 100%;
        top: 0;
        left: 0;
        z-index: 1000;
    }
    .navbar a {
        color: white;
        text-decoration: none;
        padding: 14px 25px;
        display: inline-block;
        font-size: 18px;
        font-weight: bold;
    }
    .navbar a:hover {
        background-color: #0059b3;
        border-radius: 5px;
    }
    .container {
        margin: 100px auto 50px;
        padding: 20px;
        background: white;
        border-radius: 10px;
        display: inline-block;
        box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);
        width: 50%;
        overflow-y: auto;
        max-height: 70vh;
    }
    h1 {
        color: #333;
        font-size: 32px;
    }
    h2 {
        color: #666;
        font-size: 20px;
        margin-bottom: 30px;
    }
    form {
        text-align: left;
        max-width: 400px;
        margin: 0 auto;
    }
    input {
        width: 100%;
        padding: 10px;
        margin: 5px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    input[type="submit"] {
        background-color: #28a745;
        color: white;
        font-size: 18px;
        cursor: pointer;
        border: none;
    }
    input[type="submit"]:hover {
        background-color: #218838;
    }
    .footer {
        background-color: #333;
        color: white;
        padding: 15px;
        position: fixed;
        bottom: 0;
        width: 100%;
        font-size: 16px;
    }
</style>
</head>
<body>
    <div class="navbar">
        <a href="first.jsp">Home</a>
        <a href="slogin.jsp">Student Login</a>
        <a href="tlogin.jsp">Teacher Login</a>
        <a href="about.jsp">About Us</a>
    </div>
    
    <div class="container">
        <h1>Student Registration</h1>
        <h2>Register now to access high-quality courses and enhance your learning experience.</h2>
        
        <form action="sRegister" method="post">
            First Name: <input type="text" name="Fsname" required> <br><br>
            Last Name: <input type="text" name="Lsname" required> <br><br>
            Email: <input type="email" name="semail" required> <br><br>
            Phone: <input type="number" name="sphone" required> <br><br>
            Class: <input type="text" name="Classr" required> <br><br>
            Password: <input type="password" name="spassword" required> <br><br>
            Confirm Password: <input type="password" name="scpassword" required> <br><br>
            <input type="submit" value="Register">
        </form>
        <br>
        <a href="tregister.jsp">Teacher Registration</a> | 
        <a href="first.jsp">Home Page</a>
    </div>
    
    <div class="footer">
        &copy; 2025 E-Learning Platform. All rights reserved.
    </div>
</body>
</html>
