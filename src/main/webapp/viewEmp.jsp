<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %> 
<!DOCTYPE html>
<html>
<head><title>View Employees</title></head>
<body>
    <h1>Employee List</h1>
    <table border="1" cellpadding="10">
        <tr><th>Name</th><th>Salary</th><th>Designation</th><th>Action</th></tr>
        <c:forEach items="${staffList}" var="emp">
            <tr>
                <td>${emp.name}</td>
                <td>${emp.salary}</td>
                <td>${emp.designation}</td>
                <td><a href="editForm.jsp?id=${emp.id}&name=${emp.name}&salary=${emp.salary}&designation=${emp.designation}">Edit</a></td>
            </tr>
        </c:forEach>
    </table>
    <br><a href="index.html">Home</a> | <a href="empForm.jsp">Add New</a>
</body>
</html>