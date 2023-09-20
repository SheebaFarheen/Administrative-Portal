<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learners Academy - Teachers</title>
    <style>
        /* Define your CSS styles here */
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #007BFF;
            color: white;
            text-align: center;
            padding: 10px;
        }

        h1 {
            margin: 0;
        }

        .teacher-list {
            list-style-type: none;
            padding: 0;
        }

        .teacher-list li {
            background-color: #fff;
            border: 1px solid #ddd;
            margin: 10px;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
    <header>
        <h1>Learners Academy</h1>
        <h2>Teachers</h2>
    </header>

    <section>
        <ul class="teacher-list">
            <li>
                <h3>Mr. John Doe</h3>
                <p>Teacher ID: T101</p>
                <p>Subject: Mathematics</p>
            </li>

            <li>
                <h3>Mrs. Jane Smith</h3>
                <p>Teacher ID: T102</p>
                <p>Subject: Science</p>
            </li>

           
        </ul>
    </section>

    
</body>
</html>