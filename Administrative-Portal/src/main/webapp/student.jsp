<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learners Academy - Students</title>
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

        .student-card {
            border: 1px solid #ddd;
            background-color: #fff;
            padding: 20px;
            margin: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
    <header>
        <h1>Learners Academy</h1>
        <h2>Students</h2>
    </header>

    <section>
        <div class="student-card">
            <h3>John Doe</h3>
            <p>Student ID: S101</p>
            <p>Grade: 10th</p>
            <p>Contact: john.doe@example.com</p>
        </div>

        <div class="student-card">
            <h3>Jane Smith</h3>
            <p>Student ID: S102</p>
            <p>Grade: 11th</p>
            <p>Contact: jane.smith@example.com</p>
        </div>

        
    </section>

  
<div id="page" >
	<jsp:include page="left-list.jsp" />

	
		<div id="wrapper">

			<div id="header">
				<h3>Students of ${SUBJECT} class section ${SECTION} </h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>

						<th>First Name</th>
						<th>Last Name</th>
						<th>age</th>

					</tr>

					<c:forEach var="tempStudent" items="${STUDENTS_LIST}">
						<tr>

							<td>${tempStudent.fname}</td>
							<td>${tempStudent.lname}</td>
							<td>${tempStudent.age}</td>



						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>

</body>
</html>