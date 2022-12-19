<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <body>

        <h2>Dear Employee, you are WELCOME!</h2>

        Your name: ${employee.name}<br>

        Your surname: ${employee.surname}<br>

        Your salary: ${employee.salary}<br>

        Your department: ${employee.department}<br>

        Your phone number: ${employee.phoneNumber}<br>

        Your email ${employee.email}<br>

        You laptop: ${employee.laptop}<br>

        Languages(s):
        <ul>
            <c:forEach var="lang" items="${employee.languages}">
                <li>${lang}</li>
            </c:forEach>
        </ul>

    </body>

</html>