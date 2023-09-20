<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learners Academy - Subjects</title>
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

        .subject-list {
            list-style-type: none;
            padding: 0;
        }

        .subject-list li {
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
        <h2>Subjects</h2>
    </header>

    <section>
        <ul class="subject-list">
            <li>
                <h3>Mathematics</h3>
                <p>Course Code: MATH101</p>
                <p>Teacher: Mr. Smith</p>
            </li>

            <li>
                <h3>Science</h3>
                <p>Course Code: SCIENCE202</p>
                <p>Teacher: Mrs. Johnson</p>
            </li>

           
        </ul>
    </section>

   
<div id="page">
<jsp:include page="left-list.jsp" />


		<div id="wrapper">

			<div id="header">
				<h3>Subjects</h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>

						<th>Name</th>
						<th>Shortcut</th>
						

					</tr>

					<c:forEach var="tempSubject" items="${SUBJECTS_LIST }">
						<tr>

							<td>${tempSubject.name}</td>
							<td>${tempSubject.shortcut}</td>
							

						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>

</body>
</html>