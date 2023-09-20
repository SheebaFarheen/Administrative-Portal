<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Administrative-Portal - Classes</title>
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

        .class-card {
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
        <h2>Subjects</h2>
    </header>
   <div class="class-card">
            <h3>Mathematics Class</h3>
            <p>Class ID: MATH101</p>
            <p>Teacher: Mr. Smith</p>
            <p>Room: 203</p>
        </div>

        <div class="class-card">
            <h3>Science Class</h3>
            <p>Class ID: SCIENCE202</p>
            <p>Teacher: Mrs. Johnson</p>
            <p>Room: 301</p>
        </div>

	
<div id="page">
		<jsp:include page="left-list.jsp" />

		<div id="wrapper">

			<div id="header">
				<h3>Classes</h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>

						<th>Section</th>
						<th>Subject</th>
						<th>Teacher</th>
						<th>Time</th>
						<th>List of Students</th>

					</tr>

					<c:forEach var="tempClass" items="${CLASSES_LIST }">
						<tr>

							<c:url var="tempLink" value="AdminControllerServlet">
								<c:param name="command" value="ST_LIST" />
								<c:param name="classId" value="${tempClass.id }" />
								<c:param name="section" value="${tempClass.section }" />
								<c:param name="subject" value="${tempClass.subject }" />
							</c:url>

							<td>${tempClass.section}</td>
							<td>${tempClass.subject}</td>
							<td>${tempClass.teacher}</td>
							<td>${tempClass.time}</td>
							<td><a href="${tempLink }">List</a></td>
 




						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>


    
        
    
</body>
</html>