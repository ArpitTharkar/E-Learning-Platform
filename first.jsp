<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>E-Learning Platform</title>
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
            margin: 40px;
        }
        h1 {
            color: #333;
            font-size: 36px;
        }
        h2 {
            color: #666;
            font-size: 22px;
            margin-bottom: 30px;
        }
        .buttons button {
            padding: 12px 25px;
            margin: 15px;
            font-size: 18px;
            cursor: pointer;
            border: none;
            border-radius: 8px;
            font-weight: bold;
            color: white;
            transition: 0.3s;
        }
        .buttons button:nth-child(1) { background-color: #28a745; }
        .buttons button:nth-child(2) { background-color: #17a2b8; }
        .buttons button:nth-child(3) { background-color: #ff9800; }
        .buttons button:nth-child(4) { background-color: #dc3545; }
        .buttons button:hover {
            opacity: 0.8;
        }
        .footer {
            background-color: #333;
            color: white;
            padding: 15px;
            position: absolute;
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
        <h1>Welcome to the E-Learning Platform</h1>
        <h2>Empower yourself with flexible, interactive learning. Our platform provides expert-designed courses, real-time assessments, and an engaging environment for students and teachers.</h2>
        
        <div class="buttons">
            <button onclick="location.href='sregister.jsp'">Student Registration</button>
            <button onclick="location.href='slogin.jsp'">Student Login</button>
            <button onclick="location.href='register.jsp'">Teacher Registration</button>
            <button onclick="location.href='tlogin.jsp'">Teacher Login</button>
        </div>
    </div>
    
    <div class="footer">
        &copy; 2025 E-Learning Platform. All rights reserved.
    </div>
</body>
</html>
